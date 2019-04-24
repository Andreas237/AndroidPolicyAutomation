.class public Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;
.super Landroid/app/Dialog;
.source "RedeemMarketingPromoCodeOverlay.java"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/screens/UIEventLogUpdateCallback;


# instance fields
.field private final applyButton:Lcom/shopkick/app/widget/SKButton;

.field private final applyButtonProgressSpinner:Landroid/widget/ProgressBar;

.field private applyingCode:Z

.field private final cancelButton:Lcom/shopkick/app/widget/SKButton;

.field private final eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private final greenCheckMark:Landroid/widget/ImageView;

.field private final overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;

.field private final promoCodeEditText:Landroid/widget/EditText;

.field private final promoCodeInputLayout:Landroid/support/design/widget/TextInputLayout;

.field private redeemMarketingPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

.field private final userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/account/UserAccountDataSource;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f12022d

    .line 59
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 60
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->getWindow()Landroid/view/Window;

    move-result-object p1

    const-string/jumbo v0, "userAccountDataSource is requried for RedeemMarketingPromoCodeOverlay"

    .line 61
    invoke-static {p4, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "window object cannot be null when creating RedeemMarketingPromoCodeOverlay"

    .line 62
    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "overlaysManager is required for RedeemMarketingPromoCodeOverlay"

    .line 63
    invoke-static {p2, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "eventLogger is required for RedeemMarketingPromoCodeOverlay"

    .line 64
    invoke-static {p3, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    iput-object p2, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;

    .line 67
    iget-object p2, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->enableOverlay(Z)V

    .line 68
    iput-object p3, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 69
    iput-object p4, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 70
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyingCode:Z

    const p2, 0x7f0c017b

    .line 72
    invoke-virtual {p0, p2}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->setContentView(I)V

    const/4 p2, -0x1

    .line 74
    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setLayout(II)V

    const p1, 0x7f0900c6

    .line 76
    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->cancelButton:Lcom/shopkick/app/widget/SKButton;

    const p1, 0x7f090041

    .line 77
    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->cancelButton:Lcom/shopkick/app/widget/SKButton;

    const/16 p2, 0x145

    const/16 p3, 0x30

    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->setupEventLogForButton(Lcom/shopkick/app/logging/IUserEventView;II)V

    .line 79
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    const/16 p2, 0x144

    const/4 p3, 0x7

    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->setupEventLogForButton(Lcom/shopkick/app/logging/IUserEventView;II)V

    const p1, 0x7f090554

    .line 80
    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    .line 81
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    const p2, 0x7f1103e1

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setHint(I)V

    const p1, 0x7f09055e

    .line 82
    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/design/widget/TextInputLayout;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeInputLayout:Landroid/support/design/widget/TextInputLayout;

    const p1, 0x7f090042

    .line 83
    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButtonProgressSpinner:Landroid/widget/ProgressBar;

    const p1, 0x7f0902cc

    .line 84
    invoke-virtual {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->greenCheckMark:Landroid/widget/ImageView;

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->greenCheckMark:Landroid/widget/ImageView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 89
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 90
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButtonProgressSpinner:Landroid/widget/ProgressBar;

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->cancelButton:Lcom/shopkick/app/widget/SKButton;

    new-instance p2, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$1;

    invoke-direct {p2, p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$1;-><init>(Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    new-instance p2, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$2;

    invoke-direct {p2, p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$2;-><init>(Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->onApplyButtonClicked()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;)Lcom/shopkick/app/overlays/base/OverlaysManager;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;

    return-object p0
.end method

.method private logCodeAppliedStatus(I)V
    .locals 1

    .line 196
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 197
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private onApplyButtonClicked()V
    .locals 2

    .line 251
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButtonProgressSpinner:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 252
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 253
    invoke-virtual {p0, v1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->setCancelable(Z)V

    const/4 v0, 0x1

    .line 254
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyingCode:Z

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 256
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 255
    invoke-virtual {v0, v1, p0}, Lcom/shopkick/app/account/UserAccountDataSource;->makeRedeemMarketingPromoCodeRequest(Ljava/lang/String;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->redeemMarketingPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    return-void
.end method

.method private setCodeAppliedErrorState(Ljava/lang/String;)V
    .locals 3

    .line 205
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060121

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 206
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setTextColor(I)V

    .line 207
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v0, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 208
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setCodeAppliedState()V
    .locals 4

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f08018c

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 226
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    const v2, 0x7f110556

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButtonProgressSpinner:Landroid/widget/ProgressBar;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 228
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->getContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f0600ce

    invoke-static {v0, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 229
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->clearFocus()V

    .line 230
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setTextColor(I)V

    .line 231
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 232
    iget-object v2, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v0, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->greenCheckMark:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 236
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 237
    new-instance v1, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay$3;-><init>(Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;)V

    const-wide/16 v2, 0x7d0

    .line 247
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private setupEventLogForButton(Lcom/shopkick/app/logging/IUserEventView;II)V
    .locals 1

    .line 285
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {v0, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 286
    iget-object p2, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 p3, 0x0

    invoke-interface {p1, v0, p2, p3}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 126
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyingCode:Z

    if-eqz v0, :cond_1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->redeemMarketingPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;->promoCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 129
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->redeemMarketingPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;->promoCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 130
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    :cond_0
    return-void

    .line 136
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeInputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 138
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 141
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060120

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 143
    iget-object v1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 144
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 146
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setTextColor(I)V

    .line 147
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 150
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->redeemMarketingPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    if-ne p1, v0, :cond_3

    const/4 p1, 0x0

    .line 164
    iput-boolean p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyingCode:Z

    .line 165
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButtonProgressSpinner:Landroid/widget/ProgressBar;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 166
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    .line 168
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeResponse;

    .line 169
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeResponse;->redemptionStatus:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_0

    .line 170
    invoke-direct {p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->setCodeAppliedState()V

    const p1, 0xaae61

    .line 171
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->logCodeAppliedStatus(I)V

    goto :goto_1

    :cond_0
    const p2, 0xaae62

    .line 173
    invoke-direct {p0, p2}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->logCodeAppliedStatus(I)V

    .line 174
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeResponse;->errorMessage:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->setCodeAppliedErrorState(Ljava/lang/String;)V

    goto :goto_1

    .line 177
    :cond_1
    iget p1, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    .line 178
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f110553

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->setCodeAppliedErrorState(Ljava/lang/String;)V

    const p1, 0xaae64

    .line 179
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->logCodeAppliedStatus(I)V

    goto :goto_0

    .line 181
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f110359

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->setCodeAppliedErrorState(Ljava/lang/String;)V

    const p1, 0xaae63

    .line 182
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->logCodeAppliedStatus(I)V

    .line 184
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->applyButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 188
    :goto_1
    invoke-virtual {p0, v0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->setCancelable(Z)V

    .line 189
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->promoCodeEditText:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setEnabled(Z)V

    const/4 p1, 0x0

    .line 191
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->redeemMarketingPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    :cond_3
    return-void
.end method

.method public dismiss()V
    .locals 2

    .line 213
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->getWindow()Landroid/view/Window;

    move-result-object v0

    const-string/jumbo v1, "window should not be null before dismiss the dialog."

    .line 214
    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x2

    .line 215
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 216
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public show()V
    .locals 1

    .line 120
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/overlays/value/RedeemMarketingPromoCodeOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedShowPage()V

    return-void
.end method

.method public updateOriginScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method

.method public updateOverlayParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method

.method public updateScreenImpressionParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 0

    return-void
.end method
