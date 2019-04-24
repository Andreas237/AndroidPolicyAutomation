.class public Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;
.super Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;
    }
.end annotation


# static fields
.field public static final KEY_DISMISS_LOADING:I = 0x67

.field public static final KEY_ENTERANCE:Ljava/lang/String; = "key_enterance"

.field public static final KEY_ISSUE_CARD_HAS_UNFINISHED_ORDER:I = 0x64

.field public static final KEY_ISSUE_CARD_NORMAL:I = 0x65

.field public static final KEY_SHOW_LOADING:I = 0x66

.field private static final SUPPORT_CARD_BJ:Ljava/lang/String; = "90000028"

.field private static final SUPPORT_CARD_LIST:Ljava/lang/String; = "SUPPORT_CARD_LIST"

.field private static final SUPPORT_CARD_SZ:Ljava/lang/String; = "90000025"

.field private static final TAG:Ljava/lang/String; = "PluginPay BindBusCardSwitchActivity "

.field public static final TRAFFIC_CARD_ISSUE_REQUEST_ID:Ljava/lang/String; = "traffic_card_issue_request_id"

.field private static threadPool:Ljava/util/concurrent/ExecutorService; = null


# instance fields
.field private cardListLayout:Landroid/widget/ListView;

.field private emptyListLayout:Landroid/widget/LinearLayout;

.field private entranceType:I

.field protected handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

.field private issuerId:Ljava/lang/String;

.field private loadingLayout:Landroid/widget/LinearLayout;

.field private mCardAid:Ljava/lang/String;

.field private mCardName:Ljava/lang/String;

.field private mCardRequestId:J

.field private mCustomDlg:Lo/egv;

.field private mOnClickListener:Landroid/view/View$OnClickListener;

.field private mSurportDlg:Lo/egv;

.field private supportList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field protected trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 413
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->threadPool:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 72
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;-><init>()V

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mSurportDlg:Lo/egv;

    .line 122
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->entranceType:I

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->supportList:Ljava/util/ArrayList;

    .line 158
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    invoke-direct {v0, p0, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    .line 644
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$5;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mOnClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showOpenCardProgressDialog()V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Lo/egn;)V
    .locals 0

    .line 72
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->dismissProgress(Lo/egn;)V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1102(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1200(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->supportList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Z
    .locals 1

    .line 72
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->isNoSupportID()Z

    move-result v0

    return v0
.end method

.method static synthetic access$1400(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showSurpportDialog(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1500(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;ILjava/util/ArrayList;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->onCardItemClick(Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;ILjava/util/ArrayList;)V

    return-void
.end method

.method static synthetic access$1600(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Lo/egv;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    return-object v0
.end method

.method static synthetic access$1602(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    return-object p1
.end method

.method static synthetic access$1700(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->preIssueTrafficCard()V

    return-void
.end method

.method static synthetic access$1800(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->queryOrders()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardName:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$402(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardName:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)J
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardRequestId:J

    return-wide v0
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/lang/String;ILjava/lang/String;J)V
    .locals 0

    .line 72
    invoke-direct/range {p0 .. p5}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->jumpToCardInstructionActivity(Ljava/lang/String;ILjava/lang/String;J)V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Lo/egn;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->progressDialog21:Lo/egn;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0

    .line 72
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)Lo/egn;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->progressDialog21:Lo/egn;

    return-object v0
.end method

.method private contunineOpenCard()V
    .locals 2

    .line 855
    const-string v0, "BindBusCardAddActivity pay failed, But no unfinished order in sp, really failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 856
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->removeMessages(I)V

    .line 857
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->removeMessages(I)V

    .line 858
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->sendEmptyMessage(I)Z

    .line 859
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->sendEmptyMessage(I)Z

    .line 860
    return-void
.end method

.method private getMinistryTransportConflictCard(Ljava/util/ArrayList;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;>;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;"
        }
    .end annotation

    .line 377
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getBundle()Landroid/os/Bundle;

    move-result-object v2

    .line 378
    const-string v0, "aid"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "A000000632010105"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 380
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BindBusCardSwitchActivity isMinistryTransportConflict,  no conflict,  opening card issuerId : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "issueId"

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 381
    const/4 v0, 0x0

    return-object v0

    .line 384
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 385
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 387
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;

    .line 388
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getBundle()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 390
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getBundle()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "aid"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 391
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    const-string v0, "A000000632010105"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 393
    return-object v4

    .line 396
    :cond_1
    goto :goto_0

    .line 398
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private gotoPreCreatSSD()V
    .locals 2

    .line 864
    const-string v0, "BindBusCardAddActivity gotoPreCreatSSD"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 865
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->removeMessages(I)V

    .line 866
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->removeMessages(I)V

    .line 867
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->sendEmptyMessage(I)Z

    .line 868
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->sendEmptyMessage(I)Z

    .line 870
    return-void
.end method

.method private handleUnfinishedOrderByType(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 9

    .line 516
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 519
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->dismissProgress(Lo/egn;)V

    .line 520
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    iget v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->entranceType:I

    const/4 v3, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    .line 523
    goto :goto_0

    .line 526
    :pswitch_1
    goto :goto_0

    .line 528
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->dismissProgress(Lo/egn;)V

    .line 529
    invoke-direct {p0, p1, p3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handleUnfinishedOrderSuccess(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 530
    .line 535
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2710
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private handleUnfinishedOrderSuccess(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 9

    .line 540
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getIssueCardOrderCnt()I

    move-result v0

    if-lez v0, :cond_0

    .line 541
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 542
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_success:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text:I

    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    iget v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->entranceType:I

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    goto :goto_0

    .line 546
    :cond_0
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    iget v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->entranceType:I

    const/4 v3, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    .line 550
    :goto_0
    return-void
.end method

.method private initCardList(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;>;)V"
        }
    .end annotation

    .line 248
    const-string v0, "PluginPay BindBusCardSwitchActivity initCardList start"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 249
    new-instance v2, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0, p1}, Lcom/huawei/nfc/carrera/ui/bus/adapter/BusCardSwitchAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardListLayout:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardListLayout:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 286
    const-string v0, "PluginPay BindBusCardSwitchActivity initCardList end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 287
    return-void
.end method

.method private isFMCard(Ljava/lang/String;)Z
    .locals 1

    .line 783
    const-string v0, "t_fdw_lingnantong"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "t_sh_01"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 784
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 786
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private isNoSupportID()Z
    .locals 2

    .line 432
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->supportList:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->isNotSzAndBj()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isNotSzAndBj()Z
    .locals 2

    .line 437
    const-string v0, "90000025"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "90000028"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isSurpportSNB(Ljava/lang/String;)Z
    .locals 1

    .line 769
    const-string v0, "90000029"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "90000028"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "90000024"

    .line 770
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "90000025"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "90000026"

    .line 771
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 772
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 774
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private jumpToCardDeatil(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 445
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/detail/BuscardDetailActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 446
    const-string v0, "traffic_card_issuerId"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 447
    const-string v0, "traffic_card_productId"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 448
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->startActivity(Landroid/content/Intent;)V

    .line 449
    return-void
.end method

.method private jumpToCardInstructionActivity(Ljava/lang/String;ILjava/lang/String;J)V
    .locals 3

    .line 611
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BindBusCardSwitchActivity jumpToCardInstructionActivity.issuerId."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",cardType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 612
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardInstructionActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 613
    const-string v0, "issuer_id"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 614
    const-string v0, "card_type"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 615
    const-string v0, "card_name"

    invoke-virtual {v2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 616
    const-string v0, "card_request_id"

    invoke-virtual {v2, v0, p4, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 617
    const-string v0, "key_enterance"

    iget v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->entranceType:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 618
    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->startActivity(Landroid/content/Intent;)V

    .line 619
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->finish()V

    .line 620
    return-void
.end method

.method private onCardItemClick(Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;ILjava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;ILjava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;>;)V"
        }
    .end annotation

    .line 292
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getBundle()Landroid/os/Bundle;

    move-result-object v5

    .line 293
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_1

    .line 295
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BindBusCardSwitchActivity detail issuerId."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 296
    const-string v0, "issueId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->jumpToCardDeatil(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    goto/16 :goto_2

    .line 299
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const-string v1, "issueId"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->isBusUnite(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v6, 0xc

    goto :goto_0

    :cond_0
    const/16 v6, 0xb

    .line 300
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 301
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceProtocol()I

    move-result v7

    .line 302
    const/16 v0, 0xa

    if-eq v7, v0, :cond_1

    const/16 v0, 0xd

    if-ne v0, v7, :cond_3

    .line 303
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->isInRuleLEO(I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 304
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount_leo:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 305
    const/16 v0, 0xd

    if-ne v0, v7, :cond_2

    .line 306
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount_nyx:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 308
    :cond_2
    invoke-direct {p0, v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showSurpportDialog(Ljava/lang/String;)V

    .line 309
    return-void

    .line 312
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->isInRule4NewDevice(I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 313
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount_other:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showSurpportDialog(Ljava/lang/String;)V

    .line 314
    return-void

    .line 319
    :cond_4
    invoke-direct {p0, p3, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getMinistryTransportConflictCard(Ljava/util/ArrayList;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;

    move-result-object v7

    .line 320
    const/4 v8, 0x0

    .line 321
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    .line 322
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getBundle()Landroid/os/Bundle;

    move-result-object v8

    .line 324
    :cond_5
    if-eqz v8, :cond_6

    .line 325
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_buscard_traffic_card_conflict_tips:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "cardName"

    invoke-virtual {v8, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showSurpportDialog(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 327
    :cond_6
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    const-string v1, "A000000632010105"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 328
    new-instance v9, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-direct {v9, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 329
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    invoke-virtual {v9, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 330
    sget v0, Lcom/huawei/wallet/R$string;->nfc_dialog_traffic_joint_car_one:I

    invoke-virtual {v9, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 331
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_continue:I

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V

    invoke-virtual {v9, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 339
    sget v0, Lcom/huawei/wallet/R$string;->nfc_cancel:I

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$3;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V

    invoke-virtual {v9, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 346
    invoke-virtual {v9}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    .line 347
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 348
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_7

    .line 349
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 351
    :cond_7
    goto :goto_2

    .line 352
    :cond_8
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->preIssueTrafficCard()V

    .line 354
    goto :goto_2

    .line 357
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showOpenCardProgressDialog()V

    .line 358
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    const-string v1, "issueId"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->queryAndHandleUnfinfishedOrders(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;)V

    .line 360
    goto :goto_2

    .line 363
    :pswitch_3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showOpenCardProgressDialog()V

    .line 364
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    const-string v1, "issueId"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->issueTrafficCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/IssueTrafficCardCallback;)V

    .line 365
    goto :goto_2

    .line 368
    :goto_1
    :pswitch_4
    const-string v0, "PluginPay BindBusCardSwitchActivity initCardList, error card status!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 371
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private preIssueTrafficCard()V
    .locals 2

    .line 403
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BindBusCardSwitchActivity tsm , card not opened ,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->isFMCard(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 406
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->removeMessages(I)V

    .line 407
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 409
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->queryUnfinishedIssueOrder()V

    .line 412
    :goto_0
    return-void
.end method

.method private queryOrders()V
    .locals 19

    .line 795
    const-string v0, "start queryOrders"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 796
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v6

    .line 797
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v7

    .line 798
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getBusChipManu()Ljava/lang/String;

    move-result-object v8

    .line 799
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v9

    .line 800
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    move-object v2, v9

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v10, v0

    .line 802
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v11

    .line 803
    invoke-virtual {v11}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/nfc/PluginPayAdapter;

    .line 804
    invoke-interface {v12}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setAccountUserId(Ljava/lang/String;)V

    .line 805
    const-string v0, "1"

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setOrderStatus(Ljava/lang/String;)V

    .line 806
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    invoke-interface {v0, v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->queryOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;

    move-result-object v13

    .line 808
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_0

    .line 810
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryOrder err : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", desc : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 811
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->gotoPreCreatSSD()V

    .line 812
    return-void

    .line 815
    :cond_0
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 817
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v14

    .line 818
    if-eqz v14, :cond_6

    .line 820
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 821
    const/16 v16, 0x0

    .line 822
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_0
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;

    .line 824
    const-string v0, "900"

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "803"

    .line 825
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "802"

    .line 826
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "801"

    .line 827
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 829
    :cond_1
    move-object/from16 v0, v18

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 830
    const-string v0, "2"

    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "0"

    .line 831
    invoke-virtual/range {v18 .. v18}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 833
    :cond_2
    const/16 v16, 0x1

    .line 836
    :cond_3
    goto :goto_0

    .line 837
    :cond_4
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 839
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAndHandleUnfinishedOrdersSAOperator, there is unfinished orders, size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 840
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 839
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 841
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 842
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0, v15}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setQueryOrders(Ljava/util/List;)V

    .line 843
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->trafficOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->setHasUnusedIssueOrder(Z)V

    .line 844
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->contunineOpenCard()V

    .line 845
    return-void

    .line 847
    :cond_5
    const-string v0, "QueryAndHandleUnfinishedOrdersSAOperator, there is unfinished orders, size=0 "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 850
    :cond_6
    invoke-direct/range {p0 .. p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->gotoPreCreatSSD()V

    .line 851
    return-void
.end method

.method private queryUnfinishedIssueOrder()V
    .locals 3

    .line 417
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->removeMessages(I)V

    .line 418
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handler:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$LocalHandler;->sendEmptyMessage(I)Z

    .line 419
    new-instance v2, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity$4;-><init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;)V

    .line 427
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->threadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 428
    return-void
.end method

.method private setAdapterData(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;>;)V"
        }
    .end annotation

    .line 470
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 471
    return-void

    .line 473
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 474
    return-void

    .line 476
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 477
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 478
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;

    .line 479
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getBundle()Landroid/os/Bundle;

    move-result-object v5

    .line 480
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BindBusCardSwitchActivity querySupportedTrafficCardListCallback, supportedTrafficCardListItem"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "issueId"

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 481
    const-string v0, "issueId"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->isSurpportSNB(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 482
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 485
    :cond_3
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->initCardList(Ljava/util/ArrayList;)V

    .line 486
    return-void
.end method

.method private showOpenCardProgressDialog()V
    .locals 4

    .line 441
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->progressDialog21:Lo/egn;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_opening_card_new:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 442
    return-void
.end method

.method private showSurpportDialog(Ljava/lang/String;)V
    .locals 5

    .line 629
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 630
    const-string v0, "PluginPay BindBusCardSwitchActivity "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogSetlock Already show!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    return-void

    .line 633
    :cond_0
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 634
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    invoke-virtual {v4, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 635
    invoke-virtual {v4, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 636
    sget v0, Lcom/huawei/wallet/R$string;->nfc_quick_pass_button_text:I

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mOnClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v4, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 637
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    .line 638
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 639
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 640
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCustomDlg:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 642
    :cond_1
    return-void
.end method

.method private showWhichLayout(III)V
    .locals 2

    .line 553
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->loadingLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 554
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->loadingLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 557
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->emptyListLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 558
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->emptyListLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 561
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardListLayout:Landroid/widget/ListView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 562
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardListLayout:Landroid/widget/ListView;

    invoke-virtual {v0, p3}, Landroid/widget/ListView;->setVisibility(I)V

    .line 564
    :cond_2
    return-void
.end method

.method private upLoadLog(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 4

    .line 735
    if-eqz p1, :cond_2

    .line 736
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

    .line 742
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "queryAndHandleUnfinishedOrderCallback, query Unfinished Order fail"

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 746
    :cond_1
    return-void

    .line 749
    :cond_2
    const/16 v0, 0x2712

    if-ne p2, v0, :cond_3

    if-eqz p3, :cond_3

    .line 750
    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getIssueCardOrderCnt()I

    move-result v0

    if-lez v0, :cond_3

    .line 751
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    const-string v1, "0"

    const-string v2, ""

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 753
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

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

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 756
    :goto_0
    return-void
.end method


# virtual methods
.method protected getErrorMessage(I)Ljava/lang/String;
    .locals 2

    .line 674
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->getCommonErrorMessage(I)Ljava/lang/String;

    move-result-object v1

    .line 675
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 676
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getTSMErrorMessage(I)Ljava/lang/String;

    move-result-object v1

    .line 677
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 678
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getSPErrorMessage(I)Ljava/lang/String;

    .line 681
    :cond_0
    return-object v1
.end method

.method protected getSPErrorMessage(I)Ljava/lang/String;
    .locals 1

    .line 713
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 717
    :sswitch_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_get_city_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 720
    :sswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_return_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 723
    :sswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_out_of_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 726
    :goto_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_sp_return_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x3f0 -> :sswitch_0
        0x3f2 -> :sswitch_2
        0x44e -> :sswitch_1
        0x44f -> :sswitch_0
    .end sparse-switch
.end method

.method protected getTSMErrorMessage(I)Ljava/lang/String;
    .locals 1

    .line 691
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 695
    :sswitch_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_create_order_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 698
    :sswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_ssd_install_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 701
    :sswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 703
    :goto_0
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x63 -> :sswitch_0
        0x44d -> :sswitch_2
        0x450 -> :sswitch_1
    .end sparse-switch
.end method

.method public init()V
    .locals 5

    .line 220
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->init()V

    .line 222
    sget v0, Lcom/huawei/wallet/R$id;->bind_bus_cardlist_loading_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->loadingLayout:Landroid/widget/LinearLayout;

    .line 224
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->loadingLayout:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/wallet/R$id;->progress_bar:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ProgressBar;

    .line 226
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_0

    .line 227
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 228
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$drawable;->nfc_loading_animation:I

    .line 229
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 230
    invoke-virtual {v3, v4}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 233
    :cond_0
    sget v0, Lcom/huawei/wallet/R$id;->bind_bus_cardlist_empty_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->emptyListLayout:Landroid/widget/LinearLayout;

    .line 234
    sget v0, Lcom/huawei/wallet/R$id;->bind_bus_card_switch_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardListLayout:Landroid/widget/ListView;

    .line 235
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 236
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 237
    const-string v0, "traffic_card_issue_request_id"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardRequestId:J

    .line 241
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    invoke-interface {v0, p0}, Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;->initEseInfo(Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;)V

    .line 243
    const/4 v0, 0x0

    const/16 v1, 0x8

    const/16 v2, 0x8

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showWhichLayout(III)V

    .line 245
    return-void
.end method

.method public initEseResult(I)V
    .locals 0

    .line 625
    return-void
.end method

.method public issueTrafficCardCallback(I)V
    .locals 9

    .line 568
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->dismissProgress(Lo/egn;)V

    .line 569
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handleCommonErrorCode(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 570
    return-void

    .line 572
    :cond_0
    if-nez p1, :cond_1

    .line 573
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    const-string v1, "0"

    const-string v2, ""

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 575
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_success:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/huawei/wallet/R$string;->nfc_bind_bus_success_decribe_text:I

    invoke-virtual {p0, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    iget v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->entranceType:I

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    goto :goto_0

    .line 579
    :cond_1
    const/4 v0, 0x1

    if-eq v0, p1, :cond_2

    const/16 v0, 0xa

    if-eq v0, p1, :cond_2

    const/16 v0, 0x17

    if-eq v0, p1, :cond_2

    const/16 v0, 0x18

    if-eq v0, p1, :cond_2

    const/16 v0, 0x19

    if-eq v0, p1, :cond_2

    const/16 v0, 0x63

    if-ne v0, p1, :cond_3

    .line 585
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "issueTrafficCardCallback, issue Traffic Card fail"

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    :cond_3
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    iget v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->entranceType:I

    const/4 v3, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    .line 593
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 600
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->finish()V

    .line 601
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onBackPressed()V

    .line 602
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 147
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 148
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->setRequestedOrientation(I)V

    .line 149
    sget v0, Lcom/huawei/wallet/R$string;->nfc_buscard_select_service_area:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->setTitle(I)V

    .line 150
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_bind_bus_card_switch_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->setContentView(I)V

    .line 151
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "SUPPORT_CARD_LIST"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->supportList:Ljava/util/ArrayList;

    .line 152
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->init()V

    .line 153
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 207
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->onResume()V

    .line 208
    const-string v0, "PluginPay BindBusCardSwitchActivity "

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " supportList : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->supportList:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->supportList:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getSupportList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->supportList:Ljava/util/ArrayList;

    .line 213
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 214
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->querySupportedTrafficCardList(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportedTrafficCardListCallback;)V

    .line 216
    :cond_1
    return-void
.end method

.method public queryAndHandleUnfinishedOrderCallback(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
    .locals 10

    .line 498
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->upLoadLog(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 499
    if-eqz p1, :cond_0

    .line 500
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->progressDialog21:Lo/egn;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->dismissProgress(Lo/egn;)V

    .line 501
    move-object v0, p0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_bind_bus_card_fail:I

    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->getErrorMessage(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->issuerId:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->mCardAid:Ljava/lang/String;

    iget v6, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->entranceType:I

    const/4 v3, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    invoke-virtual/range {v0 .. v8}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V

    .line 504
    return-void

    .line 507
    :cond_0
    if-eqz p3, :cond_1

    .line 508
    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getBundle()Landroid/os/Bundle;

    move-result-object v9

    .line 509
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PluginPay BindBusCardSwitchActivity BindBusCardSwitchActivity queryAndHandleUnfinishedOrderCallback total cnt : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "totalOrderCnt"

    invoke-virtual {v9, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " rechargeCnt : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "rechargeOrderCnt"

    .line 510
    invoke-virtual {v9, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " issueCnt : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "issueCardOrderCnt"

    invoke-virtual {v9, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " refund : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "refundOrderCnt"

    invoke-virtual {v9, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 509
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 512
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->handleUnfinishedOrderByType(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V

    .line 513
    return-void
.end method

.method public querySupportedTrafficCardListCallback(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;>;)V"
        }
    .end annotation

    .line 453
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 454
    const-string v0, "PluginPay BindBusCardSwitchActivity querySupportedTrafficCardListCallback, activity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 455
    return-void

    .line 457
    :cond_0
    const-string v0, "PluginPay BindBusCardSwitchActivity querySupportedTrafficCardListCallback begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 458
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 459
    const/16 v0, 0x8

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showWhichLayout(III)V

    .line 460
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 461
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->setAdapterData(Ljava/util/ArrayList;)V

    .line 462
    goto :goto_0

    .line 463
    :cond_1
    const/16 v0, 0x8

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardSwitchActivity;->showWhichLayout(III)V

    .line 464
    const-string v0, "PluginPay BindBusCardSwitchActivity querySupportedTrafficCardListCallback, empty list"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 466
    :goto_0
    return-void
.end method
