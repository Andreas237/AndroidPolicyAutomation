.class public Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ReceiptProductSelectorForceItemCheckTileConfigurator.java"


# static fields
.field public static final BUTTON_STYLE_BASED_ON_K4RR_STORE:Ljava/lang/String; = "BUTTON_STYLE_BASED_ON_K4RR_STORE"

.field private static final CTA_BUTTON_PADDING:Ljava/lang/Integer;

.field public static final RECEIPT_TIPS_WEBVIEW_URL:Ljava/lang/String; = "sk://screen/top/webview?url=https://s3-us-west-2.amazonaws.com/shopkick-prod-programming/Grocery+Launch/Grocery+Receipt+Submission/how-to-receipt.html"


# instance fields
.field private context:Landroid/content/Context;

.field private cta_button:Lcom/shopkick/app/widget/UserEventTextView;

.field private displayMetrics:Landroid/util/DisplayMetrics;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->CTA_BUTTON_PADDING:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->context:Landroid/content/Context;

    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->displayMetrics:Landroid/util/DisplayMetrics;

    .line 33
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;Z)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->setClientLoggingForK4RRStore(Z)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method

.method private setClientLoggingForK4RRStore(Z)V
    .locals 2

    if-eqz p1, :cond_0

    const/16 p1, 0x172

    goto :goto_0

    :cond_0
    const/16 p1, 0x16f

    .line 79
    :goto_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 80
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private setupImpressionLogging(Z)V
    .locals 3

    if-eqz p1, :cond_0

    const/16 p1, 0x172

    goto :goto_0

    :cond_0
    const/16 p1, 0x16f

    .line 87
    :goto_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 89
    new-instance p1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 90
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 92
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->cta_button:Lcom/shopkick/app/widget/UserEventTextView;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0, v2, p1}, Lcom/shopkick/app/widget/UserEventTextView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c015e

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 42
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f0901bd

    .line 43
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/UserEventTextView;

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->cta_button:Lcom/shopkick/app/widget/UserEventTextView;

    .line 44
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p1

    const-string p2, "BUTTON_STYLE_BASED_ON_K4RR_STORE"

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 45
    sget-object p2, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->CTA_BUTTON_PADDING:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-float p2, p2

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    const/high16 v1, 0x43200000    # 160.0f

    div-float/2addr v0, v1

    mul-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->cta_button:Lcom/shopkick/app/widget/UserEventTextView;

    const v1, 0x7f1104ee

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/UserEventTextView;->setText(I)V

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->cta_button:Lcom/shopkick/app/widget/UserEventTextView;

    const v1, 0x7f080337

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/UserEventTextView;->setBackgroundResource(I)V

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->cta_button:Lcom/shopkick/app/widget/UserEventTextView;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f06015d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/UserEventTextView;->setTextColor(I)V

    goto :goto_0

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->cta_button:Lcom/shopkick/app/widget/UserEventTextView;

    const v1, 0x7f1104ea

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/UserEventTextView;->setText(I)V

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->cta_button:Lcom/shopkick/app/widget/UserEventTextView;

    const v1, 0x7f080292

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/UserEventTextView;->setBackgroundResource(I)V

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->cta_button:Lcom/shopkick/app/widget/UserEventTextView;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060120

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/UserEventTextView;->setTextColor(I)V

    .line 55
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->cta_button:Lcom/shopkick/app/widget/UserEventTextView;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/shopkick/app/widget/UserEventTextView;->setPadding(IIII)V

    .line 56
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->cta_button:Lcom/shopkick/app/widget/UserEventTextView;

    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator$1;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;Z)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/UserEventTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    invoke-direct {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptProductSelectorForceItemCheckTileConfigurator;->setupImpressionLogging(Z)V

    return-void
.end method
