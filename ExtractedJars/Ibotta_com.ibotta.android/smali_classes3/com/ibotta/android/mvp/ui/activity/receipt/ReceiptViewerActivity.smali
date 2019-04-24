.class public Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "ReceiptViewerActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;"
    }
.end annotation


# instance fields
.field protected ibLeft:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090235
    .end annotation
.end field

.field protected ibRight:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090236
    .end annotation
.end field

.field protected rlReceiptViewerHeader:Landroid/widget/RelativeLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903ce
    .end annotation
.end field

.field protected wvReceipt:Landroid/webkit/WebView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905f6
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initWebView()V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->wvReceipt:Landroid/webkit/WebView;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->wvReceipt:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->wvReceipt:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->wvReceipt:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "receipt_id"

    .line 73
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "receipt_id"

    .line 74
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_0
    const-string v1, "receipt_img_urls"

    .line 77
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "receipt_id"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "receipt_id"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    move-object v0, p1

    .line 83
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "receipt_img_urls"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    move-object p1, v0

    .line 86
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;

    invoke-interface {v1, v0, p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;->setParameters(Ljava/lang/Integer;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerComponent;
    .locals 1

    .line 39
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent$Builder;

    move-result-object v0

    .line 40
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerView;)V

    .line 41
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent$Builder;->receiptViewerModule(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerModule;)Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent$Builder;

    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/DaggerReceiptViewerComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 29
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerComponent;)V
    .locals 0

    .line 47
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)V

    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->wvReceipt:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 52
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0c005f

    .line 54
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->setContentView(I)V

    .line 55
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 57
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->loadState(Landroid/os/Bundle;)V

    .line 59
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->initWebView()V

    return-void
.end method

.method protected onLeftClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090235
        }
    .end annotation

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;->onLeftClicked()V

    return-void
.end method

.method protected onRightClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090236
        }
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;->onRightClicked()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 64
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "receipt_img_urls"

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;->getReceiptImgUrls()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public showFailedToLoadReceipt()V
    .locals 2

    const v0, 0x7f11057a

    .line 143
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;

    move-result-object v0

    .line 144
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    invoke-virtual {v1, p0, v0}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;)V

    return-void
.end method

.method public showLeftButton(Z)V
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->ibLeft:Landroid/widget/ImageButton;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setVisibility(I)V

    return-void
.end method

.method public showNavButtons(Z)V
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->rlReceiptViewerHeader:Landroid/widget/RelativeLayout;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method

.method public showRightButton(Z)V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->ibRight:Landroid/widget/ImageButton;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setVisibility(I)V

    return-void
.end method

.method public updateTitle(II)V
    .locals 2

    const/4 v0, 0x2

    .line 154
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    const p1, 0x7f110058

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method
