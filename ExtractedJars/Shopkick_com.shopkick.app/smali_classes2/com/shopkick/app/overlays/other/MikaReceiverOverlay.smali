.class public Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "MikaReceiverOverlay.java"


# static fields
.field private static final FRIEND_IMAGE_RADIUS:I = 0x32


# instance fields
.field private friendImage:Lcom/shopkick/app/widget/RoundImageView;

.field private mainView:Landroid/view/View;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 4

    .line 50
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->mainView:Landroid/view/View;

    .line 52
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f09029d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/RoundImageView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->friendImage:Lcom/shopkick/app/widget/RoundImageView;

    .line 53
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->friendImage:Lcom/shopkick/app/widget/RoundImageView;

    const/16 v0, 0x32

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/RoundImageView;->setRadius(I)V

    .line 55
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->friendImage:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object v1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->friendImage:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 57
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f0901e6

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 58
    iget-object v1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    new-instance p1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v1, 0x1

    .line 61
    iput-boolean v1, p1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 63
    iget-object v1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f090112

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKButton;

    .line 64
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v3, 0x81

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v2, v0, p1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 66
    new-instance v0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$1;-><init>(Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;)V

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f0901bd

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 74
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x1d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 75
    iget-object v2, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, v2, p1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 76
    new-instance p1, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$2;

    invoke-direct {p1, p0}, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay$2;-><init>(Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;)V

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->friendImage:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0, v0}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/view/View;Landroid/view/View;)V

    .line 45
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c011b

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 38
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 39
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/other/MikaReceiverOverlay;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method
