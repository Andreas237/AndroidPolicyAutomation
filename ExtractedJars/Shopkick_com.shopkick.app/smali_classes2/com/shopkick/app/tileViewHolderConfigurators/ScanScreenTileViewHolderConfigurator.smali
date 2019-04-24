.class public Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ScanScreenTileViewHolderConfigurator.java"


# instance fields
.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->context:Landroid/content/Context;

    .line 36
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 37
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 38
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 39
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;)Lcom/shopkick/app/application/AppPreferences;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    return-object p0
.end method

.method static synthetic lambda$animateReportButtonToolTip$253(Landroid/widget/FrameLayout;Landroid/view/View;)V
    .locals 2

    const/4 p1, 0x0

    .line 214
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 215
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    const-wide/16 v0, 0x1f4

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method public static synthetic lambda$onBindViewHolder$252(Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x0

    .line 114
    invoke-virtual {p5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    iget-object v5, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v6, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iget-object v7, p4, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->reportProductUnavailability(Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private reportProductUnavailability(Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-static/range {v0 .. v6}, Lcom/shopkick/app/util/TileUtils;->reportProductUnavailability(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/logging/UserEventLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p4, 0x0

    .line 157
    invoke-virtual {p3, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 158
    invoke-virtual {p3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p3

    const-wide/16 p5, 0x0

    invoke-virtual {p3, p5, p6}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p3

    const-wide/16 v1, 0x1f4

    invoke-virtual {p3, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p3

    invoke-virtual {p3, p4}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/ViewPropertyAnimator;->start()V

    const p3, 0x7f080253

    .line 161
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 p3, 0x0

    .line 162
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 163
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setScaleX(F)V

    .line 164
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setScaleY(F)V

    .line 165
    invoke-virtual {p1}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/high16 p4, 0x3f800000    # 1.0f

    .line 166
    invoke-virtual {p1, p4}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 167
    invoke-virtual {p1, p4}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance v3, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 168
    invoke-virtual {p1, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v3, 0x12c

    .line 169
    invoke-virtual {p1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 170
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 173
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    const/high16 p1, -0x3ee00000    # -10.0f

    .line 174
    invoke-virtual {p2, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 175
    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 176
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 177
    invoke-virtual {p1, p5, p6}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 178
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 179
    invoke-virtual {p1, p4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 180
    invoke-virtual {p1, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance p3, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$1;

    invoke-direct {p3, p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;Landroid/view/View;)V

    .line 181
    invoke-virtual {p1, p3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 188
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method

.method private setupZoomClickListener(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    const/4 v0, 0x1

    .line 123
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 124
    new-instance v1, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v1, p2, v2, v3, v4}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;-><init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/logging/UserEventLogger;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x92

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 130
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 132
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 133
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 134
    iput-boolean v0, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 136
    instance-of v0, p1, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz v0, :cond_0

    .line 137
    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v1, v0, p2}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public animateReportButtonToolTip(Landroid/view/View;)V
    .locals 4

    const v0, 0x7f090547

    .line 192
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    .line 194
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    const/high16 v0, -0x3ee00000    # -10.0f

    .line 195
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationX(F)V

    const/4 v0, 0x0

    .line 196
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setAlpha(F)V

    .line 197
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v2, 0x7d0

    .line 198
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    .line 199
    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 200
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    .line 201
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator$2;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;)V

    .line 202
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    .line 210
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 213
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ScanScreenTileViewHolderConfigurator$Z6x0Iuqocnp_QkpcBJqLE479ZRI;

    invoke-direct {v0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ScanScreenTileViewHolderConfigurator$Z6x0Iuqocnp_QkpcBJqLE479ZRI;-><init>(Landroid/widget/FrameLayout;)V

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09053e

    .line 229
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0198

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f09053e

    .line 223
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 224
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 13

    .line 49
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f090545

    .line 50
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060022

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    .line 52
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600c6

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 53
    invoke-static {p2}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v2

    .line 54
    invoke-static {p2}, Lcom/shopkick/app/util/TileUtils;->isBarcodeScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v3

    .line 55
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-eqz v4, :cond_0

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    const-string v4, "0"

    :goto_0
    if-eqz v2, :cond_1

    .line 56
    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    const-string v5, "0"

    :goto_1
    const v6, 0x7f090671

    .line 58
    invoke-virtual {p1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    const/4 v7, 0x4

    const/4 v8, 0x0

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    move v9, v8

    goto :goto_2

    :cond_2
    move v9, v7

    .line 59
    :goto_2
    invoke-virtual {v6, v9}, Landroid/view/View;->setVisibility(I)V

    const v6, 0x7f0904bc

    .line 61
    invoke-virtual {p1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v6

    const v9, 0x7f090604

    .line 62
    invoke-virtual {p1, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v9

    const v10, 0x7f0900fc

    .line 63
    invoke-virtual {p1, v10}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v10

    const v11, 0x7f0900fd

    .line 64
    invoke-virtual {p1, v11}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v11

    const/16 v12, 0x8

    if-eqz v3, :cond_4

    .line 66
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_3

    .line 68
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 69
    invoke-virtual {v9, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 70
    invoke-virtual {v10, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 73
    :cond_3
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 74
    invoke-virtual {v9, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 75
    invoke-virtual {v10, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 77
    :goto_3
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4

    .line 80
    :cond_4
    invoke-virtual {v6, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 81
    invoke-virtual {v9, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 82
    invoke-virtual {v10, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_4
    const v3, 0x7f0904bb

    .line 86
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v3

    const v4, 0x7f090588

    .line 87
    invoke-virtual {p1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    if-eqz v2, :cond_6

    .line 90
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 93
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 94
    invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 95
    invoke-virtual {v11, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_5

    .line 97
    :cond_5
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 98
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 99
    invoke-virtual {v11, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 102
    :goto_5
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_6

    .line 105
    :cond_6
    invoke-virtual {v3, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 106
    invoke-virtual {v4, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_6
    const v0, 0x7f0905ac

    .line 109
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f090549

    .line 110
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getFrameLayout(I)Landroid/widget/FrameLayout;

    move-result-object v4

    const v1, 0x7f090547

    .line 111
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getFrameLayout(I)Landroid/widget/FrameLayout;

    move-result-object v5

    .line 113
    new-instance v7, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ScanScreenTileViewHolderConfigurator$rAp7P8Vn-6yx9O1mZ9oDL4X6yaY;

    move-object v1, v7

    move-object v2, p0

    move-object v3, v0

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ScanScreenTileViewHolderConfigurator$rAp7P8Vn-6yx9O1mZ9oDL4X6yaY;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanScreenTileViewHolderConfigurator;->setupZoomClickListener(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method
