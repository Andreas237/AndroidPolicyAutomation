.class public Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "ReceiptProductSelectorHeaderOverlay.java"


# instance fields
.field private cancelButton:Lcom/shopkick/app/logging/UserEventImageView;

.field private dispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private learnMoreButton:Lcom/shopkick/app/widget/SKButton;

.field private mainView:Landroid/view/View;

.field private okButton:Lcom/shopkick/app/widget/SKButton;

.field private overlayKey:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;)Ljava/lang/String;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->overlayKey:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;)Lcom/shopkick/app/activities/BaseActivity;
    .locals 0

    .line 20
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p0

    return-object p0
.end method

.method private setupImpressionLogging()V
    .locals 4

    .line 89
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x170

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 90
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->overlayKey:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/OverlayInfo;->enumForKey(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOverlay(Ljava/lang/Integer;)V

    .line 91
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 93
    iget-object v2, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->cancelButton:Lcom/shopkick/app/logging/UserEventImageView;

    iget-object v3, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v0, v3, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 47
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->mainView:Landroid/view/View;

    .line 48
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f0904d3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->okButton:Lcom/shopkick/app/widget/SKButton;

    .line 49
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f0900c6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->cancelButton:Lcom/shopkick/app/logging/UserEventImageView;

    .line 50
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f09040c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->learnMoreButton:Lcom/shopkick/app/widget/SKButton;

    .line 51
    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object p1

    const-class v0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->overlayKey:Ljava/lang/String;

    .line 52
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->learnMoreButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$1;-><init>(Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->okButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$2;-><init>(Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->cancelButton:Lcom/shopkick/app/logging/UserEventImageView;

    new-instance v0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay$3;-><init>(Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    invoke-direct {p0}, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->setupImpressionLogging()V

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0169

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 41
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 42
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/receipt/ReceiptProductSelectorHeaderOverlay;->dispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method
