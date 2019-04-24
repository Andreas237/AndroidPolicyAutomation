.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "PwiHomeActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;"
    }
.end annotation


# static fields
.field public static final RESULT_CODE_ADD_CARD_SUCCESS:I = 0x2

.field public static final RESULT_CODE_BARCODE_DISMISS:I = 0x3

.field public static final RESULT_CODE_HOME_DISMISS:I = 0x1

.field public static final RESULT_CODE_REFRESH_TRANSACTIONS:I = 0x4


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;

.field protected cvTabSelector:Landroid/support/v7/widget/CardView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09017e
    .end annotation
.end field

.field protected phtvToolbar:Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09039d
    .end annotation
.end field

.field private screenLoadingMessage:Ljava/lang/String;

.field protected tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904a2
    .end annotation
.end field

.field protected vpHomePager:Landroid/support/v4/view/ViewPager;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905ca
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    const-string v0, ""

    .line 69
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->screenLoadingMessage:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initTabSelector()V
    .locals 3

    .line 146
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->vpHomePager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/views/components/ViewEvents;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->updateViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->values()[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->setOptions(Ljava/util/List;)V

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->vpHomePager:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    return-void
.end method

.method private initViewPagerTracking()V
    .locals 2

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->vpHomePager:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method public static synthetic lambda$onCreateOptionsMenu$0(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;Landroid/view/View;)V
    .locals 0

    .line 113
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->onHelpIconClicked()V

    return-void
.end method

.method public static synthetic lambda$showPaymentMethodSelector$1(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->onPaymentMethodClicked(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, ""

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string v0, "bgc_txn_id"

    const-string v2, ""

    .line 124
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "retailer_id"

    .line 125
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "content_id"

    .line 126
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/content/ContentId;

    goto :goto_0

    .line 127
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 128
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "retailer_id"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 129
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "content_id"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/content/ContentId;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 132
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->setTxnId(Ljava/lang/String;)V

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->setRetailerId(I)V

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->setContentId(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeComponent;
    .locals 1

    .line 78
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;

    move-result-object v0

    .line 79
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeView;)V

    .line 80
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->pwiHomeModule(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeModule;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;

    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/DaggerPwiHomeComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeComponent;

    move-result-object p1

    return-object p1
.end method

.method protected getScreenLoadingMessage()Ljava/lang/String;
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->screenLoadingMessage:Ljava/lang/String;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 61
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeComponent;)V
    .locals 0

    .line 86
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p3    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 255
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x1c

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 258
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->finish()V

    goto :goto_0

    :cond_0
    const/16 v0, 0x1b

    if-ne p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 260
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->onPaymentMethodAdded()V

    goto :goto_0

    :cond_1
    const/16 v0, 0x1e

    if-ne p1, v0, :cond_2

    const/4 v1, 0x3

    if-ne p2, v1, :cond_2

    .line 262
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->onPurchaseBarcodeScreenDismiss()V

    goto :goto_0

    :cond_2
    const/4 v1, 0x4

    if-ne p1, v0, :cond_3

    if-ne p2, v1, :cond_3

    .line 264
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->onRefreshTransactions()V

    .line 265
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->onPurchaseBarcodeScreenDismiss()V

    goto :goto_0

    :cond_3
    const/16 v0, 0x1f

    if-ne p1, v0, :cond_4

    if-ne p2, v1, :cond_4

    .line 267
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->onRefreshTransactions()V

    goto :goto_0

    :cond_4
    const/16 v0, 0x20

    if-ne p1, v0, :cond_5

    const/4 p1, -0x1

    if-ne p2, p1, :cond_5

    if-eqz p3, :cond_5

    .line 269
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-static {p3}, Lcom/google/android/gms/wallet/PaymentData;->getFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/wallet/PaymentData;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->onGooglePayActivityResult(Lcom/google/android/gms/wallet/PaymentData;)V

    :cond_5
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 91
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c005d

    .line 93
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->setContentView(I)V

    .line 94
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 96
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->loadState(Landroid/os/Bundle;)V

    .line 98
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->initTabSelector()V

    .line 99
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->initViewPagerTracking()V

    .line 102
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x500

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 104
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    .line 110
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0d0013

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f09001c

    .line 112
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 113
    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiHomeActivity$eIEkwTHOg7hBgd8pN1HC2xZUf30;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiHomeActivity$eIEkwTHOg7hBgd8pN1HC2xZUf30;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 115
    :goto_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 139
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "bgc_txn_id"

    .line 140
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->getTxnId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "retailer_id"

    .line 141
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->getRetailerId()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "content_id"

    .line 142
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public resetLoadingIndicatorText()V
    .locals 1

    const-string v0, ""

    .line 290
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->screenLoadingMessage:Ljava/lang/String;

    return-void
.end method

.method public setData(Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;",
            "Lcom/ibotta/android/views/components/ViewState;",
            ">;)V"
        }
    .end annotation

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->phtvToolbar:Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;->updateViewState(Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;)V

    .line 171
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePagerAdapter;->updateViewState(Ljava/util/Map;)V

    .line 172
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->cvTabSelector:Landroid/support/v7/widget/CardView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/CardView;->setVisibility(I)V

    return-void
.end method

.method public showAddNewCardActivity()V
    .locals 2

    .line 206
    new-instance v0, Lcom/ibotta/android/routing/intent/PwiCardInputIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomePresenter;->isFirstTimeCard()Z

    move-result v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/routing/intent/PwiCardInputIntentCreator;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PwiCardInputIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x1b

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showBarcodeScreen(Ljava/lang/String;Z)V
    .locals 1

    .line 191
    new-instance v0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    if-eqz p2, :cond_0

    const/16 p2, 0x1e

    .line 193
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_0
    const/16 p2, 0x1f

    .line 195
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_0
    return-void
.end method

.method public showCongratsAnimation(Ljava/lang/String;)V
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->phtvToolbar:Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;->playCongratsAnimation(Ljava/lang/String;)V

    return-void
.end method

.method public showErrorDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
    .locals 0

    .line 212
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/views/messages/alert/SemiModal;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/SemiModal;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModal;->show()V

    return-void
.end method

.method public showGooglePayFlow(Lcom/google/android/gms/tasks/Task;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/wallet/PaymentData;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x20

    .line 250
    invoke-static {p1, p0, v0}, Lcom/google/android/gms/wallet/AutoResolveHelper;->resolveTask(Lcom/google/android/gms/tasks/Task;Landroid/app/Activity;I)V

    return-void
.end method

.method public showOrderedButFailedPrompt(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    .locals 1

    .line 217
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)V

    invoke-static {p0, p1, v0}, Lcom/ibotta/android/views/messages/alert/SemiModal;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/SemiModal;

    move-result-object p1

    .line 225
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModal;->show()V

    return-void
.end method

.method public showPayConfirmationDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
    .locals 0

    .line 245
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModal;->show()V

    return-void
.end method

.method public showPaymentMethodSelector(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;)V
    .locals 1

    .line 183
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;-><init>(Landroid/content/Context;)V

    .line 184
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->updateViewState(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;)V

    .line 185
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiHomeActivity$emTzU_nasl2J0n1sIYvJs4IRoZ8;

    invoke-direct {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/-$$Lambda$PwiHomeActivity$emTzU_nasl2J0n1sIYvJs4IRoZ8;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->bindViewEvents(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;)V

    .line 186
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->show()V

    return-void
.end method

.method public showPwiOnboarding(I)V
    .locals 1

    .line 177
    new-instance v0, Lcom/ibotta/android/routing/intent/PwiOnboardingIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/PwiOnboardingIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PwiOnboardingIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->startActivityForResult(Landroid/content/Intent;I)V

    const p1, 0x7f01001b

    const/4 v0, 0x0

    .line 178
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public showSubmittedJobLoading()V
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->screenLoadingMessage:Ljava/lang/String;

    invoke-super {p0, v0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->showSubmittedJobLoading(Ljava/lang/String;)V

    return-void
.end method

.method public showTransactionPendingDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
    .locals 0

    .line 230
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/views/messages/alert/SemiModal;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/SemiModal;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModal;->show()V

    return-void
.end method

.method public showTransactionsTab()V
    .locals 2

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->vpHomePager:Landroid/support/v4/view/ViewPager;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->TRANSACTIONS:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeTab;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    return-void
.end method

.method public showWalletScreen()V
    .locals 1

    .line 201
    new-instance v0, Lcom/ibotta/android/routing/intent/WalletIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/WalletIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/WalletIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public updateChargingCardText(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    .line 285
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f1104e3

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;->screenLoadingMessage:Ljava/lang/String;

    return-void
.end method
