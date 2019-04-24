.class public Lcom/stripe/android/view/AddSourceActivity;
.super Lcom/stripe/android/view/StripeActivity;
.source "AddSourceActivity.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/AddSourceActivity$CustomerSessionProxy;,
        Lcom/stripe/android/view/AddSourceActivity$StripeProvider;
    }
.end annotation


# instance fields
.field mCardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

.field mCustomerSessionProxy:Lcom/stripe/android/view/AddSourceActivity$CustomerSessionProxy;

.field mErrorLayout:Landroid/widget/FrameLayout;

.field private mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

.field private mStartedFromPaymentSession:Z

.field mStripeProvider:Lcom/stripe/android/view/AddSourceActivity$StripeProvider;

.field private mUpdatesCustomer:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/stripe/android/view/StripeActivity;-><init>()V

    .line 49
    new-instance v0, Lcom/stripe/android/view/AddSourceActivity$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/AddSourceActivity$1;-><init>(Lcom/stripe/android/view/AddSourceActivity;)V

    iput-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/view/AddSourceActivity;)Z
    .locals 0

    .line 33
    iget-boolean p0, p0, Lcom/stripe/android/view/AddSourceActivity;->mUpdatesCustomer:Z

    return p0
.end method

.method static synthetic access$100(Lcom/stripe/android/view/AddSourceActivity;Lcom/stripe/android/model/StripePaymentSource;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/stripe/android/view/AddSourceActivity;->attachCardToCustomer(Lcom/stripe/android/model/StripePaymentSource;)V

    return-void
.end method

.method static synthetic access$200(Lcom/stripe/android/view/AddSourceActivity;Lcom/stripe/android/model/Source;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/stripe/android/view/AddSourceActivity;->finishWithSource(Lcom/stripe/android/model/Source;)V

    return-void
.end method

.method private attachCardToCustomer(Lcom/stripe/android/model/StripePaymentSource;)V
    .locals 3

    .line 159
    new-instance v0, Lcom/stripe/android/view/AddSourceActivity$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/AddSourceActivity$3;-><init>(Lcom/stripe/android/view/AddSourceActivity;)V

    .line 174
    iget-object v1, p0, Lcom/stripe/android/view/AddSourceActivity;->mCustomerSessionProxy:Lcom/stripe/android/view/AddSourceActivity$CustomerSessionProxy;

    if-nez v1, :cond_2

    .line 176
    instance-of v1, p1, Lcom/stripe/android/model/Source;

    if-eqz v1, :cond_0

    .line 177
    move-object v1, p1

    check-cast v1, Lcom/stripe/android/model/Source;

    invoke-virtual {v1}, Lcom/stripe/android/model/Source;->getType()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 178
    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/Card;

    if-eqz v1, :cond_1

    const-string v1, "card"

    goto :goto_0

    :cond_1
    const-string v1, "unknown"

    .line 185
    :goto_0
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object v2

    .line 187
    invoke-interface {p1}, Lcom/stripe/android/model/StripePaymentSource;->getId()Ljava/lang/String;

    move-result-object p1

    .line 185
    invoke-virtual {v2, p0, p1, v1, v0}, Lcom/stripe/android/CustomerSession;->addCustomerSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$SourceRetrievalListener;)V

    goto :goto_1

    .line 191
    :cond_2
    invoke-interface {p1}, Lcom/stripe/android/model/StripePaymentSource;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Lcom/stripe/android/view/AddSourceActivity$CustomerSessionProxy;->addCustomerSource(Ljava/lang/String;Lcom/stripe/android/CustomerSession$SourceRetrievalListener;)V

    :goto_1
    return-void
.end method

.method private finishWithSource(Lcom/stripe/android/model/Source;)V
    .locals 2
    .param p1    # Lcom/stripe/android/model/Source;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 213
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/AddSourceActivity;->setCommunicatingProgress(Z)V

    .line 214
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "new_source"

    .line 215
    invoke-virtual {p1}, Lcom/stripe/android/model/Source;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, -0x1

    .line 216
    invoke-virtual {p0, p1, v0}, Lcom/stripe/android/view/AddSourceActivity;->setResult(ILandroid/content/Intent;)V

    .line 217
    invoke-virtual {p0}, Lcom/stripe/android/view/AddSourceActivity;->finish()V

    return-void
.end method

.method private getStripe()Lcom/stripe/android/Stripe;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mStripeProvider:Lcom/stripe/android/view/AddSourceActivity$StripeProvider;

    if-nez v0, :cond_0

    .line 222
    new-instance v0, Lcom/stripe/android/Stripe;

    invoke-direct {v0, p0}, Lcom/stripe/android/Stripe;-><init>(Landroid/content/Context;)V

    return-object v0

    .line 224
    :cond_0
    invoke-interface {v0, p0}, Lcom/stripe/android/view/AddSourceActivity$StripeProvider;->getStripe(Landroid/content/Context;)Lcom/stripe/android/Stripe;

    move-result-object v0

    return-object v0
.end method

.method private initEnterListeners()V
    .locals 2

    .line 107
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mCardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    sget v1, Lcom/stripe/android/R$id;->et_add_source_card_number_ml:I

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/stripe/android/view/AddSourceActivity;->mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    .line 108
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 109
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mCardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    sget v1, Lcom/stripe/android/R$id;->et_add_source_expiry_ml:I

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/stripe/android/view/AddSourceActivity;->mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    .line 110
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 111
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mCardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    sget v1, Lcom/stripe/android/R$id;->et_add_source_cvc_ml:I

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/stripe/android/view/AddSourceActivity;->mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    .line 112
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 113
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mCardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    sget v1, Lcom/stripe/android/R$id;->et_add_source_postal_ml:I

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/stripe/android/view/AddSourceActivity;->mOnEditorActionListener:Landroid/widget/TextView$OnEditorActionListener;

    .line 114
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method private logToCustomerSessionIf(Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 196
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mCustomerSessionProxy:Lcom/stripe/android/view/AddSourceActivity$CustomerSessionProxy;

    if-eqz v0, :cond_0

    .line 197
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/AddSourceActivity;->logToProxyIf(Ljava/lang/String;Z)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 202
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/stripe/android/CustomerSession;->addProductUsageTokenIfValid(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private logToProxyIf(Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 207
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mCustomerSessionProxy:Lcom/stripe/android/view/AddSourceActivity$CustomerSessionProxy;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 208
    invoke-interface {v0, p1}, Lcom/stripe/android/view/AddSourceActivity$CustomerSessionProxy;->addProductUsageTokenIfValid(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static newIntent(Landroid/content/Context;ZZ)Landroid/content/Intent;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 79
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/stripe/android/view/AddSourceActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "show_zip"

    .line 80
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p0, "update_customer"

    .line 81
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method initCustomerSessionTokens()V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "AddSourceActivity"

    .line 119
    iget-boolean v1, p0, Lcom/stripe/android/view/AddSourceActivity;->mUpdatesCustomer:Z

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/view/AddSourceActivity;->logToCustomerSessionIf(Ljava/lang/String;Z)V

    const-string v0, "PaymentSession"

    .line 120
    iget-boolean v1, p0, Lcom/stripe/android/view/AddSourceActivity;->mStartedFromPaymentSession:Z

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/view/AddSourceActivity;->logToCustomerSessionIf(Ljava/lang/String;Z)V

    return-void
.end method

.method protected onActionSave()V
    .locals 3

    .line 125
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mCardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget;->getCard()Lcom/stripe/android/model/Card;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "AddSourceActivity"

    .line 131
    invoke-virtual {v0, v1}, Lcom/stripe/android/model/Card;->addLoggingToken(Ljava/lang/String;)Lcom/stripe/android/model/Card;

    .line 132
    invoke-direct {p0}, Lcom/stripe/android/view/AddSourceActivity;->getStripe()Lcom/stripe/android/Stripe;

    move-result-object v1

    .line 133
    invoke-static {}, Lcom/stripe/android/PaymentConfiguration;->getInstance()Lcom/stripe/android/PaymentConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/Stripe;->setDefaultPublishableKey(Ljava/lang/String;)V

    .line 135
    invoke-static {v0}, Lcom/stripe/android/model/SourceParams;->createCardParams(Lcom/stripe/android/model/Card;)Lcom/stripe/android/model/SourceParams;

    move-result-object v0

    const/4 v2, 0x1

    .line 136
    invoke-virtual {p0, v2}, Lcom/stripe/android/view/AddSourceActivity;->setCommunicatingProgress(Z)V

    .line 138
    new-instance v2, Lcom/stripe/android/view/AddSourceActivity$2;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/AddSourceActivity$2;-><init>(Lcom/stripe/android/view/AddSourceActivity;)V

    invoke-virtual {v1, v0, v2}, Lcom/stripe/android/Stripe;->createSource(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/SourceCallback;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 87
    invoke-super {p0, p1}, Lcom/stripe/android/view/StripeActivity;->onCreate(Landroid/os/Bundle;)V

    .line 88
    iget-object p1, p0, Lcom/stripe/android/view/AddSourceActivity;->mViewStub:Landroid/view/ViewStub;

    sget v0, Lcom/stripe/android/R$layout;->activity_add_source:I

    invoke-virtual {p1, v0}, Landroid/view/ViewStub;->setLayoutResource(I)V

    .line 89
    iget-object p1, p0, Lcom/stripe/android/view/AddSourceActivity;->mViewStub:Landroid/view/ViewStub;

    instance-of v0, p1, Landroid/view/ViewStub;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/ViewStub;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->inflate(Landroid/view/ViewStub;)Landroid/view/View;

    .line 90
    :goto_0
    sget p1, Lcom/stripe/android/R$id;->add_source_card_entry_widget:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/AddSourceActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/view/CardMultilineWidget;

    iput-object p1, p0, Lcom/stripe/android/view/AddSourceActivity;->mCardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    .line 91
    invoke-direct {p0}, Lcom/stripe/android/view/AddSourceActivity;->initEnterListeners()V

    .line 92
    sget p1, Lcom/stripe/android/R$id;->add_source_error_container:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/AddSourceActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/stripe/android/view/AddSourceActivity;->mErrorLayout:Landroid/widget/FrameLayout;

    .line 93
    invoke-virtual {p0}, Lcom/stripe/android/view/AddSourceActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "show_zip"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    .line 94
    invoke-virtual {p0}, Lcom/stripe/android/view/AddSourceActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "update_customer"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mUpdatesCustomer:Z

    .line 96
    invoke-virtual {p0}, Lcom/stripe/android/view/AddSourceActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "payment_session_active"

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mStartedFromPaymentSession:Z

    .line 97
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mCardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowPostalCode(Z)V

    .line 99
    iget-boolean p1, p0, Lcom/stripe/android/view/AddSourceActivity;->mUpdatesCustomer:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/view/AddSourceActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "proxy_delay"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_1

    .line 100
    invoke-virtual {p0}, Lcom/stripe/android/view/AddSourceActivity;->initCustomerSessionTokens()V

    .line 103
    :cond_1
    sget p1, Lcom/stripe/android/R$string;->title_add_a_card:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/AddSourceActivity;->setTitle(I)V

    return-void
.end method

.method public bridge synthetic onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 0

    .line 33
    invoke-super {p0, p1}, Lcom/stripe/android/view/StripeActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 0

    .line 33
    invoke-super {p0, p1}, Lcom/stripe/android/view/StripeActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 0

    .line 33
    invoke-super {p0, p1}, Lcom/stripe/android/view/StripeActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method protected setCommunicatingProgress(Z)V
    .locals 1

    .line 230
    invoke-super {p0, p1}, Lcom/stripe/android/view/StripeActivity;->setCommunicatingProgress(Z)V

    .line 231
    iget-object v0, p0, Lcom/stripe/android/view/AddSourceActivity;->mCardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    if-eqz v0, :cond_0

    xor-int/lit8 p1, p1, 0x1

    .line 232
    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setEnabled(Z)V

    :cond_0
    return-void
.end method
