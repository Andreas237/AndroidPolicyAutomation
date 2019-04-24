.class public Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;
    }
.end annotation


# static fields
.field private static final CGB_ISSUERID:Ljava/lang/String; = "03060000"

.field private static final CMB_ISSUERID:Ljava/lang/String; = "03080000"

.field private static final DIC_NAME:Ljava/lang/String; = "Huawei_Watch_LEO"

.field private static final IS_SUPPORT_DEBITCARD:Ljava/lang/String; = "2"

.field private static final SHOW_SUPPORT_BANK_INFOS:I = 0x1

.field private static final TAG:Ljava/lang/String; = "SupportBankInfoView"

.field private static threadPool:Ljava/util/concurrent/ExecutorService; = null


# instance fields
.field private isOnlySupportCGBdebitCard:Z

.field private isOnlySupportCMBdebitCard:Z

.field private mContext:Landroid/content/Context;

.field private mHandler:Landroid/os/Handler;

.field protected mLoadingDialog21:Lo/egn;

.field private mSupportBanksLayout:Landroid/widget/RelativeLayout;

.field private mSupportCardAdapter:Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;

.field private mSupportCardList:Landroid/widget/GridView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 63
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->threadPool:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 82
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->isOnlySupportCMBdebitCard:Z

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->isOnlySupportCGBdebitCard:Z

    .line 383
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mHandler:Landroid/os/Handler;

    .line 83
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->init(Landroid/content/Context;)V

    .line 84
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 109
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->isOnlySupportCMBdebitCard:Z

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->isOnlySupportCGBdebitCard:Z

    .line 383
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mHandler:Landroid/os/Handler;

    .line 110
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->init(Landroid/content/Context;)V

    .line 111
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 96
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->isOnlySupportCMBdebitCard:Z

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->isOnlySupportCGBdebitCard:Z

    .line 383
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mHandler:Landroid/os/Handler;

    .line 97
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->init(Landroid/content/Context;)V

    .line 98
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mSupportBanksLayout:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->isOnlySupportCMBdebitCard:Z

    return v0
.end method

.method static synthetic access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Landroid/content/Context;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->showSupportBankInfos(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$102(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Z)Z
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->isOnlySupportCMBdebitCard:Z

    return p1
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->isOnlySupportCGBdebitCard:Z

    return v0
.end method

.method static synthetic access$202(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Z)Z
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->isOnlySupportCGBdebitCard:Z

    return p1
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mSupportCardAdapter:Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;

    return-object v0
.end method

.method static synthetic access$302(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;)Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mSupportCardAdapter:Lcom/huawei/nfc/carrera/ui/bindcard/SupportCardInfoAdapter;

    return-object p1
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/content/Context;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/widget/GridView;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mSupportCardList:Landroid/widget/GridView;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Landroid/widget/GridView;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->setListViewHeightBasedOnChildren(Landroid/widget/GridView;)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->getSupportBankFromServer(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)Landroid/os/Handler;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method private getOnlySupportBOCdebitCardInfo()V
    .locals 4

    .line 333
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getOnlySupportBOCdebitCardInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    sget-object v0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->threadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$SupportBOC;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 336
    return-void
.end method

.method private getSupportBankFromServer(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;
    .locals 4

    .line 393
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;-><init>()V

    .line 394
    const-string v0, "Huawei_Watch_LEO"

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;->dicName:Ljava/lang/String;

    .line 395
    iput-object p1, v2, Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;->itemName:Ljava/lang/String;

    .line 396
    new-instance v0, Lcom/huawei/wallet/bankcard/server/BankCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/wallet/bankcard/server/BankCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Lcom/huawei/wallet/bankcard/server/BankCardServer;->queryDics(Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;)Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;

    move-result-object v3

    .line 397
    return-object v3
.end method

.method private init(Landroid/content/Context;)V
    .locals 3

    .line 121
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    .line 122
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->initView(Landroid/content/Context;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->showProgressDialog(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 124
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->getOnlySupportBOCdebitCardInfo()V

    .line 127
    return-void
.end method

.method private initView(Landroid/content/Context;)V
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 138
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_activity_support_bank_info:I

    invoke-virtual {v1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 139
    sget v0, Lcom/huawei/wallet/R$id;->nfc_support_card_info_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mSupportCardList:Landroid/widget/GridView;

    .line 140
    sget v0, Lcom/huawei/wallet/R$id;->have_support_card_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mSupportBanksLayout:Landroid/widget/RelativeLayout;

    .line 141
    return-void
.end method

.method private setListViewHeightBasedOnChildren(Landroid/widget/GridView;)V
    .locals 7

    .line 254
    invoke-virtual {p1}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    .line 255
    if-nez v2, :cond_0

    .line 257
    return-void

    .line 259
    :cond_0
    const/4 v3, 0x0

    .line 261
    invoke-interface {v2}, Landroid/widget/ListAdapter;->getCount()I

    move-result v4

    .line 262
    const/4 v5, 0x0

    .line 264
    if-lez v4, :cond_1

    .line 266
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1, p1}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 267
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 269
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/view/View;->measure(II)V

    .line 270
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    .line 274
    :cond_1
    rem-int/lit8 v0, v4, 0x2

    if-nez v0, :cond_2

    .line 276
    div-int/lit8 v0, v4, 0x2

    mul-int v3, v0, v5

    goto :goto_0

    .line 280
    :cond_2
    div-int/lit8 v0, v4, 0x2

    add-int/lit8 v0, v0, 0x1

    mul-int v3, v0, v5

    .line 283
    :goto_0
    invoke-virtual {p1}, Landroid/widget/GridView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    .line 284
    iput v3, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 285
    invoke-virtual {p1, v6}, Landroid/widget/GridView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 286
    return-void
.end method

.method private showSupportBankInfos(Landroid/content/Context;)V
    .locals 2

    .line 151
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;)V

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->querySupportNFCBankInfos(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QuerySupportBankInfoCallback;)V

    .line 247
    return-void
.end method


# virtual methods
.method public dismissProgressDialog()V
    .locals 4

    .line 316
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 317
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 318
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    .line 319
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog21"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    :cond_0
    return-void
.end method

.method public showProgressDialog(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .line 298
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 299
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    .line 300
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p2}, Lo/egn;->e(Ljava/lang/String;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0, p3}, Lo/egn;->setCancelable(Z)V

    .line 302
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 305
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 306
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/SupportBankInfoView;->mLoadingDialog21:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 307
    const-string v0, "SupportBankInfoView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    :cond_1
    return-void
.end method
