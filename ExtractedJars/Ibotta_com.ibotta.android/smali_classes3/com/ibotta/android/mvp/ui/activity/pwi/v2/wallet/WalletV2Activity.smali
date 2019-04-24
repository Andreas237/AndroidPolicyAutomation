.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "WalletV2Activity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Component;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;"
    }
.end annotation


# static fields
.field protected static final ACTION_SHEET_BUY_AGAIN:I = 0x3

.field protected static final ACTION_SHEET_DELETE:I = 0x2

.field protected static final ACTION_SHEET_MAKE_DEFAULT:I = 0x1

.field protected static final ACTION_SHEET_MAKE_GOOGLEPAY_DEFAULT:I = 0x6

.field protected static final ACTION_SHEET_MARK_SPENT:I = 0x5

.field protected static final ACTION_SHEET_VIEW_CODE:I = 0x4


# instance fields
.field private final adapter:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PagerAdapter;

.field protected cvTabSelector:Landroid/support/v7/widget/CardView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09017e
    .end annotation
.end field

.field protected handler:Landroid/os/Handler;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0904a2
    .end annotation
.end field

.field private viewPagerTabFromIntent:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;
    .annotation runtime Ljavax/annotation/Nullable;
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

    .line 53
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    .line 71
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PagerAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PagerAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->adapter:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PagerAdapter;

    return-void
.end method

.method private getMakeDefaultSheetOption(I)Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 259
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    .line 260
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const p1, 0x7f110511

    .line 261
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    return-object v0
.end method

.method private initTabSelector()V
    .locals 3

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->vpHomePager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->adapter:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->adapter:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PagerAdapter;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/views/components/ViewEvents;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PagerAdapter;->updateViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->values()[Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TabSelectorView;->setOptions(Ljava/util/List;)V

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->tsvTabSelector:Lcom/ibotta/android/view/common/TabSelectorView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->vpHomePager:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/view/common/TabSelectorView;->setupWithViewPager(Landroid/support/v4/view/ViewPager;Z)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f110535

    .line 111
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->setTitle(I)V

    return-void
.end method

.method public static synthetic lambda$pageToTabFromIntent$0(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;I)V
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->vpHomePager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    const/4 p1, 0x0

    .line 133
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->viewPagerTabFromIntent:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    return-void
.end method

.method public static synthetic lambda$showPaymentMethodDialog$3(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getId()I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;->onPaymentMethodActionClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;I)V

    return-void
.end method

.method public static synthetic lambda$showSpentFilterSelector$2(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 2

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;

    invoke-static {}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->values()[Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getId()I

    move-result p1

    aget-object p1, v1, p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;->onSpentFilterChosen(Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)V

    return-void
.end method

.method public static synthetic lambda$showTransactionActionsDialog$1(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;->onTransactionActionsDialogClicked(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V

    return-void
.end method

.method private loadState()V
    .locals 2

    .line 100
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "pwi_wallet_tab"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->viewPagerTabFromIntent:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    :cond_0
    return-void
.end method

.method private pageToTabFromIntent()V
    .locals 5

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->viewPagerTabFromIntent:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;->ordinal()I

    move-result v0

    .line 131
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$xTi7123lZt0jCilfNTdzs1r4hS4;

    invoke-direct {v2, p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$xTi7123lZt0jCilfNTdzs1r4hS4;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;I)V

    const-wide/16 v3, 0xc8

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private showPaymentMethodDialog(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;",
            ">;)V"
        }
    .end annotation

    .line 267
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 268
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$TtZTPy2zcFEDWiipjsT5L92H5QE;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$TtZTPy2zcFEDWiipjsT5L92H5QE;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setListener(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;)V

    .line 269
    invoke-virtual {v0, p2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setOptions(Ljava/util/List;)V

    .line 271
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->show()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 53
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Component;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Component;
    .locals 1

    .line 75
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component;->builder()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;

    move-result-object v0

    .line 76
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2View;)V

    .line 77
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->walletV2Module(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Module;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;

    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/DaggerWalletV2Component$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Component;

    move-result-object p1

    return-object p1
.end method

.method public getNavButtonType()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 53
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Component;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Component;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Component;)V
    .locals 0

    .line 83
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Component;->inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0
    .param p3    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 247
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0x1b

    if-ne p1, p3, :cond_0

    const/4 p3, 0x2

    if-ne p2, p3, :cond_0

    .line 250
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;->onPaymentMethodAdded()V

    goto :goto_0

    :cond_0
    const/16 p3, 0x1f

    if-ne p1, p3, :cond_1

    const/4 p1, 0x4

    if-ne p2, p1, :cond_1

    .line 252
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;->onRefreshTransactions()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 88
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->loadState()V

    const p1, 0x7f0c007d

    .line 92
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->setContentView(I)V

    .line 93
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 95
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->initTitle()V

    .line 96
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->initTabSelector()V

    return-void
.end method

.method public showAddNewCardActivity()V
    .locals 2

    .line 158
    new-instance v0, Lcom/ibotta/android/routing/intent/PwiCardInputIntentCreator;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Presenter;->isFirstTimeCard()Z

    move-result v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/routing/intent/PwiCardInputIntentCreator;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PwiCardInputIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x1b

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showBarcodeScreen(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 2

    .line 140
    new-instance v0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getTransactionId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 141
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->getEarningsAmount()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->setRewardAmount(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;

    move-result-object p1

    .line 142
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x1f

    .line 143
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showGooglePayActionsDialog(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 2

    .line 177
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x6

    .line 178
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->getMakeDefaultSheetOption(I)Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->showPaymentMethodDialog(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;Ljava/util/List;)V

    return-void
.end method

.method public showPaymentMethodActionsDialog(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 3

    .line 164
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v1, 0x2

    .line 165
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const v2, 0x7f1104eb

    .line 166
    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 168
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x1

    .line 169
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->getMakeDefaultSheetOption(I)Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    invoke-direct {p0, p1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->showPaymentMethodDialog(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;Ljava/util/List;)V

    return-void
.end method

.method public showPwiHomeScreen(I)V
    .locals 1

    .line 153
    new-instance v0, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PwiHomeIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showPwiRetailersScreen()V
    .locals 1

    .line 148
    new-instance v0, Lcom/ibotta/android/routing/intent/ContentListIntentCreator;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/intent/ContentListIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/ContentListIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public showRemovePaymentMethodConfirmationDialog(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
    .locals 0

    .line 242
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/views/messages/alert/SemiModal;->make(Landroid/app/Activity;Lcom/ibotta/android/views/messages/alert/SemiModalViewState;Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)Lcom/ibotta/android/views/messages/alert/SemiModal;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModal;->show()V

    return-void
.end method

.method public showSpentFilterSelector(Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;)V
    .locals 7

    .line 213
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    .line 214
    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    .line 215
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->getSelectedFilterType()Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    const v3, 0x7f08024f

    const/4 v4, 0x0

    if-ne v1, v2, :cond_0

    const v1, 0x7f08024f

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setIconResId(I)V

    .line 216
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->getTransactionAmountByTypeMap()Ljava/util/HashMap;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionText(Ljava/lang/String;)V

    .line 218
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    .line 219
    sget-object v2, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->SPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v2}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    .line 220
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->getSelectedFilterType()Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    move-result-object v2

    sget-object v5, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->SPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    if-ne v2, v5, :cond_1

    const v2, 0x7f08024f

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setIconResId(I)V

    .line 221
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->getTransactionAmountByTypeMap()Ljava/util/HashMap;

    move-result-object v2

    sget-object v5, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->SPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionText(Ljava/lang/String;)V

    .line 223
    new-instance v2, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    .line 224
    sget-object v5, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->UNSPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {v5}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    .line 225
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->getSelectedFilterType()Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    move-result-object v5

    sget-object v6, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->UNSPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    if-ne v5, v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setIconResId(I)V

    .line 226
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilterSelectorViewState;->getTransactionAmountByTypeMap()Ljava/util/HashMap;

    move-result-object p1

    sget-object v3, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->UNSPENT:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v2, p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionText(Ljava/lang/String;)V

    .line 228
    new-instance p1, Ljava/util/ArrayList;

    const/4 v3, 0x3

    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 229
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 233
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 234
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$7In_RfWss71Z_nfub8UGjhq9Asw;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$7In_RfWss71Z_nfub8UGjhq9Asw;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setListener(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;)V

    .line 235
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setOptions(Ljava/util/List;)V

    .line 237
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->show()V

    return-void
.end method

.method public showTransactionActionsDialog(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V
    .locals 5

    .line 186
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v1, 0x5

    .line 187
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    .line 188
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;->isSpent()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f110514

    goto :goto_0

    :cond_0
    const v1, 0x7f110513

    :goto_0
    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 190
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v2, 0x4

    .line 191
    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const v2, 0x7f11054a

    .line 192
    invoke-virtual {v1, v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 194
    new-instance v2, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;-><init>()V

    const/4 v3, 0x3

    .line 195
    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setId(I)V

    const v3, 0x7f1104de

    .line 196
    invoke-virtual {v2, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->setOptionTextResId(I)V

    .line 198
    new-instance v3, Ljava/util/ArrayList;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 199
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 204
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$K293GvMV7Dxsr_Z-FlSxwtKkC3Y;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/-$$Lambda$WalletV2Activity$K293GvMV7Dxsr_Z-FlSxwtKkC3Y;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setListener(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;)V

    .line 205
    invoke-virtual {v0, v3}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setOptions(Ljava/util/List;)V

    .line 207
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->show()V

    return-void
.end method

.method public updateViewState(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Tab;",
            "Lcom/ibotta/android/views/components/ViewState;",
            ">;)V"
        }
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->adapter:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PagerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2PagerAdapter;->updateViewState(Ljava/util/Map;)V

    .line 124
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->cvTabSelector:Landroid/support/v7/widget/CardView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/CardView;->setVisibility(I)V

    .line 125
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/wallet/WalletV2Activity;->pageToTabFromIntent()V

    return-void
.end method
