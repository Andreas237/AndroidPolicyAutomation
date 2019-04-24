.class public Lcom/shopkick/app/overlays/scans/SaveProductOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "SaveProductOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# instance fields
.field private final ADD_BUTTON_WIDTH_DP:I

.field private buttonSave:Lcom/shopkick/app/widget/SKButton;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

.field private mainView:Landroid/view/View;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private productImage:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    const/16 v0, 0x91

    .line 39
    iput v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->ADD_BUTTON_WIDTH_DP:I

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/scans/SaveProductOverlay;)Landroid/view/View;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    return-object p0
.end method

.method public static getPreloadUrlsFromOverlaySpec(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 232
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 233
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->mainImageUrl:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 234
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method private setButtonSave()V
    .locals 4

    .line 176
    invoke-direct {p0}, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->shouldShowListAddButton()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 179
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0xd8

    .line 180
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 181
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductId(Ljava/lang/String;)V

    .line 182
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 183
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productId:Ljava/lang/String;

    iget-object v3, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/shoppinglists/ListAddController;->hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 184
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    const v2, 0x7f11068d

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 185
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    const v2, 0x7f08018c

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    .line 186
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    const v2, 0x7f08024e

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    const/16 v1, 0x41

    .line 187
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    goto :goto_0

    .line 189
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    const v2, 0x7f11068a

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 190
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    const v2, 0x7f0800ad

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    .line 191
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    const v2, 0x7f08024f

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonIcon(I)V

    const/16 v1, 0x46

    .line 192
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 194
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    goto :goto_1

    .line 198
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private setupButtonLogging(Lcom/shopkick/app/logging/IUserEventView;I)V
    .locals 2

    .line 169
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 170
    iget-object p2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductId(Ljava/lang/String;)V

    .line 171
    iget-object p2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 172
    iget-object p2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v1, 0x0

    invoke-interface {p1, v0, p2, v1}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private shouldShowListAddButton()Z
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productId:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 4

    .line 92
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f09053e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->productImage:Landroid/widget/ImageView;

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    const v0, 0x7f0900ab

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    .line 97
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    const v1, 0x7f0900ac

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 98
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f0900b5

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKButton;

    iput-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    .line 100
    invoke-direct {p0}, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->shouldShowListAddButton()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 102
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/SKButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v2, 0x91

    .line 103
    iget-object v3, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    invoke-static {v2, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 104
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/SKButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/SKButton;->requestLayout()V

    goto :goto_0

    .line 109
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 113
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    const v2, 0x7f090244

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    invoke-direct {p0}, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->setButtonSave()V

    const/16 v1, 0xbe

    .line 119
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->setupButtonLogging(Lcom/shopkick/app/logging/IUserEventView;I)V

    const/16 v1, 0x81

    .line 120
    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->setupButtonLogging(Lcom/shopkick/app/logging/IUserEventView;I)V

    .line 122
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/16 v2, 0xf

    .line 123
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v2, 0x10

    .line 124
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/SKButton;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    .line 128
    new-instance v1, Lcom/shopkick/app/overlays/scans/SaveProductOverlay$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/scans/SaveProductOverlay$1;-><init>(Lcom/shopkick/app/overlays/scans/SaveProductOverlay;)V

    .line 138
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->productImage:Landroid/widget/ImageView;

    invoke-static {v2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->productImage:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 141
    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    invoke-virtual {p1, p0}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/shopkick/app/logging/IUserEventView;->setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V

    .line 147
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 80
    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    invoke-interface {v0}, Lcom/shopkick/app/logging/IUserEventView;->stopMoatTracking()V

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->productImage:Landroid/widget/ImageView;

    invoke-static {v0, v0}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/view/View;Landroid/view/View;)V

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ListAddController;->destroy()V

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 87
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022d

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0191

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->mainView:Landroid/view/View;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 10

    .line 51
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 52
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 53
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    new-instance v0, Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v2, p1, Lcom/shopkick/app/application/ScreenGlobals;->shoppingListDataSource:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    iget-object v1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 56
    invoke-virtual {v1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v3

    iget-object v4, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v5, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v6, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const/4 v7, 0x0

    iget-object v8, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v9, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/shopkick/app/shoppinglists/ListAddController;-><init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    .line 63
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 67
    :cond_0
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyTitle:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 68
    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productId:Ljava/lang/String;

    .line 69
    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productName:Ljava/lang/String;

    goto :goto_0

    .line 71
    :cond_1
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productId:Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productName:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 72
    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    .line 73
    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyTitle:Ljava/lang/String;

    :cond_2
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->buttonSave:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->shouldShowListAddButton()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 219
    iget-object p1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productName:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyTitle:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productName:Ljava/lang/String;

    :goto_0
    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/app/shoppinglists/ListAddController;->addProductOrScanListEntry(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 224
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->dismiss()V

    :goto_1
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 245
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x2eb25a03

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "EVENT_LIST_ADD_CONTROLLER_ITEM_ADDED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "PARAM_LIST_ADD_CONTROLLER_ADDED_ITEM_ID"

    .line 247
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 248
    iget-object p2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 249
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->setButtonSave()V

    :cond_4
    :goto_2
    return-void
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 152
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductId(Ljava/lang/String;)V

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/overlays/scans/SaveProductOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
