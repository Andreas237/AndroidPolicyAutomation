.class public Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;
.super Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;
.implements Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;
.implements Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment$PayMethodCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$SetCardDefaultCallbackImpl;,
        Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;
    }
.end annotation


# static fields
.field protected static final EXTRA_KEY_CARD_AID:Ljava/lang/String; = "traffic_card_aid"

.field protected static final EXTRA_KEY_CARD_ISSUEMONEY:Ljava/lang/String; = "traffic_card_issuemoney"

.field protected static final EXTRA_KEY_CARD_ISSUERID:Ljava/lang/String; = "traffic_card_issuerId"

.field protected static final EXTRA_KEY_CARD_NAME:Ljava/lang/String; = "traffic_card_name"

.field protected static final EXTRA_KEY_CARD_PAYTYPEINFO:Ljava/lang/String; = "traffic_card_paytypeinfo"

.field protected static final EXTRA_KEY_CARD_PRODUCTD:Ljava/lang/String; = "traffic_card_productId"

.field protected static final EXTRA_KEY_CARD_REQUEST_ID:Ljava/lang/String; = "traffic_card_request_id"

.field private static final EXTRA_RESULT:Ljava/lang/String; = "intent.extra.RESULT"

.field private static FRAGMENT_TAG_SELECT:Ljava/lang/String; = null

.field private static final GET_PAY_TYPE_SCENE_CLICK_OPEN_CARD:I = 0x2

.field private static final GET_PAY_TYPE_SCENE_ENTRY_TO_ACTIVITY:I = 0x1

.field private static final HANDLER_EVENT_PAY_NOT_CONNECTED:I = 0x67

.field protected static final HANDLER_EVENT_PAY_RESULT:I = 0x65

.field protected static final HANDLER_EVENT_PAY_START:I = 0x64

.field private static final HANDLER_ONWINDOW_FOCUSCHANGED_WAIT:I = 0x68

.field private static final HANDLER_SHOW_OPEN_CARD_DIALOG:I = 0x6a

.field private static final HANDLE_CLOSE_GET_PAY_TYPE_RESULT:I = 0x6b

.field protected static final KEY_ENTERANCE:Ljava/lang/String; = "key_enterance"

.field private static final MAP_GZ:Ljava/lang/String; = "020"

.field private static final PACKAGE_NAME_WECHAT:Ljava/lang/String; = "com.tencent.mm"

.field protected static final RECHARGE_FAIL_REQUESTCODE:I = 0x69

.field private static final REQUEST_RESOLVE_ERROR:I = 0x66

.field private static final TAG:Ljava/lang/String; = "BindBusCardAddActivity"

.field private static threadPool:Ljava/util/concurrent/ExecutorService; = null


# instance fields
.field private final DEFAULT_MONET_SINGAL:Ljava/lang/String;

.field private aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

.field aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

.field private amountList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/egd;>;"
        }
    .end annotation
.end field

.field protected applyOrderProgressDialog:Lo/egn;

.field private autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

.field protected btnOpenCard:Lo/egd;

.field private connectionCallbacks:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

.field private connectionFailedListener:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

.field private dialogBuilder:Lo/egs$b;

.field protected entranceType:I

.field getPayTypeHandler:Landroid/os/Handler;

.field getPayTypeRunable:Ljava/lang/Runnable;

.field private getPayTypeScene:I

.field private isFinish:Z

.field private isFromWindow:Z

.field private isGetIssueCost:Z

.field private isGetPayTypeSuccess:Z

.field protected isMultiPayMode:Z

.field protected isSptHwOnline:Z

.field private isVirtualOpenCardType:Z

.field protected mBusCardDes:Landroid/widget/TextView;

.field protected mBusCardRes:Landroid/widget/ImageView;

.field protected mCardAid:Ljava/lang/String;

.field protected mCardName:Ljava/lang/String;

.field protected mCardRequestId:J

.field private mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

.field protected mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

.field protected mIssuerId:Ljava/lang/String;

.field private mMode:I

.field private mMoneyLabel:Ljava/lang/String;

.field private mNormalAmountTextColor:I

.field private mNoticeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;"
        }
    .end annotation
.end field

.field private mPayResult:Ljava/lang/String;

.field private mPayResultInt:I

.field private mProductCode:Ljava/lang/String;

.field private mResolvingError:Z

.field private mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

.field private mSelectPayType:I

.field private mSeletcedAmountTextColor:I

.field protected mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

.field protected mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

.field private noteDialog:Lo/egs;

.field private noticeLayout:Landroid/widget/RelativeLayout;

.field protected payAmount:D

.field protected payhandler:Landroid/os/Handler;

.field private promotionInfoList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;>;"
        }
    .end annotation
.end field

.field protected rechargeAmount:D

.field private rechargeWidth:I

.field private runnable:Ljava/lang/Runnable;

.field protected textChargeAmount:Landroid/widget/TextView;

.field protected textOpenAmount:Landroid/widget/TextView;

.field protected textPayAmount:Landroid/widget/TextView;

.field protected textStdOpenAmount:Landroid/widget/TextView;

.field protected trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 312
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->threadPool:Ljava/util/concurrent/ExecutorService;

    .line 337
    const-string v0, "select_fragment_bind"

    sput-object v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->FRAGMENT_TAG_SELECT:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 112
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;-><init>()V

    .line 276
    const-string v0, "_._"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->DEFAULT_MONET_SINGAL:Ljava/lang/String;

    .line 285
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mResolvingError:Z

    .line 305
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    .line 318
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dialogBuilder:Lo/egs$b;

    .line 319
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noteDialog:Lo/egs;

    .line 327
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMode:I

    .line 331
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFinish:Z

    .line 332
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFromWindow:Z

    .line 346
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isGetPayTypeSuccess:Z

    .line 361
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    .line 377
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getPayTypeScene:I

    .line 382
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isSptHwOnline:Z

    .line 398
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->connectionCallbacks:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    .line 410
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->connectionFailedListener:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    .line 894
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;

    invoke-direct {v0, p0, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$MyHandler;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    .line 1466
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

    .line 1559
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$9;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getPayTypeRunable:Ljava/lang/Runnable;

    .line 1581
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$10;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getPayTypeHandler:Landroid/os/Handler;

    .line 1606
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$11;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$11;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->runnable:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Lcom/huawei/hms/api/HuaweiApiClient;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Z
    .locals 1

    .line 112
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mResolvingError:Z

    return v0
.end method

.method static synthetic access$1000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->stopLocation()V

    return-void
.end method

.method static synthetic access$102(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Z)Z
    .locals 0

    .line 112
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mResolvingError:Z

    return p1
.end method

.method static synthetic access$1100(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)I
    .locals 1

    .line 112
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMode:I

    return v0
.end method

.method static synthetic access$1200(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->promotionInfoList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$1302(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->promotionInfoList:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic access$1402(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Z)Z
    .locals 0

    .line 112
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isGetPayTypeSuccess:Z

    return p1
.end method

.method static synthetic access$1500(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)I
    .locals 1

    .line 112
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getPayTypeScene:I

    return v0
.end method

.method static synthetic access$1600(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showNoteHwidRunBackDialog()V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Lo/egn;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Lo/egn;)V
    .locals 0

    .line 112
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dismissProgress(Lo/egn;)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onWindowFocusChangedWait()V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Lo/egn;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Lo/egn;)V
    .locals 0

    .line 112
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dismissProgress(Lo/egn;)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onClickOpenCardButton()V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Ljava/lang/Runnable;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->runnable:Ljava/lang/Runnable;

    return-object v0
.end method

.method private bindViews()V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1335
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mBusCardRes:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getCardIcon()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1336
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getProductDesc()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1337
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mBusCardDes:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 1339
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mBusCardDes:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getProductDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1342
    :goto_0
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notice mTrafficCardInfo.getIssuerCardSupport() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getIssuerCardSupport()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1343
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getIssuerCardSupport()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1345
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->btnOpenCard:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 1349
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    iget-object v4, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->issueAmounts:Ljava/util/List;

    .line 1350
    if-eqz v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1352
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 1353
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_2

    .line 1354
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getPayMoney()D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    .line 1355
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bindViews, amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1356
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 1357
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setTag(Ljava/lang/Object;)V

    .line 1358
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 1361
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 1362
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->rechargeWidth:I

    iput v0, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1363
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    invoke-virtual {v0, v8}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1353
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1

    .line 1366
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    invoke-virtual {v0}, Lo/egd;->callOnClick()Z

    .line 1368
    :cond_3
    return-void
.end method

.method private cardEventTopUp()V
    .locals 3

    .line 1291
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1292
    invoke-static {p0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v2

    .line 1293
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 1294
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1295
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$6;

    invoke-direct {v1, p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$6;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1300
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 1305
    :cond_0
    return-void
.end method

.method private fmPay()V
    .locals 9

    .line 732
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fmPay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 734
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 735
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 736
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFinish:Z

    .line 737
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFromWindow:Z

    .line 739
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    const-string v1, "com.tencent.mm"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/PackageUtil;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 740
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSelectedWXPay wei xin is not AppInstalled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_wechat_pay_err_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showErrorDialog(Ljava/lang/String;)V

    .line 742
    return-void

    .line 746
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->applyOrderProgressDialog:Lo/egn;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 747
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->rechargeAmount:D

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x3

    .line 749
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-wide v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payAmount:D

    move v4, v8

    iget-object v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mProductCode:Ljava/lang/String;

    move-object v7, p0

    const/4 v5, 0x2

    invoke-interface/range {v0 .. v7}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->applyPayOrder(Ljava/lang/String;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V

    .line 750
    return-void
.end method

.method private getPositionByMobileNet(I)V
    .locals 6

    .line 1453
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getPositionByMobileNet"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1454
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMode:I

    .line 1455
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/amap/api/location/LocationManagerProxy;->getInstance(Landroid/content/Context;)Lcom/amap/api/location/LocationManagerProxy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    .line 1456
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1457
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "aMapLocManager is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1458
    return-void

    .line 1460
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->runnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1461
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->runnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1462
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    const-string v1, "lbs"

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

    const-wide/16 v2, 0xc8

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-virtual/range {v0 .. v5}, Lcom/amap/api/location/LocationManagerProxy;->requestLocationData(Ljava/lang/String;JFLcom/amap/api/location/AMapLocationListener;)V

    .line 1463
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave getPositionByMobileNet"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1464
    return-void
.end method

.method private goIntoWebview(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1659
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1661
    :cond_0
    const-string v0, "BindBusCardAddActivity goIntoWebview, title or url is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1662
    return-void

    .line 1666
    :cond_1
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1667
    const-class v0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1668
    const-string v0, "title"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1669
    const-string v0, "intent_bundle_url"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1670
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1675
    goto :goto_0

    .line 1672
    :catch_0
    move-exception v1

    .line 1674
    const-string v0, "BusCard add goInto notice failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1676
    :goto_0
    return-void
.end method

.method private initParams()Z
    .locals 4

    .line 574
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 575
    if-nez v3, :cond_0

    .line 576
    const-string v0, "initParams, intent == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 577
    const/4 v0, 0x0

    return v0

    .line 579
    :cond_0
    const-string v0, "key_enterance"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    .line 580
    const-string v0, "traffic_card_issuerId"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    .line 581
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 582
    const-string v0, "initParams, illegal params"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 583
    const/4 v0, 0x0

    return v0

    .line 585
    :cond_1
    const-string v0, "traffic_card_request_id"

    const-wide/16 v1, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardRequestId:J

    .line 586
    const-string v0, "traffic_card_name"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardName:Ljava/lang/String;

    .line 587
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->threadPool:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getPayTypeRunable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 588
    const/4 v0, 0x1

    return v0
.end method

.method private jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZZ)V
    .locals 5

    .line 1199
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1200
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 1201
    const-string v0, "fail_desc"

    invoke-virtual {v4, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1202
    const-string v0, "fail_reason"

    invoke-virtual {v4, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1203
    const-string v0, "opr_type"

    invoke-virtual {v4, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1204
    const-string v0, "issuerId"

    invoke-virtual {v4, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1205
    const-string v0, "key_enterance"

    invoke-virtual {v4, v0, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1206
    const-string v0, "card_request_id"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardRequestId:J

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1207
    const-string v0, "card_name"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardName:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1208
    const-string v0, "card_aid"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardAid:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1209
    const-string v0, "need_retry"

    invoke-virtual {v4, v0, p6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1210
    const-string v0, "open_card"

    invoke-virtual {v4, v0, p7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1211
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1212
    invoke-virtual {p0, v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->startActivity(Landroid/content/Intent;)V

    .line 1213
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 1214
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->setResult(I)V

    .line 1215
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->finish()V

    .line 1218
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p3, :cond_1

    .line 1219
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->setResult(I)V

    .line 1220
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->finish()V

    .line 1222
    :cond_1
    return-void
.end method

.method private onClickOpenCardButton()V
    .locals 6

    .line 620
    invoke-static {}, Lcom/huawei/nfc/carrera/ui/bus/util/TimeUtil;->isFastDoubleClick()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 621
    const-string v0, "onClick, isFastDoubleClick"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 622
    return-void

    .line 624
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isGetIssueCost:Z

    if-nez v0, :cond_1

    .line 625
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_no_net_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showToast(I)V

    .line 626
    return-void

    .line 628
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0x14

    if-ne v1, v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isGetPayTypeSuccess:Z

    if-nez v0, :cond_2

    .line 630
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 632
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getPayTypeScene:I

    .line 633
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->threadPool:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getPayTypeRunable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 634
    return-void

    .line 638
    :cond_2
    const-string v0, "t_ls_beijing"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "t_hg_beijing_mot"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 639
    :cond_3
    const-string v0, "onClick, open BEIJING"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 641
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardBeiJingActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 642
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 643
    const-string v0, "traffic_card_issuerId"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    const-string v0, "traffic_card_request_id"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardRequestId:J

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 645
    const-string v0, "traffic_card_aid"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 646
    const-string v0, "traffic_card_name"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 647
    const-string v0, "traffic_card_issuemoney"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 648
    const-string v0, "traffic_card_paytypeinfo"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 649
    const-string v0, "key_enterance"

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 650
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 651
    invoke-virtual {p0, v4}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->startActivity(Landroid/content/Intent;)V

    .line 652
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->finish()V

    .line 653
    goto :goto_0

    .line 654
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->applyIssueOrder()V

    .line 656
    :goto_0
    return-void
.end method

.method private onSelectHWPay()V
    .locals 12

    .line 681
    const-string v0, "onClick, onSelectHWPay"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 683
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->applyOrderProgressDialog:Lo/egn;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 684
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->rechargeAmount:D

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x3

    .line 687
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0x14

    if-ne v1, v0, :cond_2

    .line 688
    const-string v0, "enter huaweipay"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 689
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v9

    .line 690
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueStdMoney()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v10

    .line 691
    if-gez v9, :cond_1

    move v0, v10

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    move v9, v0

    .line 692
    new-instance v11, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payAmount:D

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {v11, v8, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;-><init>(III)V

    .line 693
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->setPayType(I)V

    .line 694
    invoke-virtual {v11, v9, v10}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->setIssuePayment(II)V

    .line 695
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->rechargeAmount:D

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getRechargeMoney()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v11, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->setRechargePayment(II)V

    .line 696
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1, v11, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->applyPayOrder(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V

    .line 697
    goto :goto_2

    .line 698
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-wide v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payAmount:D

    move v4, v8

    iget-object v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mProductCode:Ljava/lang/String;

    move-object v7, p0

    const/4 v5, 0x1

    invoke-interface/range {v0 .. v7}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->applyPayOrder(Ljava/lang/String;DIILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V

    .line 700
    :goto_2
    return-void
.end method

.method private onSelectedWXPay()V
    .locals 9

    .line 702
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSelectedWXPay"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 703
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->isWxPaySupport()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0xe

    if-ne v1, v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 704
    :goto_0
    if-eqz v4, :cond_1

    .line 705
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->fmPay()V

    .line 706
    return-void

    .line 708
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    const-string v1, "com.tencent.mm"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/PackageUtil;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 709
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSelectedWXPay wei xin is not AppInstalled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_wechat_pay_err_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showErrorDialog(Ljava/lang/String;)V

    .line 711
    return-void

    .line 715
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->applyOrderProgressDialog:Lo/egn;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 716
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->rechargeAmount:D

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x3

    .line 718
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v6

    .line 719
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueStdMoney()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v7

    .line 720
    if-gez v6, :cond_4

    move v0, v7

    goto :goto_2

    :cond_4
    move v0, v6

    :goto_2
    move v6, v0

    .line 721
    new-instance v8, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;

    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payAmount:D

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {v8, v5, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;-><init>(III)V

    .line 722
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->setPayType(I)V

    .line 723
    invoke-virtual {v8, v6, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->setIssuePayment(II)V

    .line 724
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->rechargeAmount:D

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getRechargeMoney()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->setRechargePayment(II)V

    .line 725
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1, v8, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->applyPayOrder(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;)V

    .line 726
    return-void
.end method

.method private onWindowFocusChangedWait()V
    .locals 5

    .line 1549
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->isRequest()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1550
    :goto_0
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter onWindowFocusChangedWait : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1551
    if-eqz v4, :cond_1

    .line 1552
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFromWindow:Z

    .line 1553
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 1554
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFinish:Z

    .line 1555
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onSelectedWXPay()V

    .line 1557
    :cond_1
    return-void
.end method

.method private refreshIssueMoney(ILcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;)V
    .locals 9

    .line 781
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshIssueMoney,issueMoney="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",issueStdMoney="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueStdMoney()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",rechargeMoney="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getRechargeMoney()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",payMoney="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getPayMoney()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 782
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssueMoney:Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    .line 783
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 784
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 785
    invoke-virtual {v6}, Landroid/widget/TextView;->getId()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 786
    sget v0, Lcom/huawei/wallet/R$drawable;->nfc_buscard_recharge_bg:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 787
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSeletcedAmountTextColor:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 789
    :cond_0
    sget v0, Lcom/huawei/wallet/R$drawable;->nfc_buscard_recharge_normal_bg:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 790
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mNormalAmountTextColor:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 783
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 793
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v5

    .line 794
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueStdMoney()D

    move-result-wide v7

    .line 795
    const-wide/16 v0, 0x0

    cmpg-double v0, v5, v0

    if-gez v0, :cond_2

    .line 796
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isGetIssueCost:Z

    .line 797
    move-wide v5, v7

    goto :goto_2

    .line 799
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isGetIssueCost:Z

    .line 803
    :goto_2
    sub-double v0, v5, v7

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 804
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textStdOpenAmount:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 805
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textStdOpenAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMoneyLabel:Ljava/lang/String;

    invoke-static {v1, v7, v8}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->changeIntoDisplayMoney(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 807
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textStdOpenAmount:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFlags(I)V

    goto :goto_3

    .line 809
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textStdOpenAmount:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 812
    :goto_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getPayMoney()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payAmount:D

    .line 813
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payAmount:D

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v2

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->rechargeAmount:D

    .line 814
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textOpenAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getIssueMoney()D

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->changeIntoDisplayMoney(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 815
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textChargeAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getRechargeMoney()D

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->changeIntoDisplayMoney(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 816
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textPayAmount:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;->getPayMoney()D

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->changeIntoDisplayMoney(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 817
    return-void
.end method

.method private showDefaultView()V
    .locals 4

    .line 1374
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mBusCardRes:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->nfc_card_icon_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1376
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 1377
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_._"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 1376
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1380
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textOpenAmount:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_._"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1381
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textChargeAmount:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_._"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1382
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textPayAmount:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMoneyLabel:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_._"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1383
    return-void
.end method

.method private showNoNetDialog()V
    .locals 5

    .line 1389
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    .line 1390
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bus_no_net_dialog:I

    .line 1391
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_cvv_code_introduction_ok:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$7;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    .line 1392
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 1400
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 1401
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 1402
    invoke-virtual {v4}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1403
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 1405
    :cond_0
    return-void
.end method

.method private showNoteHwidRunBackDialog()V
    .locals 4

    .line 430
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showNoteHwidRunBackDialog:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    new-instance v0, Lo/egs$b;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egs$b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dialogBuilder:Lo/egs$b;

    .line 432
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dialogBuilder:Lo/egs$b;

    invoke-virtual {v0}, Lo/egs$b;->d()Lo/egs;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noteDialog:Lo/egs;

    .line 433
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noteDialog:Lo/egs;

    invoke-virtual {v0}, Lo/egs;->show()V

    .line 434
    return-void
.end method

.method private startBindBusCardSwitchActivity()V
    .locals 2

    .line 1438
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1439
    const/high16 v0, 0x10000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1440
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->startActivity(Landroid/content/Intent;)V

    .line 1441
    return-void
.end method

.method private startHWPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 7

    .line 908
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 909
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPayInfo()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v4

    .line 910
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->makePayReq()Lcom/huawei/hms/support/api/entity/pay/PayReq;

    move-result-object v5

    .line 911
    const-string v0, "BindBusCardAddActivity"

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

    .line 913
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 914
    sget-object v0, Lcom/huawei/hms/support/api/pay/HuaweiPay;->HuaweiPayApi:Lcom/huawei/hms/support/api/pay/HuaweiPayApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-interface {v0, v1, v5}, Lcom/huawei/hms/support/api/pay/HuaweiPayApi;->pay(Lcom/huawei/hms/api/HuaweiApiClient;Lcom/huawei/hms/support/api/entity/pay/PayReq;)Lcom/huawei/hms/support/api/client/PendingResult;

    move-result-object v6

    .line 915
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$5;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    invoke-virtual {v6, v0}, Lcom/huawei/hms/support/api/client/PendingResult;->setResultCallback(Lcom/huawei/hms/support/api/client/ResultCallback;)V

    .line 934
    goto :goto_0

    .line 935
    :cond_0
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Connect failed, please connect first."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 938
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 940
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0, p0}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    .line 942
    :goto_0
    return-void
.end method

.method private startWXPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 3

    .line 897
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getWxPayInfo()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->pay(Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;Lcom/huawei/nfc/carrera/logic/wxpay/WXPayCallback;)Z

    move-result v2

    .line 898
    if-nez v2, :cond_0

    .line 899
    const-string v0, "applyIssueOrderCallback, wxpay is fail"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 900
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 902
    :cond_0
    return-void
.end method

.method private stopLocation()V
    .locals 4

    .line 1621
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter stopLocation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1623
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    if-eqz v0, :cond_0

    .line 1624
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

    invoke-virtual {v0, v1}, Lcom/amap/api/location/LocationManagerProxy;->removeUpdates(Lcom/amap/api/location/AMapLocationListener;)V

    .line 1625
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    invoke-virtual {v0}, Lcom/amap/api/location/LocationManagerProxy;->destroy()V

    .line 1627
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->aMapLocManager:Lcom/amap/api/location/LocationManagerProxy;

    .line 1628
    return-void
.end method


# virtual methods
.method protected applyIssueOrder()V
    .locals 3

    .line 662
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->isWxPaySupport()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0xe

    if-ne v1, v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 663
    :goto_0
    if-eqz v2, :cond_1

    .line 664
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->fmPay()V

    .line 665
    return-void

    .line 667
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0xe

    if-ne v1, v0, :cond_2

    const-string v0, "t_sh_01"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    .line 668
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0x14

    if-ne v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->getPrePaytypes()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isMultiPayMode:Z

    .line 670
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isMultiPayMode:Z

    if-eqz v0, :cond_5

    .line 671
    const-string v0, "applyIssueOrder isMultiPayMode is ok"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 672
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->requestShOrder()V

    .line 673
    return-void

    .line 675
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onClick, recharge card isSh : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; isMultiPayMode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isMultiPayMode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 676
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onSelectHWPay()V

    .line 678
    return-void
.end method

.method public applyPayOrderCallback(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 3

    .line 821
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isVisible:Z

    if-nez v0, :cond_2

    .line 822
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->applyOrderProgressDialog:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dismissProgress(Lo/egn;)V

    .line 823
    const-string v0, "applyIssueOrderCallback, no need to handle callback"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 824
    return-void

    .line 827
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->applyOrderProgressDialog:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dismissProgress(Lo/egn;)V

    .line 828
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

    .line 829
    const/4 v0, 0x0

    if-ne v0, p1, :cond_6

    if-eqz p2, :cond_6

    .line 830
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 832
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getHasUnusedIssueOrder()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 833
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgressDialog()V

    .line 834
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->issueTrafficCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V

    .line 836
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->reportCardOpened()V

    goto/16 :goto_0

    .line 837
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->isDuplicateApply()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 839
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgressDialog()V

    .line 841
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->rechargeAmount:D

    .line 842
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V

    goto :goto_0

    .line 843
    :cond_4
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFromWindow:Z

    if-eqz v0, :cond_5

    .line 844
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFromWindow:Z

    .line 845
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onWXPayCancel()V

    goto :goto_0

    .line 847
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 850
    :cond_6
    const/4 v0, 0x1

    if-eq v0, p1, :cond_7

    const/16 v0, 0xa

    if-eq v0, p1, :cond_7

    const/16 v0, 0x17

    if-eq v0, p1, :cond_7

    const/16 v0, 0x18

    if-eq v0, p1, :cond_7

    const/16 v0, 0x19

    if-eq v0, p1, :cond_7

    const/16 v0, 0x63

    if-ne v0, p1, :cond_8

    .line 856
    :cond_7
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "applyIssueOrderCallback, apply failed"

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 858
    :cond_8
    const-string v0, "applyIssueOrderCallback, apply failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 859
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showErrorDialog(Ljava/lang/String;)V

    .line 861
    :goto_0
    return-void
.end method

.method protected getErrorMessage(I)Ljava/lang/String;
    .locals 2

    .line 1231
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->getCommonErrorMessage(I)Ljava/lang/String;

    move-result-object v1

    .line 1232
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 1233
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 1236
    :sswitch_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_create_order_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1239
    :sswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_out_of_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1243
    :sswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_get_city_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1246
    :sswitch_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_return_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1249
    :sswitch_4
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_sold_out:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1252
    :sswitch_5
    sget v0, Lcom/huawei/wallet/R$string;->nfc_ssd_install_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1255
    :sswitch_6
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1258
    :goto_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_return_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1261
    :cond_0
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x3f0 -> :sswitch_2
        0x3f1 -> :sswitch_4
        0x3f2 -> :sswitch_1
        0x44d -> :sswitch_6
        0x44e -> :sswitch_3
        0x44f -> :sswitch_2
        0x450 -> :sswitch_5
    .end sparse-switch
.end method

.method public init()V
    .locals 12

    .line 477
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->init()V

    .line 479
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_card_res:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mBusCardRes:Landroid/widget/ImageView;

    .line 480
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mBusCardRes:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->setCardImageSize(Landroid/widget/ImageView;)V

    .line 481
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_card_des:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mBusCardDes:Landroid/widget/TextView;

    .line 483
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    .line 484
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_1:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 485
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_2:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_3:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_4:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 488
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_5:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 489
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_6:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 491
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->amountList:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 490
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 495
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 496
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 497
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$dimen;->nfc_bus_recharge_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v6, v0

    .line 500
    mul-int/lit8 v0, v6, 0x6

    sub-int v0, v5, v0

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->rechargeWidth:I

    .line 502
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textChargeAmount:Landroid/widget/TextView;

    .line 503
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_open_card_amount_orginal:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textStdOpenAmount:Landroid/widget/TextView;

    .line 505
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_open_card_amount_real:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textOpenAmount:Landroid/widget/TextView;

    .line 506
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_pay_amount:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->textPayAmount:Landroid/widget/TextView;

    .line 508
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_open_card_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->btnOpenCard:Lo/egd;

    .line 509
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->btnOpenCard:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 513
    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->applyOrderProgressDialog:Lo/egn;

    .line 514
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->applyOrderProgressDialog:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCanceledOnTouchOutside(Z)V

    .line 516
    sget v0, Lcom/huawei/wallet/R$string;->nfc_money_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mMoneyLabel:Ljava/lang/String;

    .line 517
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$color;->white:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSeletcedAmountTextColor:I

    .line 518
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$color;->add_bus_card_button_text_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mNormalAmountTextColor:I

    .line 520
    sget v0, Lcom/huawei/wallet/R$id;->rl_recharge_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noticeLayout:Landroid/widget/RelativeLayout;

    .line 521
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noticeLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 523
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noticeLayout:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/wallet/R$id;->astv_notice_content:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    .line 526
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$3;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    const/4 v3, 0x1

    invoke-virtual {p0, v0, v1, v3, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 533
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getNoticeIssueId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 534
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BindBusCardAddActivity noticeIssuerId =  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 535
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/PluginPayAdapter;

    .line 536
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 537
    const-string v0, "onCreate, null == pluginPayAdapter"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 538
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->finish()V

    goto/16 :goto_1

    .line 540
    :cond_1
    invoke-interface {v8}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceProtocol()I

    move-result v9

    .line 541
    const/4 v10, 0x1

    .line 542
    const/16 v0, 0xd

    if-ne v0, v9, :cond_2

    const-string v0, "90000028"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 543
    const-string v0, "nyx and beijing "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 544
    const/4 v10, 0x3

    .line 547
    :cond_2
    invoke-static {p0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v11

    .line 548
    const/4 v0, 0x0

    if-eq v0, v11, :cond_3

    const-string v0, "5943542E55534552"

    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 549
    const-string v0, "nyx and lingnantong "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 550
    const/4 v10, 0x1

    .line 551
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->btnOpenCard:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_sure_open:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 553
    invoke-direct {p0, v10}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getPositionByMobileNet(I)V

    .line 555
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    const-string v1, "2"

    invoke-interface {v0, v7, v1, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryCardNotice(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V

    .line 556
    return-void

    .line 559
    :cond_3
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 560
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    const-string v2, ""

    invoke-interface {v0, v1, v10, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 562
    const-string v0, "90000028"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 563
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->btnOpenCard:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_next_step:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 565
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->btnOpenCard:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_sure_open:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 570
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    const-string v1, "2"

    invoke-interface {v0, v7, v1, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryCardNotice(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V

    .line 571
    return-void
.end method

.method public initHMS()V
    .locals 2

    .line 391
    new-instance v0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/huawei/hms/support/api/pay/HuaweiPay;->PAY_API:Lcom/huawei/hms/api/Api;

    .line 392
    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addApi(Lcom/huawei/hms/api/Api;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->connectionCallbacks:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    .line 393
    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addConnectionCallbacks(Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->connectionFailedListener:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    .line 394
    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addOnConnectionFailedListener(Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    move-result-object v0

    .line 395
    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->build()Lcom/huawei/hms/api/HuaweiApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 396
    return-void
.end method

.method public issueTrafficCardCallback(I)V
    .locals 8

    .line 1152
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "installTrafficCardCallback resultCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1154
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 1156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "installTrafficCardCallback result success & save issuerid to sp , mIssuerId : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1158
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->rechargeAmount:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 1160
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->recharge(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;)V

    goto/16 :goto_0

    .line 1162
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    const-string v1, "0"

    const-string v2, ""

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1165
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dismissProgress(Lo/egn;)V

    .line 1166
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_success:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text:I

    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZZ)V

    goto/16 :goto_0

    .line 1171
    :cond_1
    const/16 v0, 0x44d

    if-ne p1, v0, :cond_2

    .line 1172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "issueTrafficCardCallback , Has opened the number of cards has reached the limit"

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dismissProgress(Lo/egn;)V

    .line 1175
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount:I

    .line 1176
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    .line 1175
    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZZ)V

    goto :goto_0

    .line 1179
    :cond_2
    const/4 v0, 0x1

    if-eq v0, p1, :cond_3

    const/16 v0, 0xa

    if-eq v0, p1, :cond_3

    const/16 v0, 0x17

    if-eq v0, p1, :cond_3

    const/16 v0, 0x18

    if-eq v0, p1, :cond_3

    const/16 v0, 0x19

    if-eq v0, p1, :cond_3

    const/16 v0, 0x63

    if-ne v0, p1, :cond_4

    .line 1185
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "issueTrafficCardCallback, issue Traffic Card fail"

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1188
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dismissProgress(Lo/egn;)V

    .line 1189
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    const/4 v3, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZZ)V

    .line 1192
    const-string v0, "installTrafficCardCallback, illegal resultCode"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1195
    :goto_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8

    .line 1073
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1075
    const/16 v0, 0x65

    if-ne v0, p1, :cond_5

    .line 1076
    const-string v4, "Payment failed"

    .line 1077
    sget-object v0, Lcom/huawei/hms/support/api/pay/HuaweiPay;->HuaweiPayApi:Lcom/huawei/hms/support/api/pay/HuaweiPayApi;

    invoke-interface {v0, p3}, Lcom/huawei/hms/support/api/pay/HuaweiPayApi;->getPayResultInfoFromIntent(Landroid/content/Intent;)Lcom/huawei/hms/support/api/pay/PayResultInfo;

    move-result-object v5

    .line 1078
    if-eqz v5, :cond_4

    .line 1079
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1080
    const-string v0, "returnCode"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1081
    const-string v0, "BindBusCardAddActivity"

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

    .line 1082
    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1083
    const-string v0, "returnCode"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1084
    const-string v0, "userName"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getUserName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1085
    const-string v0, "orderID"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getOrderID()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1086
    const-string v0, "amount"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getAmount()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1087
    const-string v0, "errMsg"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getErrMsg()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1088
    const-string v0, "time"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getTime()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1089
    const-string v0, "requestId"

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getRequestId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1090
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPayInfo()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v7

    .line 1091
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 1093
    const-string v4, "success, but payinfo is null"

    goto :goto_0

    .line 1095
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgressDialog()V

    .line 1096
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->issueTrafficCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V

    .line 1098
    :goto_0
    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v0

    const/16 v1, 0x7530

    if-ne v1, v0, :cond_2

    .line 1099
    const-string v4, "Payment is canceled."

    .line 1101
    const-string v0, "user canceled"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    goto :goto_1

    .line 1103
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    const-string v1, "1"

    const-string v2, "onActivityResult, pay failed"

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Payment failed, the ERROR CODE is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/hms/support/api/pay/PayResultInfo;->getReturnCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1105
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v0

    const/16 v1, 0xe

    if-ne v1, v0, :cond_3

    .line 1106
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_channel_pay_not_support_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showToast(I)V

    goto :goto_1

    .line 1108
    :cond_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_pay_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showToast(I)V

    .line 1112
    :cond_4
    :goto_1
    const-string v0, "BindBusCardAddActivity"

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

    .line 1113
    goto/16 :goto_3

    :cond_5
    const/16 v0, 0x66

    if-ne v0, p1, :cond_b

    .line 1114
    const-string v0, "BindBusCardAddActivity"

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

    .line 1115
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mResolvingError:Z

    .line 1116
    const/4 v0, -0x1

    if-ne p2, v0, :cond_a

    .line 1118
    const-string v0, "intent.extra.RESULT"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 1120
    if-nez v4, :cond_6

    .line 1121
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_9

    .line 1122
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0, p0}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    goto :goto_2

    .line 1124
    :cond_6
    const/16 v0, 0xd

    if-ne v4, v0, :cond_7

    .line 1125
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u89e3\u51b3\u9519\u8bef\u8fc7\u7a0b\u88ab\u7528\u6237\u53d6\u6d88"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 1126
    :cond_7
    const/16 v0, 0x8

    if-ne v4, v0, :cond_8

    .line 1127
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53d1\u751f\u5185\u90e8\u9519\u8bef\uff0c\u91cd\u8bd5\u53ef\u4ee5\u89e3\u51b3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 1130
    :cond_8
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u672a\u77e5\u8fd4\u56de\u7801"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1132
    :cond_9
    :goto_2
    goto :goto_3

    .line 1133
    :cond_a
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8c03\u7528\u89e3\u51b3\u65b9\u6848\u53d1\u751f\u9519\u8bef"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 1135
    :cond_b
    const/16 v0, 0x69

    if-ne v0, p1, :cond_c

    .line 1136
    const/4 v0, -0x1

    if-ne p2, v0, :cond_c

    .line 1138
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->setResult(I)V

    .line 1139
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->finish()V

    .line 1142
    :cond_c
    :goto_3
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 1426
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onBackPressed()V

    .line 1428
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->startBindBusCardSwitchActivity()V

    .line 1429
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 593
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 594
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_open_card_btn:I

    if-ne v0, v2, :cond_0

    .line 595
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onClickOpenCardButton()V

    goto/16 :goto_0

    .line 596
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_1:I

    if-eq v0, v2, :cond_1

    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_2:I

    if-eq v0, v2, :cond_1

    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_3:I

    if-eq v0, v2, :cond_1

    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_4:I

    if-eq v0, v2, :cond_1

    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_5:I

    if-eq v0, v2, :cond_1

    sget v0, Lcom/huawei/wallet/R$id;->add_buscard_activity_recharge_amount_6:I

    if-ne v0, v2, :cond_2

    .line 603
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;

    invoke-direct {p0, v2, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->refreshIssueMoney(ILcom/huawei/nfc/carrera/logic/cardinfo/model/IssueMoney;)V

    goto :goto_0

    .line 605
    :cond_2
    sget v0, Lcom/huawei/wallet/R$id;->rl_recharge_notice:I

    if-ne v0, v2, :cond_5

    .line 607
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->getCurrentPosition()I

    move-result v3

    .line 608
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mNoticeList:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 610
    if-ltz v3, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mNoticeList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v3, v0, :cond_4

    .line 611
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onClick position invalid "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 612
    return-void

    .line 614
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mNoticeList:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->getTitle()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mNoticeList:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;->getClickUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->goIntoWebview(Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    :cond_5
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 386
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 387
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onCreateInit()V

    .line 388
    return-void
.end method

.method protected onCreateInit()V
    .locals 1

    .line 462
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->setRequestedOrientation(I)V

    .line 463
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->setTitle(I)V

    .line 464
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_add_bus_card:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->setContentView(I)V

    .line 465
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 466
    const-string v0, "BindBusCardAddActivity, initParams failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 467
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->finish()V

    .line 468
    return-void

    .line 470
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->init()V

    .line 472
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showDefaultView()V

    .line 473
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1446
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onDestroy()V

    .line 1447
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1448
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1450
    :cond_0
    return-void
.end method

.method public onHomeRetrunArrowClick()V
    .locals 0

    .line 1433
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onHomeRetrunArrowClick()V

    .line 1435
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1534
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFinish:Z

    .line 1535
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onPause()V

    .line 1536
    return-void
.end method

.method public onSelectedCallback(I)V
    .locals 3

    .line 998
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 999
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 1000
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->setTitle(I)V

    .line 1003
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 1004
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->setRequest(Z)V

    .line 1005
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFinish:Z

    .line 1006
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFromWindow:Z

    .line 1008
    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 1009
    :goto_0
    if-nez v2, :cond_3

    .line 1010
    const-string v0, "onSelectedCallback paymethod is not ok"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1011
    return-void

    .line 1014
    :cond_3
    const/4 v0, 0x2

    if-ne v0, p1, :cond_4

    .line 1015
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onSelectedWXPay()V

    goto :goto_1

    .line 1016
    :cond_4
    const/4 v0, 0x1

    if-ne v0, p1, :cond_5

    .line 1017
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onSelectHWPay()V

    .line 1020
    :cond_5
    :goto_1
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 437
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onStart()V

    .line 438
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->initHMS()V

    .line 439
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 440
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    .line 441
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mHuaweiApiClient:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0, p0}, Lcom/huawei/hms/api/HuaweiApiClient;->connect(Landroid/app/Activity;)V

    goto :goto_0

    .line 444
    :cond_0
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHuaweiApiClient is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 446
    :cond_1
    :goto_0
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 453
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onStop()V

    .line 454
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noteDialog:Lo/egs;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 455
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noteDialog:Lo/egs;

    invoke-virtual {v0}, Lo/egs;->dismiss()V

    .line 456
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dialogBuilder:Lo/egs$b;

    .line 457
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noteDialog:Lo/egs;

    .line 459
    :cond_0
    return-void
.end method

.method public onWXPayCancel()V
    .locals 4

    .line 1527
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onWXPayCancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1528
    return-void
.end method

.method public onWXPayFail(I)V
    .locals 4

    .line 1519
    sget v0, Lcom/huawei/wallet/R$string;->pay_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showToast(I)V

    .line 1520
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user pay fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1521
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    const-string v1, "1"

    const-string v2, "onActivityResult, pay failed"

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1522
    return-void
.end method

.method public onWXPaySuccess()V
    .locals 4

    .line 1501
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user pay success isFromWindow : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFromWindow:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1502
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFromWindow:Z

    if-eqz v0, :cond_0

    .line 1503
    return-void

    .line 1505
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1506
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onWXPaySuccess: trafficOrder is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1507
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->onSelectedCallback(I)V

    goto :goto_0

    .line 1509
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    const/16 v1, 0x6a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1510
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->issueTrafficCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V

    .line 1513
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->reportCardOpened()V

    .line 1514
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 5

    .line 1540
    const-string v0, "BindBusCardAddActivity"

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

    .line 1541
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFinish:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->getInstance()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayManager;->isRequest()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1542
    :goto_0
    if-eqz v4, :cond_1

    .line 1543
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    const/16 v1, 0x68

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1545
    :cond_1
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onWindowFocusChanged(Z)V

    .line 1546
    return-void
.end method

.method public queryAndHandleUnfinishedOrderCallback(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 10

    .line 954
    if-eqz p1, :cond_0

    .line 956
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->destroyLoadingDialog()V

    .line 957
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardAid:Ljava/lang/String;

    iget v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    const/4 v3, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    .line 960
    return-void

    .line 963
    :cond_0
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 966
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->destroyLoadingDialog()V

    .line 967
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getIssueCardOrderCnt()I

    move-result v0

    if-lez v0, :cond_1

    .line 968
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_success:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    sget v3, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardAid:Ljava/lang/String;

    iget v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    .line 971
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v9

    .line 972
    invoke-interface {v9}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 973
    return-void

    .line 975
    :cond_1
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 976
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardAid:Ljava/lang/String;

    iget v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    .line 975
    const/4 v3, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    .line 980
    goto :goto_0

    .line 983
    :pswitch_1
    goto :goto_0

    .line 985
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->destroyLoadingDialog()V

    .line 986
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardAid:Ljava/lang/String;

    iget v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    const/4 v3, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    .line 989
    .line 994
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x2710
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public queryCardNoticeCallback(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;)V"
        }
    .end annotation

    .line 1633
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1635
    const-string v0, "dismissQueryCardNoticeCallbackProgress, activity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 1636
    return-void

    .line 1639
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 1640
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

    .line 1642
    if-nez v2, :cond_1

    .line 1644
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noticeLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1645
    return-void

    .line 1648
    :cond_1
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mNoticeList:Ljava/util/List;

    .line 1649
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->noticeLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1652
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setData(Ljava/util/List;)V

    .line 1653
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->startAutoRun()V

    .line 1655
    return-void
.end method

.method public queryTrafficCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)V
    .locals 2

    .line 1311
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryTrafficCardInfoCallback, resultCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1312
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1313
    const-string v0, "queryTrafficCardInfoCallback, activity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1314
    return-void

    .line 1316
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dismissProgress(Lo/egn;)V

    .line 1317
    if-nez p1, :cond_1

    if-nez p2, :cond_2

    .line 1318
    :cond_1
    const-string v0, "queryTrafficCardInfoCallback, query failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 1319
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showNoNetDialog()V

    .line 1321
    return-void

    .line 1324
    :cond_2
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    .line 1325
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryTrafficCardInfoCallback, mTrafficCardInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1326
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getAid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mCardAid:Ljava/lang/String;

    .line 1327
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getProductCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mProductCode:Ljava/lang/String;

    .line 1328
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getMode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPreMode(I)V

    .line 1329
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPrename(Ljava/lang/String;)V

    .line 1330
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->bindViews()V

    .line 1331
    return-void
.end method

.method public rechargeCallback(I)V
    .locals 8

    .line 1266
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1267
    return-void

    .line 1269
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->dismissProgress(Lo/egn;)V

    .line 1270
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "rechargeCallback, resultCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 1272
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 1273
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

    .line 1279
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "rechargeCallback, recharge failed"

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1281
    :cond_2
    const-string v0, "rechargeCallback, recharge failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 1283
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    const-string v1, "0"

    const-string v2, ""

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1284
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->cardEventTopUp()V

    .line 1286
    :goto_0
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_success:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text:I

    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->entranceType:I

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v7}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZZ)V

    .line 1288
    return-void
.end method

.method protected reportCardOpened()V
    .locals 3

    .line 1411
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    .line 1412
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getAid()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    .line 1413
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    .line 1411
    invoke-static {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpenAction(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1415
    return-void
.end method

.method protected requestShOrder()V
    .locals 4

    .line 757
    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_channel_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->setTitle(I)V

    .line 758
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 759
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payAmount:D

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPremount(D)V

    .line 760
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setPreOrderType(I)V

    .line 761
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isSptHwOnline:Z

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->setSptonline(Z)V

    .line 762
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mTrafficPaymentInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->newSelectPayMethodFragment(Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;)Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    .line 765
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 766
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$id;->bind_container:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    sget-object v3, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->FRAGMENT_TAG_SELECT:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    .line 767
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 769
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->isSptHwOnline:Z

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->setSptHwOnline(Z)V

    .line 770
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payAmount:D

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;->setPayAmount(D)V

    .line 771
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mSelectPayMethodFragment:Lcom/huawei/nfc/carrera/ui/bus/detail/SelectPayMethodFragment;

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    .line 773
    :goto_0
    return-void
.end method

.method protected showErrorDialog(Ljava/lang/String;)V
    .locals 5

    .line 868
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    .line 869
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 870
    invoke-virtual {v0, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_cvv_code_introduction_ok:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$4;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    .line 871
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 879
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 880
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 881
    invoke-virtual {v4}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 882
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 884
    :cond_0
    return-void
.end method

.method protected showProgressDialog()V
    .locals 4

    .line 864
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->progressDialog21:Lo/egn;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_opening_card_new:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 865
    return-void
.end method

.method protected startPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
    .locals 4

    .line 887
    const-string v0, "BindBusCardAddActivity"

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

    .line 888
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getPayType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getWxPayInfo()Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 889
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->startWXPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    goto :goto_0

    .line 891
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->startHWPay(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V

    .line 893
    :goto_0
    return-void
.end method
