.class public Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;
.super Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$SyncFile;,
        Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$SetCardDefaultCallbackImpl;
    }
.end annotation


# static fields
.field public static final CARD_AID:Ljava/lang/String; = "card_aid"

.field public static final CARD_NAME_KEY:Ljava/lang/String; = "card_name"

.field public static final CARD_REQUEST_ID_KEY:Ljava/lang/String; = "card_request_id"

.field public static final ENTERANCE_KEY:Ljava/lang/String; = "key_enterance"

.field public static final FAIL_DESC_KEY:Ljava/lang/String; = "fail_desc"

.field public static final FAIL_OPR_TYPE_KEY:Ljava/lang/String; = "opr_type"

.field public static final FAIL_REASON_KEY:Ljava/lang/String; = "fail_reason"

.field public static final ISSUERID_KEY:Ljava/lang/String; = "issuerId"

.field public static final KNOW_IT:I = 0x1

.field public static final NEED_RETRY:Z = true

.field public static final NOT_RETRY:Z = false

.field public static final OPENCARD_KEY:Ljava/lang/String; = "open_card"

.field public static final OPEN_CARD:Z = true

.field public static final RECHARGE:Z = false

.field public static final RECHARGE_SUCCESS:I = 0x2

.field public static final RETRY_KEY:Ljava/lang/String; = "need_retry"

.field public static final STARTED_BY_BUSADDACTIVITY:Ljava/lang/String; = "started_by_which_activity"

.field public static final SUCCESS:I = 0x0

.field private static final TAG:Ljava/lang/String; = "ShowBindBusResultActivity"

.field private static threadPool:Ljava/util/concurrent/ExecutorService; = null


# instance fields
.field private autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

.field private btnOK:Lo/egd;

.field private entranceType:I

.field private imgFailIcon:Landroid/widget/ImageView;

.field public isNeedRetry:Z

.field public isOpenCard:Z

.field private isSupportDefaultCard:Z

.field private issuerId:Ljava/lang/String;

.field private mAid:Ljava/lang/String;

.field private mBindCardFailedLayout:Landroid/widget/LinearLayout;

.field private mCardName:Ljava/lang/String;

.field private mCardRequestId:J

.field private mIsSetAsDefaultCard:Z

.field private mNoticeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;"
        }
    .end annotation
.end field

.field private mOprType:I

.field private mSetDefaultCardLayout:Landroid/widget/RelativeLayout;

.field private mSetDefaultCardTipsLayout:Landroid/widget/LinearLayout;

.field private mStartedByBindBusCardAddActivity:Z

.field protected mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

.field private noticeLayout:Landroid/widget/RelativeLayout;

.field private strFailDesc:Ljava/lang/String;

.field private strFailReason:Ljava/lang/String;

.field private textFailDesc:Landroid/widget/TextView;

.field private textFailReason:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 135
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->threadPool:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;-><init>()V

    .line 118
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->entranceType:I

    .line 122
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mCardName:Ljava/lang/String;

    .line 137
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isSupportDefaultCard:Z

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/util/List;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mNoticeList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Lo/egn;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->progressDialog21:Lo/egn;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0

    .line 53
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;I)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->doRetry(I)V

    return-void
.end method

.method static synthetic access$1302(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Z)Z
    .locals 0

    .line 53
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isSupportDefaultCard:Z

    return p1
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->goIntoWebview(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)I
    .locals 1

    .line 53
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mOprType:I

    return v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mIsSetAsDefaultCard:Z

    return v0
.end method

.method static synthetic access$402(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Z)Z
    .locals 0

    .line 53
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mIsSetAsDefaultCard:Z

    return p1
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mAid:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 1

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getOpenFailedBusCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$802(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$900(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->updateView()V

    return-void
.end method

.method private dealResultType(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 2

    .line 516
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_2

    .line 519
    :sswitch_0
    goto/16 :goto_3

    .line 522
    :sswitch_1
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isOpenCard:Z

    if-eqz v0, :cond_1

    .line 524
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getIssueCardOrderCnt()I

    move-result v0

    if-lez v0, :cond_0

    .line 525
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mOprType:I

    .line 526
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isNeedRetry:Z

    .line 527
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 528
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailDesc:Ljava/lang/String;

    .line 529
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->syncRFConfFiles(Z)V

    .line 530
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->syncFileToWatch()V

    goto :goto_0

    .line 532
    :cond_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_return_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    goto :goto_0

    .line 536
    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getRechargeOrderCnt()I

    move-result v0

    if-lez v0, :cond_2

    .line 537
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mOprType:I

    .line 538
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isNeedRetry:Z

    .line 539
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 540
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailDesc:Ljava/lang/String;

    .line 541
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->setResult(I)V

    goto :goto_0

    .line 543
    :cond_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_recharge_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 546
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->dismissProgress(Lo/egn;)V

    .line 547
    goto :goto_3

    .line 551
    :sswitch_2
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isOpenCard:Z

    if-eqz v0, :cond_3

    .line 553
    sget v0, Lcom/huawei/wallet/R$string;->nfc_invocate_card_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    goto :goto_1

    .line 556
    :cond_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_recharge_fail_customer_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 558
    :goto_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isNeedRetry:Z

    .line 559
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->dismissProgress(Lo/egn;)V

    .line 560
    goto :goto_3

    .line 562
    :sswitch_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_balance_reach_limit:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 563
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isNeedRetry:Z

    .line 564
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->dismissProgress(Lo/egn;)V

    .line 565
    goto :goto_3

    .line 567
    :goto_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->dismissProgress(Lo/egn;)V

    .line 570
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x4b1 -> :sswitch_3
        0x2710 -> :sswitch_2
        0x2711 -> :sswitch_0
        0x2712 -> :sswitch_1
    .end sparse-switch
.end method

.method private doRetry(I)V
    .locals 3

    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShowBindBusResultActivity-doRetry, cardStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 265
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isOpenCard:Z

    if-eqz v0, :cond_2

    .line 266
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getSupportDefaultCard()V

    .line 268
    const/16 v0, 0xb

    if-eq v0, p1, :cond_0

    const/16 v0, 0xc

    if-ne v0, p1, :cond_1

    .line 270
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V

    goto :goto_0

    .line 272
    :cond_1
    const/16 v0, 0xd

    if-ne v0, p1, :cond_3

    .line 273
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->issueTrafficCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V

    goto :goto_0

    .line 277
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V

    .line 280
    :cond_3
    :goto_0
    return-void
.end method

.method private getCards()I
    .locals 3

    .line 251
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v2

    .line 252
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 253
    const/4 v0, 0x0

    return v0

    .line 255
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCards, list.size()="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 256
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method private getOpenFailedBusCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 4

    .line 237
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v1

    .line 238
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 239
    const/4 v0, 0x0

    return-object v0

    .line 241
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 242
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 243
    return-object v3

    .line 245
    :cond_1
    goto :goto_0

    .line 247
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private getSupportDefaultCard()V
    .locals 2

    .line 406
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->threadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$4;-><init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 421
    return-void
.end method

.method private goIntoWebview(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 721
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 723
    :cond_0
    const-string v0, "BindBusCardAddActivity goIntoWebview, title or url is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 724
    return-void

    .line 728
    :cond_1
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 729
    const-class v0, Lcom/huawei/nfc/carrera/ui/notice/BusNoticeActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 730
    const-string v0, "title"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 731
    const-string v0, "intent_bundle_url"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 732
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 737
    goto :goto_0

    .line 734
    :catch_0
    move-exception v1

    .line 736
    const-string v0, "BusCard add goInto notice failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 738
    :goto_0
    return-void
.end method

.method private initParams()Z
    .locals 6

    .line 425
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 426
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 427
    const/4 v0, 0x0

    return v0

    .line 429
    :cond_0
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 430
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 431
    const/4 v0, 0x0

    return v0

    .line 433
    :cond_1
    const-string v0, "fail_desc"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailDesc:Ljava/lang/String;

    .line 434
    const-string v0, "fail_reason"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 435
    const-string v0, "opr_type"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mOprType:I

    .line 436
    const-string v0, "issuerId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    .line 437
    const-string v0, "key_enterance"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->entranceType:I

    .line 438
    const-string v0, "card_name"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mCardName:Ljava/lang/String;

    .line 439
    const-string v0, "card_request_id"

    const-wide/16 v1, 0x0

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mCardRequestId:J

    .line 440
    const-string v0, "card_aid"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mAid:Ljava/lang/String;

    .line 441
    const-string v0, "need_retry"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isNeedRetry:Z

    .line 442
    const-string v0, "open_card"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isOpenCard:Z

    .line 443
    const-string v0, "started_by_which_activity"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mStartedByBindBusCardAddActivity:Z

    .line 444
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initParams(),strFailDesc="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailDesc:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",strFailReason="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mOprType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mOprType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mIssuerId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getSupportDefaultCard()V

    .line 446
    const/4 v0, 0x1

    return v0
.end method

.method private setDefaultCard()V
    .locals 2

    .line 674
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mAid:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 675
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->threadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$5;-><init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 689
    :cond_0
    return-void
.end method

.method private showNotSurpportDefaultDes()V
    .locals 5

    .line 393
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 394
    return-void

    .line 396
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceProtocol()I

    move-result v4

    .line 397
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===showNotSurpportDefaultDes deviceType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    const/16 v0, 0xa

    if-ne v0, v4, :cond_1

    .line 399
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    goto :goto_0

    .line 401
    :cond_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text_band:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 403
    :goto_0
    return-void
.end method

.method private showSetDefaultCardView(Z)V
    .locals 2

    .line 378
    if-eqz p1, :cond_0

    .line 379
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mSetDefaultCardLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 380
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mSetDefaultCardTipsLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 381
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mBindCardFailedLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 383
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mSetDefaultCardLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 384
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mSetDefaultCardTipsLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 385
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mBindCardFailedLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 387
    :goto_0
    return-void
.end method

.method private syncFileToWatch()V
    .locals 4

    .line 657
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncFileToWatch  IssuerId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 658
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->threadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$SyncFile;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$SyncFile;-><init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 659
    return-void
.end method

.method private updateView()V
    .locals 7

    .line 286
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mOprType:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 287
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isOpenCard:Z

    if-eqz v0, :cond_2

    .line 288
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->setDefaultCard()V

    .line 289
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->btnOK:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_success:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->imgFailIcon:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_successful_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailDesc:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->showHead(Ljava/lang/String;)V

    .line 292
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===bindCard result isSupportDefaultCard="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isSupportDefaultCard:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===bindCard result getCards()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getCards()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isSupportDefaultCard:Z

    if-nez v0, :cond_0

    .line 296
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->showSetDefaultCardView(Z)V

    .line 297
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->showNotSurpportDefaultDes()V

    goto :goto_0

    .line 299
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getCards()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 301
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->showSetDefaultCardView(Z)V

    .line 302
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->showNotSurpportDefaultDes()V

    goto :goto_0

    .line 304
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->showSetDefaultCardView(Z)V

    .line 305
    sget v0, Lcom/huawei/wallet/R$id;->nfc_set_default_card_checkbox:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/CheckBox;

    .line 306
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mIsSetAsDefaultCard:Z

    .line 307
    sget v0, Lcom/huawei/wallet/R$id;->nfc_set_default_card_tips_1_txt:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 308
    sget v0, Lcom/huawei/wallet/R$string;->nfc_set_default_card_operation_tips_1:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 309
    sget v0, Lcom/huawei/wallet/R$id;->nfc_set_default_card_tips_2_txt:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 310
    sget v0, Lcom/huawei/wallet/R$string;->nfc_set_default_card_operation_tips_2:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$3;-><init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V

    invoke-virtual {v4, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 319
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->syncRFConfFiles(Z)V

    .line 320
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->syncFileToWatch()V

    goto/16 :goto_1

    .line 323
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->imgFailIcon:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_successful_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 324
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->btnOK:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_ok:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailDesc:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->showHead(Ljava/lang/String;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mSetDefaultCardLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 327
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mSetDefaultCardTipsLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 328
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mBindCardFailedLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_1

    .line 333
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailDesc:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->showHead(Ljava/lang/String;)V

    .line 334
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mBindCardFailedLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 335
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->imgFailIcon:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/wallet/R$drawable;->ic_failure_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 336
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isNeedRetry:Z

    if-eqz v0, :cond_6

    .line 337
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->btnOK:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_retry:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 338
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isOpenCard:Z

    if-eqz v0, :cond_5

    .line 340
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 341
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_return_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 343
    :cond_4
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_bind_fail_do_not_pay_again:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    goto :goto_1

    .line 346
    :cond_5
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge_fail_retry:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    goto :goto_1

    .line 350
    :cond_6
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->btnOK:Lo/egd;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_quick_pass_button_text:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 351
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isOpenCard:Z

    if-eqz v0, :cond_7

    .line 353
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_bind_fail_go_to_card_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, ""

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ""

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ""

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    goto :goto_1

    .line 356
    :cond_7
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getOpenFailedBusCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 357
    const/4 v0, 0x0

    if-ne v0, v4, :cond_8

    .line 358
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge_fail_retry:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    goto :goto_1

    .line 360
    :cond_8
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_card_recharge_fail_can_not_retry:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 366
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->textFailDesc:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailDesc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 367
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 368
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->textFailReason:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 369
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->textFailReason:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 371
    :cond_9
    return-void
.end method


# virtual methods
.method protected getErrorMessage(I)Ljava/lang/String;
    .locals 2

    .line 579
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->getCommonErrorMessage(I)Ljava/lang/String;

    move-result-object v1

    .line 580
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 581
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isOpenCard:Z

    if-eqz v0, :cond_0

    .line 583
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 588
    :sswitch_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_return_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 592
    :sswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_get_city_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 595
    :sswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_out_of_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 598
    :sswitch_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_ssd_install_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 601
    :sswitch_4
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 604
    :goto_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_return_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 608
    :cond_0
    sparse-switch p1, :sswitch_data_1

    goto :goto_1

    .line 612
    :sswitch_5
    sget v0, Lcom/huawei/wallet/R$string;->nfc_get_city_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 616
    :sswitch_6
    sget v0, Lcom/huawei/wallet/R$string;->nfc_recharge_fail_customer_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 622
    :sswitch_7
    sget v0, Lcom/huawei/wallet/R$string;->nfc_recharge_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 625
    :goto_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_recharge_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 629
    :cond_1
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x63 -> :sswitch_0
        0x3f0 -> :sswitch_1
        0x3f2 -> :sswitch_2
        0x44d -> :sswitch_4
        0x44e -> :sswitch_0
        0x44f -> :sswitch_1
        0x450 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0xa -> :sswitch_7
        0x63 -> :sswitch_7
        0x3f0 -> :sswitch_5
        0x44f -> :sswitch_5
        0x515 -> :sswitch_6
        0x516 -> :sswitch_7
        0x517 -> :sswitch_7
        0x518 -> :sswitch_6
    .end sparse-switch
.end method

.method public issueTrafficCardCallback(I)V
    .locals 3

    .line 499
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShowBindBusResultActivity-issueTrafficCardCallback, resultCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 500
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->dismissProgress(Lo/egn;)V

    .line 501
    if-nez p1, :cond_0

    .line 502
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    const-string v1, "0"

    const-string v2, ""

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 503
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mOprType:I

    .line 504
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isNeedRetry:Z

    .line 505
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailDesc:Ljava/lang/String;

    .line 506
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 507
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->syncRFConfFiles(Z)V

    .line 508
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->syncFileToWatch()V

    goto :goto_0

    .line 510
    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 512
    :goto_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->updateView()V

    .line 513
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 163
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 164
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_show_bind_bus_result_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->setContentView(I)V

    .line 165
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->init()V

    .line 166
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->initParams()Z

    move-result v0

    if-nez v0, :cond_0

    .line 167
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->finish()V

    .line 168
    return-void

    .line 171
    :cond_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->setTitle(I)V

    .line 173
    sget v0, Lcom/huawei/wallet/R$id;->nfc_bind_bus_card_fail_icon:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->imgFailIcon:Landroid/widget/ImageView;

    .line 174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->parentBodyLinearLayout:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->imgFailIcon:Landroid/widget/ImageView;

    const v2, 0x3e99999a    # 0.3f

    invoke-static {p0, v0, v1, v2}, Lcom/huawei/pay/ui/util/UiUtil;->setViewMargin(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;F)V

    .line 175
    sget v0, Lcom/huawei/wallet/R$id;->bind_bus_card_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->textFailDesc:Landroid/widget/TextView;

    .line 176
    sget v0, Lcom/huawei/wallet/R$id;->nfc_bind_bus_fail_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->btnOK:Lo/egd;

    .line 177
    sget v0, Lcom/huawei/wallet/R$id;->nfc_bind_bus_card_failed_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mBindCardFailedLayout:Landroid/widget/LinearLayout;

    .line 178
    sget v0, Lcom/huawei/wallet/R$id;->bind_bus_card_result:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->textFailReason:Landroid/widget/TextView;

    .line 179
    sget v0, Lcom/huawei/wallet/R$id;->nfc_set_default_card_checkbox_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mSetDefaultCardLayout:Landroid/widget/RelativeLayout;

    .line 180
    sget v0, Lcom/huawei/wallet/R$id;->nfc_set_default_card_tips_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mSetDefaultCardTipsLayout:Landroid/widget/LinearLayout;

    .line 182
    sget v0, Lcom/huawei/wallet/R$id;->rl_recharge_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->noticeLayout:Landroid/widget/RelativeLayout;

    .line 183
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->noticeLayout:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 198
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->noticeLayout:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/wallet/R$id;->astv_notice_content:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    .line 200
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->updateView()V

    .line 202
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    const-string v2, ""

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->btnOK:Lo/egd;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 234
    return-void
.end method

.method public queryAndHandleUnfinishedOrderCallback(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 4

    .line 469
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShowBindBusResultActivity-queryAndHandleUnfinishedOrderCallback, resultCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " resultType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 471
    if-eqz p1, :cond_0

    .line 472
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->strFailReason:Ljava/lang/String;

    .line 473
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->updateView()V

    .line 474
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->dismissProgress(Lo/egn;)V

    .line 475
    return-void

    .line 477
    :cond_0
    if-eqz p3, :cond_1

    .line 478
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAndHandleUnfinishedOrderCallback total cnt : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getTotalOrderCnt()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " rechargeCnt : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 479
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

    .line 480
    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getRefundOrderCnt()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 478
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 482
    :cond_1
    const/16 v0, 0x2711

    if-ne v0, p2, :cond_2

    .line 483
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " exists_unfinished_orders return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    return-void

    .line 487
    :cond_2
    invoke-direct {p0, p2, p3}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->dealResultType(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 488
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->updateView()V

    .line 490
    return-void
.end method

.method public queryCardNoticeCallback(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardNotice;>;)V"
        }
    .end annotation

    .line 697
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 699
    const-string v0, "ShowBindBusResultActivity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 700
    return-void

    .line 703
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 704
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

    .line 706
    if-nez v2, :cond_1

    .line 708
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->noticeLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 709
    return-void

    .line 712
    :cond_1
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mNoticeList:Ljava/util/List;

    .line 713
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->noticeLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 715
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->setData(Ljava/util/List;)V

    .line 716
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->autoScrollTextView:Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/notice/AutoScrollTextView;->startAutoRun()V

    .line 718
    return-void
.end method

.method public queryTrafficCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;)V
    .locals 6

    .line 749
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 751
    const-string v0, "queryTrafficCardInfoCallback, activity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 752
    return-void

    .line 755
    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_2

    .line 757
    :cond_1
    const-string v0, "queryTrafficCardInfoCallback, query failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 758
    return-void

    .line 760
    :cond_2
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    .line 761
    const-string v0, "ShowBindBusResultActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mTrafficCardInfo.getRechargeSupport() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getIssuerCardSupport()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 762
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mOprType:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->isOpenCard:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->mTrafficCardInfo:Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficCardInfo;->getIssuerCardSupport()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    .line 763
    :goto_0
    if-eqz v4, :cond_4

    .line 766
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->getNoticeIssueId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 767
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShowBindBusResultActivity noticeIssuerId =  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 768
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    const-string v1, "2"

    invoke-interface {v0, v5, v1, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryCardNotice(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardNoticeCallback;)V

    .line 770
    :cond_4
    return-void
.end method
