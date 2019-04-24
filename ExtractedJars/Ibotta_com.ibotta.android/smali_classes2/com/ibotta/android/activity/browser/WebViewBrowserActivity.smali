.class public Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;
.super Lcom/ibotta/android/activity/browser/BrowserActivity;
.source "WebViewBrowserActivity.java"

# interfaces
.implements Lcom/ibotta/android/activity/CompatSupplier;
.implements Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/activity/browser/WebViewBrowserActivity$WebViewBrowserActivityClient;
    }
.end annotation


# static fields
.field public static final RESULT_ERROR_EXIT:I = 0x3

.field public static final RESULT_URL_SEEN_EXIT:I = 0x1

.field public static final RESULT_USER_EXIT:I = 0x2

.field private static final TAG_ERROR_LOADING_WEB_PAGE:Ljava/lang/String; = "error_loading_web_page"


# instance fields
.field private exitUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected flLoading:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901f3
    .end annotation
.end field

.field protected iwvLinkContent:Lcom/ibotta/android/views/browser/IbottaWebView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902d5
    .end annotation
.end field

.field private slideFromBottom:Z

.field protected toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09043a
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/activity/browser/BrowserActivity;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput-boolean v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->slideFromBottom:Z

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->onLoadStarted()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;Ljava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->onLoadFinished(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->onLoadError()V

    return-void
.end method

.method private onLoadError()V
    .locals 3

    const v0, 0x7f1103c8

    .line 154
    invoke-virtual {p0, v0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;

    move-result-object v0

    .line 155
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 156
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    const-string v2, "error_loading_web_page"

    invoke-virtual {v1, p0, v0, v2}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method

.method private onLoadFinished(Ljava/lang/String;)V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->flLoading:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->exitUrls:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 148
    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->setResult(I)V

    .line 149
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->finish()V

    :cond_0
    return-void
.end method

.method private onLoadStarted()V
    .locals 2

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->flLoading:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 2

    .line 103
    invoke-super {p0}, Lcom/ibotta/android/activity/browser/BrowserActivity;->finish()V

    .line 104
    iget-boolean v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->slideFromBottom:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const v1, 0x7f010039

    .line 105
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->overridePendingTransition(II)V

    :cond_0
    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 3

    const-string v0, "Loading url %s"

    const/4 v1, 0x1

    .line 111
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->iwvLinkContent:Lcom/ibotta/android/views/browser/IbottaWebView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/browser/IbottaWebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->iwvLinkContent:Lcom/ibotta/android/views/browser/IbottaWebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/views/browser/IbottaWebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->iwvLinkContent:Lcom/ibotta/android/views/browser/IbottaWebView;

    invoke-virtual {v0}, Lcom/ibotta/android/views/browser/IbottaWebView;->goBack()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 122
    invoke-virtual {p0, v0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->setResult(I)V

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->finish()V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 53
    invoke-super {p0, p1}, Lcom/ibotta/android/activity/browser/BrowserActivity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "viewer_uri"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "use_x_for_nav_icon"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v3, "urls"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->exitUrls:Ljava/util/List;

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v3, "slide_from_bottom"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->slideFromBottom:Z

    if-eqz p1, :cond_3

    .line 60
    iget-boolean v1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->slideFromBottom:Z

    if-eqz v1, :cond_0

    const v1, 0x7f010038

    .line 61
    invoke-virtual {p0, v1, v2}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->overridePendingTransition(II)V

    :cond_0
    const v1, 0x7f0c0046

    .line 64
    invoke-virtual {p0, v1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->setContentView(I)V

    .line 65
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    .line 67
    iget-object v1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->iwvLinkContent:Lcom/ibotta/android/views/browser/IbottaWebView;

    new-instance v3, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;

    invoke-direct {v3}, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;-><init>()V

    new-instance v4, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity$WebViewBrowserActivityClient;

    invoke-direct {v4, p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity$WebViewBrowserActivityClient;-><init>(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;)V

    .line 68
    invoke-virtual {v3, v4}, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->webViewClient(Landroid/webkit/WebViewClient;)Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/views/browser/IbottaWebViewState$Builder;->build()Lcom/ibotta/android/views/browser/IbottaWebViewState;

    move-result-object v3

    .line 67
    invoke-virtual {v1, v3}, Lcom/ibotta/android/views/browser/IbottaWebView;->updateViewState(Lcom/ibotta/android/views/browser/IbottaWebViewState;)V

    .line 70
    iget-object v1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBar;->setDisplayUseLogoEnabled(Z)V

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBar;->setDisplayShowHomeEnabled(Z)V

    :cond_1
    if-eqz v0, :cond_2

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    const v1, 0x7f080272

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->setNavigationIcon(I)V

    .line 82
    :cond_2
    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const/4 p1, 0x3

    .line 84
    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->setResult(I)V

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->finish()V

    :goto_0
    return-void
.end method

.method public onDialogFragmentCancelled(Ljava/lang/String;)V
    .locals 3

    const-string v0, "onDialogFragmentCancelled: tag=%1$s"

    const/4 v1, 0x1

    .line 129
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onDialogFragmentDismissed(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error_loading_web_page"

    .line 134
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    .line 135
    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->setResult(I)V

    .line 136
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->finish()V

    :cond_0
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 91
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-eq v0, v1, :cond_0

    .line 98
    invoke-super {p0, p1}, Lcom/ibotta/android/activity/browser/BrowserActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 94
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->onBackPressed()V

    const/4 p1, 0x1

    return p1
.end method
