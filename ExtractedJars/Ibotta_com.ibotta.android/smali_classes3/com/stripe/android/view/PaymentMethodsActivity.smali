.class public Lcom/stripe/android/view/PaymentMethodsActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "PaymentMethodsActivity.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private mCommunicating:Z

.field private mCustomer:Lcom/stripe/android/model/Customer;

.field private mCustomerSessionProxy:Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;

.field private mMaskedCardAdapter:Lcom/stripe/android/view/MaskedCardAdapter;

.field private mProgressBar:Landroid/widget/ProgressBar;

.field private mRecyclerView:Landroid/support/v7/widget/RecyclerView;

.field private mRecyclerViewUpdated:Z

.field private mStartedFromPaymentSession:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/view/PaymentMethodsActivity;)Z
    .locals 0

    .line 36
    iget-boolean p0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mStartedFromPaymentSession:Z

    return p0
.end method

.method static synthetic access$100(Lcom/stripe/android/view/PaymentMethodsActivity;Lcom/stripe/android/model/Customer;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->updateCustomerAndSetDefaultSourceIfNecessary(Lcom/stripe/android/model/Customer;)V

    return-void
.end method

.method static synthetic access$200(Lcom/stripe/android/view/PaymentMethodsActivity;Ljava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->showError(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/stripe/android/view/PaymentMethodsActivity;Z)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->setCommunicatingProgress(Z)V

    return-void
.end method

.method static synthetic access$400(Lcom/stripe/android/view/PaymentMethodsActivity;Lcom/stripe/android/model/Customer;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->updateAdapterWithCustomer(Lcom/stripe/android/model/Customer;)V

    return-void
.end method

.method static synthetic access$502(Lcom/stripe/android/view/PaymentMethodsActivity;Lcom/stripe/android/model/Customer;)Lcom/stripe/android/model/Customer;
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomer:Lcom/stripe/android/model/Customer;

    return-object p1
.end method

.method static synthetic access$600(Lcom/stripe/android/view/PaymentMethodsActivity;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->createListFromCustomerSources()V

    return-void
.end method

.method static synthetic access$700(Lcom/stripe/android/view/PaymentMethodsActivity;Ljava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->finishWithSelection(Ljava/lang/String;)V

    return-void
.end method

.method private cancelAndFinish()V
    .locals 1

    const/4 v0, 0x0

    .line 279
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PaymentMethodsActivity;->setResult(I)V

    .line 280
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->finish()V

    return-void
.end method

.method private createListFromCustomerSources()V
    .locals 3

    const/4 v0, 0x0

    .line 252
    invoke-direct {p0, v0}, Lcom/stripe/android/view/PaymentMethodsActivity;->setCommunicatingProgress(Z)V

    .line 253
    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomer:Lcom/stripe/android/model/Customer;

    if-nez v1, :cond_0

    return-void

    .line 257
    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/model/Customer;->getSources()Ljava/util/List;

    move-result-object v1

    .line 259
    iget-boolean v2, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mRecyclerViewUpdated:Z

    if-nez v2, :cond_1

    .line 260
    new-instance v2, Lcom/stripe/android/view/MaskedCardAdapter;

    invoke-direct {v2, v1}, Lcom/stripe/android/view/MaskedCardAdapter;-><init>(Ljava/util/List;)V

    iput-object v2, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mMaskedCardAdapter:Lcom/stripe/android/view/MaskedCardAdapter;

    .line 262
    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 263
    iget-object v2, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 264
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 265
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mMaskedCardAdapter:Lcom/stripe/android/view/MaskedCardAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    const/4 v0, 0x1

    .line 266
    iput-boolean v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mRecyclerViewUpdated:Z

    goto :goto_0

    .line 268
    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mMaskedCardAdapter:Lcom/stripe/android/view/MaskedCardAdapter;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/MaskedCardAdapter;->setCustomerSourceList(Ljava/util/List;)V

    .line 271
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomer:Lcom/stripe/android/model/Customer;

    invoke-virtual {v0}, Lcom/stripe/android/model/Customer;->getDefaultSource()Ljava/lang/String;

    move-result-object v0

    .line 272
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 273
    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mMaskedCardAdapter:Lcom/stripe/android/view/MaskedCardAdapter;

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/MaskedCardAdapter;->setSelectedSource(Ljava/lang/String;)Z

    .line 275
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mMaskedCardAdapter:Lcom/stripe/android/view/MaskedCardAdapter;

    invoke-virtual {v0}, Lcom/stripe/android/view/MaskedCardAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method private finishWithSelection(Ljava/lang/String;)V
    .locals 2

    .line 284
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomer:Lcom/stripe/android/model/Customer;

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/Customer;->getSourceById(Ljava/lang/String;)Lcom/stripe/android/model/CustomerSource;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 286
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "selected_payment"

    .line 287
    invoke-virtual {p1}, Lcom/stripe/android/model/CustomerSource;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, -0x1

    .line 288
    invoke-virtual {p0, p1, v0}, Lcom/stripe/android/view/PaymentMethodsActivity;->setResult(ILandroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 290
    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->setResult(I)V

    .line 293
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->finish()V

    return-void
.end method

.method private getCustomerFromSession()V
    .locals 2

    .line 297
    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$4;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$4;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    const/4 v1, 0x1

    .line 311
    invoke-direct {p0, v1}, Lcom/stripe/android/view/PaymentMethodsActivity;->setCommunicatingProgress(Z)V

    .line 312
    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomerSessionProxy:Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;

    if-nez v1, :cond_0

    .line 313
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/stripe/android/CustomerSession;->retrieveCurrentCustomer(Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V

    goto :goto_0

    .line 315
    :cond_0
    invoke-interface {v1, v0}, Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;->retrieveCurrentCustomer(Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V

    :goto_0
    return-void
.end method

.method private initLoggingTokens()V
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomerSessionProxy:Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;

    if-nez v0, :cond_1

    .line 179
    iget-boolean v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mStartedFromPaymentSession:Z

    if-eqz v0, :cond_0

    .line 180
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object v0

    const-string v1, "PaymentSession"

    invoke-virtual {v0, v1}, Lcom/stripe/android/CustomerSession;->addProductUsageTokenIfValid(Ljava/lang/String;)V

    .line 182
    :cond_0
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object v0

    const-string v1, "PaymentMethodsActivity"

    invoke-virtual {v0, v1}, Lcom/stripe/android/CustomerSession;->addProductUsageTokenIfValid(Ljava/lang/String;)V

    goto :goto_0

    .line 184
    :cond_1
    iget-boolean v1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mStartedFromPaymentSession:Z

    if-eqz v1, :cond_2

    const-string v1, "PaymentSession"

    .line 185
    invoke-interface {v0, v1}, Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;->addProductUsageTokenIfValid(Ljava/lang/String;)V

    .line 187
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomerSessionProxy:Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;

    const-string v1, "PaymentMethodsActivity"

    invoke-interface {v0, v1}, Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;->addProductUsageTokenIfValid(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private setCommunicatingProgress(Z)V
    .locals 1

    .line 320
    iput-boolean p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCommunicating:Z

    if-eqz p1, :cond_0

    .line 322
    iget-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mProgressBar:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 324
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mProgressBar:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 326
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->supportInvalidateOptionsMenu()V

    return-void
.end method

.method private setSelectionAndFinish()V
    .locals 4

    .line 330
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mMaskedCardAdapter:Lcom/stripe/android/view/MaskedCardAdapter;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/stripe/android/view/MaskedCardAdapter;->getSelectedSource()Lcom/stripe/android/model/CustomerSource;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 335
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mMaskedCardAdapter:Lcom/stripe/android/view/MaskedCardAdapter;

    invoke-virtual {v0}, Lcom/stripe/android/view/MaskedCardAdapter;->getSelectedSource()Lcom/stripe/android/model/CustomerSource;

    move-result-object v0

    .line 336
    new-instance v1, Lcom/stripe/android/view/PaymentMethodsActivity$5;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$5;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    if-eqz v0, :cond_3

    .line 352
    invoke-virtual {v0}, Lcom/stripe/android/model/CustomerSource;->getId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 355
    :cond_1
    iget-object v2, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomerSessionProxy:Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;

    if-nez v2, :cond_2

    .line 356
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object v2

    .line 357
    invoke-virtual {v0}, Lcom/stripe/android/model/CustomerSource;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/stripe/android/model/CustomerSource;->getSourceType()Ljava/lang/String;

    move-result-object v0

    .line 356
    invoke-virtual {v2, p0, v3, v0, v1}, Lcom/stripe/android/CustomerSession;->setCustomerDefaultSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V

    goto :goto_0

    .line 360
    :cond_2
    invoke-virtual {v0}, Lcom/stripe/android/model/CustomerSource;->getId()Ljava/lang/String;

    move-result-object v3

    .line 361
    invoke-virtual {v0}, Lcom/stripe/android/model/CustomerSource;->getSourceType()Ljava/lang/String;

    move-result-object v0

    .line 359
    invoke-interface {v2, v3, v0, v1}, Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;->setCustomerDefaultSource(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V

    :goto_0
    const/4 v0, 0x1

    .line 364
    invoke-direct {p0, v0}, Lcom/stripe/android/view/PaymentMethodsActivity;->setCommunicatingProgress(Z)V

    return-void

    :cond_3
    :goto_1
    return-void

    .line 331
    :cond_4
    :goto_2
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->cancelAndFinish()V

    return-void
.end method

.method private showError(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 368
    new-instance v0, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 369
    invoke-virtual {v0, p1}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 370
    invoke-virtual {p1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setCancelable(Z)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$6;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$6;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    const v1, 0x104000a

    .line 371
    invoke-virtual {p1, v1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    .line 377
    invoke-virtual {p1}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object p1

    .line 378
    invoke-virtual {p1}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method

.method private updateAdapterWithCustomer(Lcom/stripe/android/model/Customer;)V
    .locals 1
    .param p1    # Lcom/stripe/android/model/Customer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 382
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mMaskedCardAdapter:Lcom/stripe/android/view/MaskedCardAdapter;

    if-nez v0, :cond_0

    .line 383
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->createListFromCustomerSources()V

    .line 384
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomer:Lcom/stripe/android/model/Customer;

    if-nez v0, :cond_0

    return-void

    .line 388
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mMaskedCardAdapter:Lcom/stripe/android/view/MaskedCardAdapter;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/MaskedCardAdapter;->updateCustomer(Lcom/stripe/android/model/Customer;)V

    const/4 p1, 0x0

    .line 389
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->setCommunicatingProgress(Z)V

    return-void
.end method

.method private updateCustomerAndSetDefaultSourceIfNecessary(Lcom/stripe/android/model/Customer;)V
    .locals 3
    .param p1    # Lcom/stripe/android/model/Customer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 202
    invoke-virtual {p1}, Lcom/stripe/android/model/Customer;->getDefaultSource()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/stripe/android/model/Customer;->getSources()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_2

    .line 207
    :cond_0
    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$3;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$3;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    .line 227
    invoke-virtual {p1}, Lcom/stripe/android/model/Customer;->getSources()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/CustomerSource;

    if-eqz v1, :cond_3

    .line 228
    invoke-virtual {v1}, Lcom/stripe/android/model/CustomerSource;->getId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 237
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomerSessionProxy:Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;

    if-nez p1, :cond_2

    .line 238
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object p1

    .line 240
    invoke-virtual {v1}, Lcom/stripe/android/model/CustomerSource;->getId()Ljava/lang/String;

    move-result-object v2

    .line 241
    invoke-virtual {v1}, Lcom/stripe/android/model/CustomerSource;->getSourceType()Ljava/lang/String;

    move-result-object v1

    .line 238
    invoke-virtual {p1, p0, v2, v1, v0}, Lcom/stripe/android/CustomerSession;->setCustomerDefaultSource(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V

    goto :goto_0

    .line 245
    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/model/CustomerSource;->getId()Ljava/lang/String;

    move-result-object v2

    .line 246
    invoke-virtual {v1}, Lcom/stripe/android/model/CustomerSource;->getSourceType()Ljava/lang/String;

    move-result-object v1

    .line 244
    invoke-interface {p1, v2, v1, v0}, Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;->setCustomerDefaultSource(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V

    :goto_0
    return-void

    .line 233
    :cond_3
    :goto_1
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->updateAdapterWithCustomer(Lcom/stripe/android/model/Customer;)V

    return-void

    .line 203
    :cond_4
    :goto_2
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->updateAdapterWithCustomer(Lcom/stripe/android/model/Customer;)V

    return-void
.end method


# virtual methods
.method initializeCustomerSourceData()V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomerSessionProxy:Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;

    if-nez v0, :cond_0

    .line 161
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/CustomerSession;->getCachedCustomer()Lcom/stripe/android/model/Customer;

    move-result-object v0

    goto :goto_0

    .line 162
    :cond_0
    invoke-interface {v0}, Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;->getCachedCustomer()Lcom/stripe/android/model/Customer;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 165
    iput-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomer:Lcom/stripe/android/model/Customer;

    .line 166
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->createListFromCustomerSources()V

    goto :goto_1

    .line 168
    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getCustomerFromSession()V

    :goto_1
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 97
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/AppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0x2bc

    if-ne p1, p3, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    const/4 p1, 0x1

    .line 99
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->setCommunicatingProgress(Z)V

    .line 100
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->initLoggingTokens()V

    .line 101
    new-instance p1, Lcom/stripe/android/view/PaymentMethodsActivity$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$2;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    .line 115
    iget-object p2, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCustomerSessionProxy:Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;

    if-nez p2, :cond_0

    .line 116
    invoke-static {}, Lcom/stripe/android/CustomerSession;->getInstance()Lcom/stripe/android/CustomerSession;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/stripe/android/CustomerSession;->updateCurrentCustomer(Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V

    goto :goto_0

    .line 118
    :cond_0
    invoke-interface {p2, p1}, Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;->updateCurrentCustomer(Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "PaymentMethodsActivity"

    invoke-static {v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->startTracing(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "PaymentMethodsActivity#onCreate"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "PaymentMethodsActivity#onCreate"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 59
    sget p1, Lcom/stripe/android/R$layout;->activity_payment_methods:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->setContentView(I)V

    .line 61
    sget p1, Lcom/stripe/android/R$id;->payment_methods_progress_bar:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mProgressBar:Landroid/widget/ProgressBar;

    .line 62
    sget p1, Lcom/stripe/android/R$id;->payment_methods_recycler:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/RecyclerView;

    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 63
    sget p1, Lcom/stripe/android/R$id;->payment_methods_add_payment_container:I

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 65
    new-instance v0, Lcom/stripe/android/view/PaymentMethodsActivity$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/PaymentMethodsActivity$1;-><init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_0
    move-object v1, p1

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 80
    :goto_1
    sget v0, Lcom/stripe/android/R$id;->payment_methods_toolbar:I

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PaymentMethodsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    .line 81
    invoke-virtual {p0, v0}, Lcom/stripe/android/view/PaymentMethodsActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 82
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 83
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 86
    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "proxy_delay"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 88
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->initializeCustomerSourceData()V

    .line 91
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 92
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "payment_session_active"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mStartedFromPaymentSession:Z

    .line 93
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 139
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, Lcom/stripe/android/R$menu;->add_source_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 140
    sget v0, Lcom/stripe/android/R$id;->action_save:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-boolean v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity;->mCommunicating:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return v1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 146
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/stripe/android/R$id;->action_save:I

    if-ne v0, v1, :cond_0

    .line 147
    invoke-direct {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->setSelectionAndFinish()V

    const/4 p1, 0x1

    return p1

    .line 150
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 152
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->onBackPressed()V

    :cond_1
    return p1
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    .line 125
    sget v0, Lcom/stripe/android/R$id;->action_save:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 129
    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentMethodsActivity;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, Lcom/stripe/android/R$attr;->titleTextColor:I

    sget v3, Lcom/stripe/android/R$drawable;->ic_checkmark:I

    .line 127
    invoke-static {p0, v1, v2, v3}, Lcom/stripe/android/view/ViewUtils;->getTintedIconWithAttribute(Landroid/content/Context;Landroid/content/res/Resources$Theme;II)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 132
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 133
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStart()V

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStarted()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStop()V

    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->activityStopped()V

    return-void
.end method
