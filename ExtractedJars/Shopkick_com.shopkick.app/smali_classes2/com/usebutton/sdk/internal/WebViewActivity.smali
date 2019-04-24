.class public Lcom/usebutton/sdk/internal/WebViewActivity;
.super Lcom/usebutton/sdk/internal/base/BaseActivity;
.source "WebViewActivity.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;
.implements Lcom/usebutton/sdk/internal/WebViewController;
.implements Lcom/usebutton/sdk/purchasepath/BrowserInterface;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/base/BaseActivity<",
        "Lcom/usebutton/sdk/internal/WebViewPresenter;",
        ">;",
        "Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;",
        "Lcom/usebutton/sdk/internal/WebViewController;",
        "Lcom/usebutton/sdk/purchasepath/BrowserInterface;"
    }
.end annotation


# static fields
.field protected static final CARD_PADDING_DIFFERENCE:I = 0x8

.field public static final EXTRA_LINK:Ljava/lang/String; = "link"
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field public static final EXTRA_META:Ljava/lang/String; = "meta"
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field protected static final REQUEST_CODE_INSTALL_CARD:I = 0x66

.field protected static final REQUEST_CODE_INSTALL_SHEET:I = 0x65

.field private static final TAG:Ljava/lang/String; = "ButtonWeb"

.field private static final TOP_CHROME_DEFAULT_COLOR:I = -0x1


# instance fields
.field browserChromeClient:Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private mAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

.field mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field mBrowserProxy:Lcom/usebutton/sdk/internal/BrowserProxy;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private mCoordinator:Lcom/usebutton/sdk/internal/views/ViewCoordinator;

.field private mLink:Lcom/usebutton/sdk/models/Link;

.field private mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

.field private mNavigator:Lcom/usebutton/sdk/internal/web/Navigator;

.field private mRecyclerView:Landroid/support/v7/widget/RecyclerView;

.field private mRecyclerViewContainer:Landroid/view/View;

.field private mReportDismiss:Z

.field private mWebView:Landroid/webkit/WebView;

.field presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

.field private viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

.field private wasSheetOpenedByTap:Z

.field webChromeClient:Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field webClient:Lcom/usebutton/sdk/internal/browser/BrowserWebClient;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 83
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;-><init>()V

    const/4 v0, 0x0

    .line 101
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mReportDismiss:Z

    .line 104
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->wasSheetOpenedByTap:Z

    .line 121
    new-instance v0, Lcom/usebutton/sdk/internal/CardsViewTransformer;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/CardsViewTransformer;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/WebViewActivity;)Lcom/usebutton/sdk/internal/views/ViewCoordinator;
    .locals 0

    .line 83
    iget-object p0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mCoordinator:Lcom/usebutton/sdk/internal/views/ViewCoordinator;

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/WebViewActivity;)Z
    .locals 0

    .line 83
    iget-boolean p0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->wasSheetOpenedByTap:Z

    return p0
.end method

.method static synthetic access$102(Lcom/usebutton/sdk/internal/WebViewActivity;Z)Z
    .locals 0

    .line 83
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->wasSheetOpenedByTap:Z

    return p1
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/WebViewActivity;)Lcom/usebutton/sdk/internal/events/EventTracker;
    .locals 0

    .line 83
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/WebViewActivity;Z)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->onBottomSheetReady(Z)V

    return-void
.end method

.method static synthetic access$400(Lcom/usebutton/sdk/internal/WebViewActivity;)Landroid/support/v7/widget/RecyclerView;
    .locals 0

    .line 83
    iget-object p0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    return-object p0
.end method

.method static synthetic access$500(Lcom/usebutton/sdk/internal/WebViewActivity;)Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;
    .locals 0

    .line 83
    iget-object p0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    return-object p0
.end method

.method static synthetic access$600(Lcom/usebutton/sdk/internal/WebViewActivity;)Landroid/view/View;
    .locals 0

    .line 83
    iget-object p0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mRecyclerViewContainer:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$700(Lcom/usebutton/sdk/internal/WebViewActivity;)Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;
    .locals 0

    .line 83
    iget-object p0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    return-object p0
.end method

.method static synthetic access$802(Lcom/usebutton/sdk/internal/WebViewActivity;Z)Z
    .locals 0

    .line 83
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mReportDismiss:Z

    return p1
.end method

.method static synthetic access$900(Lcom/usebutton/sdk/internal/WebViewActivity;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->startAttendedInstall()V

    return-void
.end method

.method static addButtonInfo(Lcom/usebutton/sdk/internal/api/HostInformation;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    if-nez p1, :cond_0

    return-object p1

    :cond_0
    const-string v0, ".*\\(.*\\).*"

    .line 868
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 869
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    const-string v0, "%s ButtonSDK/%s"

    const/4 v1, 0x2

    .line 872
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/HostInformation;->getSdkVersionName()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, p1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private canInstallApp()Z
    .locals 1

    .line 714
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mLink:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v0}, Lcom/usebutton/sdk/models/Link;->getAppLink()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private configureChrome()V
    .locals 7

    .line 639
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getBrowser()Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v0

    .line 641
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->getTitle()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    .line 642
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->getSubtitle()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    .line 644
    sget v3, Lcom/usebutton/sdk/R$id;->web_close:I

    invoke-virtual {p0, v3}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageButton;

    .line 645
    sget v4, Lcom/usebutton/sdk/R$id;->web_chrome_title:I

    invoke-virtual {p0, v4}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 646
    sget v5, Lcom/usebutton/sdk/R$id;->web_chrome_subtitle:I

    invoke-virtual {p0, v5}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 647
    sget v6, Lcom/usebutton/sdk/R$id;->web_chrome:I

    invoke-virtual {p0, v6}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/FrameLayout;

    .line 648
    invoke-static {v4, v1}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    .line 649
    invoke-static {v5, v2}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;Lcom/usebutton/sdk/internal/models/Text;)V

    .line 651
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->getPrimaryColor()I

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_0

    .line 652
    sget v2, Lcom/usebutton/sdk/R$id;->web_chrome_top:I

    invoke-virtual {p0, v2}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->getPrimaryColor()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 653
    invoke-virtual {v3}, Landroid/widget/ImageButton;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v1

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ViewUtils;->colorDrawable(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 655
    :cond_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$drawable;->btn_ic_web_close:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 658
    :goto_0
    new-instance v0, Lcom/usebutton/sdk/internal/WebViewActivity$9;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/WebViewActivity$9;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;)V

    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 666
    new-instance v0, Lcom/usebutton/sdk/internal/WebViewActivity$10;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/WebViewActivity$10;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;)V

    invoke-virtual {v6, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private configureWebView()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 735
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->webChromeClient:Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 737
    new-instance v0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mNavigator:Lcom/usebutton/sdk/internal/web/Navigator;

    invoke-direct {v0, v1, v2, v3}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Landroid/webkit/WebView;Lcom/usebutton/sdk/internal/web/Navigator;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    .line 738
    new-instance v0, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mNavigator:Lcom/usebutton/sdk/internal/web/Navigator;

    .line 739
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v4

    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getBlacklistedWebResources()Ljava/util/Set;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;Lcom/usebutton/sdk/internal/web/Navigator;Ljava/util/Set;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->webClient:Lcom/usebutton/sdk/internal/browser/BrowserWebClient;

    .line 741
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->webClient:Lcom/usebutton/sdk/internal/browser/BrowserWebClient;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 742
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    .line 743
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    .line 744
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V

    .line 745
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 746
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    const/4 v2, 0x0

    .line 747
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBlockNetworkImage(Z)V

    .line 748
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBlockNetworkLoads(Z)V

    .line 749
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 750
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 751
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 752
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setGeolocationDatabasePath(Ljava/lang/String;)V

    .line 753
    new-instance v2, Lcom/usebutton/sdk/internal/api/HostInformation;

    .line 755
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getContext()Landroid/content/Context;

    move-result-object v3

    sget-object v4, Lcom/usebutton/sdk/internal/ButtonPrivate;->button:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getStorage()Lcom/usebutton/sdk/internal/core/Storage;

    move-result-object v4

    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/core/Storage;->getApplicationId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/usebutton/sdk/internal/api/HostInformation;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 756
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v3

    .line 754
    invoke-static {v2, v3}, Lcom/usebutton/sdk/internal/WebViewActivity;->addButtonInfo(Lcom/usebutton/sdk/internal/api/HostInformation;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 753
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 758
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_0

    const/4 v2, 0x2

    .line 759
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 760
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    iget-object v2, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v2, v1}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    :cond_0
    return-void
.end method

.method public static createIntent(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;)Landroid/content/Intent;
    .locals 2

    .line 804
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "meta"

    .line 805
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "link"

    .line 806
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method private getBrowser()Lcom/usebutton/sdk/internal/models/Browser;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 706
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getBrowser()Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v0

    return-object v0
.end method

.method private getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;
    .locals 1

    .line 722
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    return-object v0
.end method

.method private getContext()Landroid/content/Context;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    return-object p0
.end method

.method private getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;
    .locals 1

    .line 718
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    return-object v0
.end method

.method private getIcon()Lcom/usebutton/sdk/internal/models/Asset;
    .locals 1

    .line 710
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v0

    return-object v0
.end method

.method private getInstallIntent()Landroid/content/Intent;
    .locals 4

    .line 631
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mLink:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v1}, Lcom/usebutton/sdk/models/Link;->getAppLink()Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, Lcom/usebutton/sdk/internal/InstallCardActivity;->intentForPromotion(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/MetaInfo;Landroid/net/Uri;ILandroid/content/Intent;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method private getInstallSheet()Lcom/usebutton/sdk/internal/models/InstallSheet;
    .locals 1

    .line 622
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getBrowser()Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->getInstallSheet()Lcom/usebutton/sdk/internal/models/InstallSheet;

    move-result-object v0

    return-object v0
.end method

.method private getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;
    .locals 2

    .line 726
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 727
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 730
    :cond_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    return-object v0

    .line 728
    :cond_1
    :goto_0
    invoke-static {}, Lcom/usebutton/sdk/internal/models/Configuration;->emptyConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object v0

    return-object v0
.end method

.method private getPrimaryColor()I
    .locals 1

    .line 635
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getBrowser()Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->getPrimaryColor()I

    move-result v0

    return v0
.end method

.method private isTargetWebViewOnly()Z
    .locals 1

    .line 594
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getBrowser()Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->isTargetWebViewOnly()Z

    move-result v0

    return v0
.end method

.method private onBottomSheetReady(Z)V
    .locals 1

    .line 249
    new-instance v0, Lcom/usebutton/sdk/internal/WebViewActivity$3;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity$3;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;Z)V

    .line 299
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method

.method private setStatusBarColor(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 377
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 378
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x3f4ccccd    # 0.8f

    invoke-static {p1, v1}, Lcom/usebutton/sdk/internal/util/ViewUtils;->darken(IF)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_0
    return-void
.end method

.method private setupNavBar()V
    .locals 2

    .line 237
    sget v0, Lcom/usebutton/sdk/R$id;->web_chrome_subtitle:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/usebutton/sdk/internal/WebViewActivity$2;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/WebViewActivity$2;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupOpenInApp()V
    .locals 3

    .line 680
    sget v0, Lcom/usebutton/sdk/R$id;->web_open_app:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 681
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->shouldHideOpenInAppButton()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    .line 682
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 685
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 686
    new-instance v1, Lcom/usebutton/sdk/internal/WebViewActivity$11;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/WebViewActivity$11;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 692
    sget v0, Lcom/usebutton/sdk/R$id;->web_open_app_icon:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/AssetImageView;

    .line 693
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getImageLoader()Lcom/usebutton/sdk/internal/ImageLoader;

    move-result-object v1

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/views/AssetImageView;->loadAsset(Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)V

    .line 695
    sget v0, Lcom/usebutton/sdk/R$id;->web_open_app_text:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 696
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getBrowser()Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Browser;->getAction()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/models/Text;->applyTo(Landroid/widget/TextView;)V

    return-void
.end method

.method private shouldHideOpenInAppButton()Z
    .locals 1

    .line 700
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->isTargetWebViewOnly()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->canInstallApp()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getBrowser()Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->getAction()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private startAttendedInstall()V
    .locals 13

    .line 850
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->canInstallApp()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ButtonWeb"

    const-string v1, "Can\'t install app link=%s, store ID=%s"

    const/4 v2, 0x2

    .line 851
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mLink:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v4}, Lcom/usebutton/sdk/models/Link;->getAppLink()Landroid/net/Uri;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 852
    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 851
    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "ButtonWeb"

    const-string v1, "Starting attended install."

    .line 855
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 857
    new-instance v0, Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getMaxAgeSeconds()I

    move-result v3

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 858
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getStoreId()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getAppName()Ljava/lang/String;

    move-result-object v8

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 859
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getTarget()Ljava/lang/String;

    move-result-object v9

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v10

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getRequestTime()Ljava/lang/String;

    move-result-object v11

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getTapSignal()Ljava/lang/String;

    move-result-object v12

    move-object v2, v0

    invoke-direct/range {v2 .. v12}, Lcom/usebutton/sdk/internal/models/MetaInfo;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Browser;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Asset;Ljava/lang/String;Ljava/lang/String;)V

    .line 860
    new-instance v1, Lcom/usebutton/sdk/internal/ActionPerformer;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mLink:Lcom/usebutton/sdk/models/Link;

    invoke-direct {v1, v0, v2}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;)V

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;)V

    return-void
.end method

.method private startInstallSheetActivity()V
    .locals 6

    .line 599
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getInstallSheet()Lcom/usebutton/sdk/internal/models/InstallSheet;

    move-result-object v1

    .line 600
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getInstallIntent()Landroid/content/Intent;

    move-result-object v2

    .line 601
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getPrimaryColor()I

    move-result v3

    .line 602
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v4

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 603
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    .line 598
    invoke-static/range {v0 .. v5}, Lcom/usebutton/sdk/internal/InstallSheetActivity;->createIntent(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/InstallSheet;Landroid/content/Intent;ILcom/usebutton/sdk/internal/models/Asset;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x65

    invoke-virtual {p0, v0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private styleBottomBar()V
    .locals 1

    .line 675
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getPrimaryColor()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->setFooterTintColor(I)V

    return-void
.end method


# virtual methods
.method public animateFinishBrowserTransition(Lcom/usebutton/sdk/internal/BrowserTransitionStyle;)V
    .locals 1

    .line 905
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->getFinishEnterAnimation()I

    move-result v0

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->getFinishExitAnimation()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public animateStartBrowserTransition(Lcom/usebutton/sdk/internal/BrowserTransitionStyle;)V
    .locals 1

    .line 900
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->getStartEnterAnimation()I

    move-result v0

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->getStartExitAnimation()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->overridePendingTransition(II)V

    return-void
.end method

.method public checkWebViewOnlyAndStartAttendedInstall(Ljava/lang/String;)V
    .locals 4

    .line 822
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->isTargetWebViewOnly()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v0, "ButtonWeb"

    const-string v3, "ignore install attempt for webview-only %s"

    .line 823
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    invoke-static {v0, v3, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string v0, "ButtonWeb"

    const-string v3, "redirect to the store for %s"

    .line 825
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    invoke-static {v0, v3, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 826
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->startAttendedInstall()V

    :goto_0
    return-void
.end method

.method public disableSystemAutofillService()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    .line 879
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    .line 880
    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAutofill(I)V

    return-void
.end method

.method public fillFields(Lorg/json/JSONObject;)V
    .locals 1

    .line 890
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->fillFields(Lorg/json/JSONObject;)V

    return-void
.end method

.method public finish()V
    .locals 4

    .line 790
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mReportDismiss:Z

    if-eqz v0, :cond_0

    .line 791
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v0

    const-string v1, "btn:webview-dismiss"

    iget-object v2, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mLink:Lcom/usebutton/sdk/models/Link;

    .line 792
    invoke-virtual {v2}, Lcom/usebutton/sdk/models/Link;->getBrowserLink()Landroid/net/Uri;

    move-result-object v2

    iget-object v3, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-static {v2, v3}, Lcom/usebutton/sdk/internal/browser/BrowserHelpers;->propertiesForUrl(Landroid/net/Uri;Lcom/usebutton/sdk/internal/models/MetaInfo;)Lorg/json/JSONObject;

    move-result-object v2

    .line 791
    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    const/4 v0, 0x0

    .line 793
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mReportDismiss:Z

    .line 795
    :cond_0
    invoke-super {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;->finish()V

    .line 797
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onFinishActivity()V

    return-void
.end method

.method getBlockedResources()Ljava/util/List;
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 812
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->webClient:Lcom/usebutton/sdk/internal/browser/BrowserWebClient;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/browser/BrowserWebClient;->getBlockedResources()Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getCardList()Lcom/usebutton/sdk/purchasepath/CardList;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 434
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    return-object v0
.end method

.method public getFooter()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;
    .locals 1

    .line 422
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBrowserProxy:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->getFooter()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;

    move-result-object v0

    return-object v0
.end method

.method public getFooterBackgroundColor()I
    .locals 1

    .line 392
    sget v0, Lcom/usebutton/sdk/R$id;->web_controls:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    .line 393
    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v0

    return v0
.end method

.method public getFooterTintColor()I
    .locals 1

    .line 403
    sget v0, Lcom/usebutton/sdk/R$id;->web_open_app_text:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    return v0
.end method

.method public getHeader()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;
    .locals 1

    .line 417
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBrowserProxy:Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->getHeader()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;

    move-result-object v0

    return-object v0
.end method

.method public getHeaderBackgroundColor()I
    .locals 1

    .line 352
    sget v0, Lcom/usebutton/sdk/R$id;->web_chrome_top:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 353
    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    .line 354
    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v0

    return v0
.end method

.method public getHeaderTintColor()I
    .locals 1

    .line 383
    sget v0, Lcom/usebutton/sdk/R$id;->web_close:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method getPopupWebView()Lcom/usebutton/sdk/internal/views/PopupWebView;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 817
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->webChromeClient:Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;->getPopupWebView()Lcom/usebutton/sdk/internal/views/PopupWebView;

    move-result-object v0

    return-object v0
.end method

.method public getViewContainer()Landroid/widget/RelativeLayout;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 428
    sget v0, Lcom/usebutton/sdk/R$id;->web_view_container:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public hideTopCard()V
    .locals 1

    .line 444
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onHideTopCard()V

    return-void
.end method

.method public loadBtnSdkJs()V
    .locals 1

    .line 885
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->loadBtnSdkJs(Landroid/content/Context;)V

    return-void
.end method

.method public observeFields(Lorg/json/JSONObject;)V
    .locals 1

    .line 895
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->observeFields(Lorg/json/JSONObject;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    const/16 p3, 0x65

    if-ne p1, p3, :cond_0

    if-nez p2, :cond_0

    const/4 p3, 0x1

    .line 611
    iput-boolean p3, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mReportDismiss:Z

    .line 612
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->finish()V

    :cond_0
    const/16 p3, 0x66

    if-ne p1, p3, :cond_1

    if-nez p2, :cond_1

    .line 617
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->onHideTopCard()V

    :cond_1
    return-void
.end method

.method public onAppInstallCardClicked()V
    .locals 2

    .line 627
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getInstallIntent()Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {p0, v0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .line 775
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getPopupWebView()Lcom/usebutton/sdk/internal/views/PopupWebView;

    move-result-object v0

    .line 776
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getState()Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    move-result-object v1

    sget-object v2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne v1, v2, :cond_0

    .line 777
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet()V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 779
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->close()V

    goto :goto_0

    .line 780
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 781
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    .line 783
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mReportDismiss:Z

    .line 784
    invoke-super {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onBackPressed()V

    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 304
    invoke-super {p0, p1}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 305
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isSheetShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 306
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet()V

    .line 308
    sget-object p1, Lcom/usebutton/sdk/internal/WebViewActivity$12;->$SwitchMap$com$usebutton$thirdparty$com$flipboard$bottomsheet$BottomSheetLayout$State:[I

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getState()Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->ordinal()I

    move-result v0

    aget p1, p1, v0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 313
    :pswitch_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->expandSheet()V

    goto :goto_0

    .line 310
    :pswitch_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekSheet()V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onConfigureDismissAllCards(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
    .locals 4

    .line 542
    sget v0, Lcom/usebutton/sdk/R$id;->web_dismiss_all_cards:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 546
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/usebutton/sdk/R$anim;->btn_fade_out:I

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 548
    new-instance v2, Lcom/usebutton/sdk/internal/WebViewActivity$7;

    invoke-direct {v2, p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity$7;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;Landroid/widget/ImageButton;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 567
    sget-object v2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    const/4 v3, 0x0

    if-ne p1, v2, :cond_1

    .line 568
    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 572
    :cond_0
    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 574
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v2, Lcom/usebutton/sdk/R$anim;->btn_fade_in:I

    invoke-static {p1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    .line 573
    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->startAnimation(Landroid/view/animation/Animation;)V

    .line 576
    new-instance p1, Lcom/usebutton/sdk/internal/WebViewActivity$8;

    invoke-direct {p1, p0, v0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity$8;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;Landroid/widget/ImageButton;Landroid/view/animation/Animation;)V

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 583
    :cond_1
    sget-object v2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, v2, :cond_3

    .line 584
    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result p1

    if-nez p1, :cond_2

    .line 585
    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->startAnimation(Landroid/view/animation/Animation;)V

    .line 589
    :cond_2
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p1, v3}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 16

    move-object/from16 v0, p0

    .line 125
    invoke-super/range {p0 .. p1}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 127
    invoke-virtual/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "meta"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/models/MetaInfo;

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 128
    invoke-virtual/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "link"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/models/Link;

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mLink:Lcom/usebutton/sdk/models/Link;

    .line 129
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mLink:Lcom/usebutton/sdk/models/Link;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 130
    invoke-virtual {v1}, Lcom/usebutton/sdk/models/Link;->getBrowserLink()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    if-eqz v1, :cond_0

    .line 132
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getBrowser()Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "ButtonWeb"

    const-string v4, "Invalid parameters to WebViewActivity: link=%s, meta=%s"

    const/4 v5, 0x2

    .line 133
    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mLink:Lcom/usebutton/sdk/models/Link;

    aput-object v6, v5, v3

    iget-object v6, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    aput-object v6, v5, v2

    .line 134
    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 133
    invoke-static {v1, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-direct/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isDebugBuild(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 139
    invoke-virtual/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->finish()V

    .line 142
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getBrowser()Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Browser;->getPrimaryColor()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->setStatusBarColor(I)V

    .line 144
    sget v1, Lcom/usebutton/sdk/R$layout;->btn_activity_web:I

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->setContentView(I)V

    .line 146
    sget v1, Lcom/usebutton/sdk/R$id;->web_bottomsheet:I

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    .line 147
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v1, v3}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setPeekOnDismiss(Z)V

    .line 148
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v1, v3}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setInterceptContentTouch(Z)V

    .line 149
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v1, v2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setUseHardwareLayerWhileAnimating(Z)V

    .line 150
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    new-instance v2, Lcom/usebutton/sdk/internal/WebViewActivity$1;

    invoke-direct {v2, v0}, Lcom/usebutton/sdk/internal/WebViewActivity$1;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;)V

    invoke-virtual {v1, v2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->addOnSheetStateChangeListener(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;)V

    .line 171
    invoke-static/range {p0 .. p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/usebutton/sdk/R$layout;->btn_checkout_recycler_view:I

    iget-object v4, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    .line 172
    invoke-virtual {v1, v2, v4, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mRecyclerViewContainer:Landroid/view/View;

    .line 175
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mRecyclerViewContainer:Landroid/view/View;

    sget v2, Lcom/usebutton/sdk/R$id;->checkout_recycler_view:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/RecyclerView;

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 176
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    new-instance v2, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v2, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 177
    new-instance v1, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-direct {v1, v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;-><init>(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    .line 178
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mRecyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v2, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 180
    new-instance v1, Lcom/usebutton/sdk/internal/BrowserProxy;

    invoke-direct {v1, v0}, Lcom/usebutton/sdk/internal/BrowserProxy;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;)V

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBrowserProxy:Lcom/usebutton/sdk/internal/BrowserProxy;

    .line 181
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v1

    .line 183
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButtonRepository()Lcom/usebutton/sdk/internal/ButtonRepository;

    move-result-object v14

    .line 185
    new-instance v10, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;

    iget-object v2, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 187
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v2

    .line 188
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v3

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/Configuration;->getFlags()Ljava/util/List;

    move-result-object v3

    invoke-direct {v10, v14, v2, v3}, Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;-><init>(Lcom/usebutton/sdk/internal/ButtonRepository;Ljava/lang/String;Ljava/util/List;)V

    .line 189
    new-instance v15, Lcom/usebutton/sdk/internal/WebViewPresenter;

    iget-object v3, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    new-instance v4, Lcom/usebutton/sdk/internal/util/UrlPrivacyValidator;

    invoke-direct {v4}, Lcom/usebutton/sdk/internal/util/UrlPrivacyValidator;-><init>()V

    new-instance v5, Lcom/usebutton/sdk/internal/browser/BrowserUriParser;

    invoke-direct {v5}, Lcom/usebutton/sdk/internal/browser/BrowserUriParser;-><init>()V

    .line 193
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v6

    iget-object v7, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    iget-object v8, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mLink:Lcom/usebutton/sdk/models/Link;

    iget-object v9, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBrowserProxy:Lcom/usebutton/sdk/internal/BrowserProxy;

    .line 198
    invoke-static {}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->getInstance()Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    move-result-object v11

    .line 199
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;

    move-result-object v12

    new-instance v13, Lcom/usebutton/sdk/internal/MainThreadExecutor;

    invoke-direct {v13}, Lcom/usebutton/sdk/internal/MainThreadExecutor;-><init>()V

    new-instance v1, Lcom/usebutton/sdk/internal/RestrictedDomainManager;

    .line 202
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/usebutton/sdk/internal/RestrictedDomainManager;-><init>(Landroid/webkit/CookieManager;)V

    move-object v2, v15

    move-object v0, v15

    move-object v15, v1

    invoke-direct/range {v2 .. v15}, Lcom/usebutton/sdk/internal/WebViewPresenter;-><init>(Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;Lcom/usebutton/sdk/internal/util/UrlPrivacyValidator;Lcom/usebutton/sdk/internal/browser/BrowserUriParser;Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;Lcom/usebutton/sdk/internal/models/Configuration;Lcom/usebutton/sdk/internal/MainThreadExecutor;Lcom/usebutton/sdk/internal/ButtonRepository;Lcom/usebutton/sdk/internal/RestrictedDomainManager;)V

    move-object v1, v0

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    .line 205
    sget v1, Lcom/usebutton/sdk/R$id;->web_webview:I

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/webkit/WebView;

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    .line 206
    new-instance v1, Lcom/usebutton/sdk/internal/views/ViewCoordinator;

    iget-object v2, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    sget v3, Lcom/usebutton/sdk/R$id;->web_chrome_top:I

    invoke-virtual {v0, v3}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    sget v4, Lcom/usebutton/sdk/R$id;->web_chrome:I

    .line 207
    invoke-virtual {v0, v4}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/usebutton/sdk/internal/views/ViewCoordinator;-><init>(Landroid/webkit/WebView;Landroid/view/View;Landroid/view/View;Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;)V

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mCoordinator:Lcom/usebutton/sdk/internal/views/ViewCoordinator;

    .line 208
    sget v1, Lcom/usebutton/sdk/R$id;->web_loading:I

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    .line 210
    new-instance v1, Lcom/usebutton/sdk/internal/web/Navigator;

    iget-object v2, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    iget-object v3, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-direct {v1, v2, v3}, Lcom/usebutton/sdk/internal/web/Navigator;-><init>(Landroid/webkit/WebView;Lcom/usebutton/sdk/internal/WebViewPresenter;)V

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mNavigator:Lcom/usebutton/sdk/internal/web/Navigator;

    .line 212
    new-instance v1, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;

    iget-object v2, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    sget v3, Lcom/usebutton/sdk/R$id;->web_controls:I

    .line 213
    invoke-virtual {v0, v3}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/usebutton/sdk/internal/views/WebControls;

    iget-object v4, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mNavigator:Lcom/usebutton/sdk/internal/web/Navigator;

    invoke-direct {v1, v2, v3, v4}, Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Lcom/usebutton/sdk/internal/views/WebControls;Lcom/usebutton/sdk/internal/Navigable;)V

    iput-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->webChromeClient:Lcom/usebutton/sdk/internal/browser/BrowserWebChromeClient;

    .line 216
    invoke-direct/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->setupOpenInApp()V

    .line 217
    invoke-direct/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->configureWebView()V

    .line 218
    invoke-direct/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->configureChrome()V

    .line 219
    invoke-direct/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->styleBottomBar()V

    .line 220
    invoke-direct/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->setupNavBar()V

    .line 222
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    iget-object v2, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/WebViewPresenter;->setJavaScriptInterface(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V

    .line 224
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {v0, v1, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->attachPresenterToLifecycle(Lcom/usebutton/sdk/internal/base/BasePresenter;Lcom/usebutton/sdk/internal/base/BaseViewController;)V

    .line 225
    iget-object v1, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mWebView:Landroid/webkit/WebView;

    iget-object v2, v0, Lcom/usebutton/sdk/internal/WebViewActivity;->mLink:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v2}, Lcom/usebutton/sdk/models/Link;->getBrowserLink()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 227
    invoke-static/range {p0 .. p0}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isDebugBuild(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 228
    invoke-virtual/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/16 v2, 0x2000

    invoke-virtual {v1, v2}, Landroid/view/Window;->addFlags(I)V

    .line 231
    :cond_2
    invoke-direct/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->isTargetWebViewOnly()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-direct/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getInstallSheet()Lcom/usebutton/sdk/internal/models/InstallSheet;

    move-result-object v1

    if-eqz v1, :cond_3

    if-nez p1, :cond_3

    .line 232
    invoke-direct/range {p0 .. p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->startInstallSheetActivity()V

    :cond_3
    return-void

    .line 137
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Missing valid parameters."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected onDestroy()V
    .locals 1

    .line 334
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBrowserProxy:Lcom/usebutton/sdk/internal/BrowserProxy;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/BrowserProxy;->destroy()V

    .line 335
    :cond_0
    invoke-super {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHideCta()V
    .locals 2

    .line 494
    sget v0, Lcom/usebutton/sdk/R$id;->web_cta_layout:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 496
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->shouldHideOpenInAppButton()Z

    move-result v0

    if-nez v0, :cond_0

    .line 497
    sget v0, Lcom/usebutton/sdk/R$id;->web_open_app:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public onHideTopCard()V
    .locals 1

    .line 513
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet()V

    return-void
.end method

.method public onProgressChanged(I)V
    .locals 2

    .line 832
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 833
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/usebutton/sdk/internal/views/ColorProgressBar;->setProgress(IZ)V

    goto :goto_0

    .line 835
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/ColorProgressBar;->setProgress(I)V

    :goto_0
    return-void
.end method

.method public onShowAllCard(Z)V
    .locals 1

    .line 518
    sget v0, Lcom/usebutton/sdk/R$id;->web_view_all_cards:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 520
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 521
    new-instance p1, Lcom/usebutton/sdk/internal/WebViewActivity$6;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/WebViewActivity$6;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 536
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public onShowCta(Lcom/usebutton/sdk/purchasepath/CallToAction;)V
    .locals 3

    .line 462
    sget v0, Lcom/usebutton/sdk/R$id;->web_cta_layout:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    .line 463
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 465
    new-instance v1, Lcom/usebutton/sdk/internal/WebViewActivity$5;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/WebViewActivity$5;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 477
    sget v0, Lcom/usebutton/sdk/R$id;->web_open_app:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 479
    sget v0, Lcom/usebutton/sdk/R$id;->web_cta_icon:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 480
    sget v1, Lcom/usebutton/sdk/R$id;->web_cta_text:I

    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 482
    invoke-virtual {p1}, Lcom/usebutton/sdk/purchasepath/CallToAction;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 483
    invoke-virtual {p1}, Lcom/usebutton/sdk/purchasepath/CallToAction;->getTextColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 484
    invoke-virtual {p1}, Lcom/usebutton/sdk/purchasepath/CallToAction;->getIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 486
    instance-of v1, p1, Lcom/usebutton/sdk/internal/InternalCallToAction;

    if-eqz v1, :cond_0

    .line 487
    check-cast p1, Lcom/usebutton/sdk/internal/InternalCallToAction;

    .line 488
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getImageLoader()Lcom/usebutton/sdk/internal/ImageLoader;

    move-result-object v1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/InternalCallToAction;->getIconUrl()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lcom/usebutton/sdk/internal/ImageLoader;->load(Landroid/net/Uri;Landroid/widget/ImageView;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public onShowTopCard()V
    .locals 4

    .line 503
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isSheetShowing()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 504
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->notifyDataSetChanged()V

    .line 505
    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/WebViewActivity;->onBottomSheetReady(Z)V

    goto :goto_0

    .line 507
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mBottomSheetLayout:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mRecyclerViewContainer:Landroid/view/View;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    invoke-virtual {v0, v2, v3, v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->showWithSheetView(Landroid/view/View;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;Z)V

    :goto_0
    return-void
.end method

.method protected onStart()V
    .locals 1

    .line 322
    invoke-super {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onStart()V

    .line 323
    invoke-static {}, Lcom/usebutton/sdk/internal/WebViewObserver;->getInstance()Lcom/usebutton/sdk/internal/WebViewObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/WebViewObserver;->addListener(Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 328
    invoke-super {p0}, Lcom/usebutton/sdk/internal/base/BaseActivity;->onStop()V

    .line 329
    invoke-static {}, Lcom/usebutton/sdk/internal/WebViewObserver;->getInstance()Lcom/usebutton/sdk/internal/WebViewObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/WebViewObserver;->removeListener(Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;)V

    return-void
.end method

.method public reloadCards()V
    .locals 1

    .line 449
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->reloadCards()V

    return-void
.end method

.method public setBrowserChromeClient(Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 454
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->browserChromeClient:Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;

    return-void
.end method

.method public setCustomActionView(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 358
    sget v0, Lcom/usebutton/sdk/R$id;->web_chrome_custom_view:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 359
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    if-nez p1, :cond_0

    return-void

    .line 362
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 363
    new-instance v0, Lcom/usebutton/sdk/internal/WebViewActivity$4;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity$4;-><init>(Lcom/usebutton/sdk/internal/WebViewActivity;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setFooterBackgroundColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 397
    sget v0, Lcom/usebutton/sdk/R$id;->web_controls:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public setFooterTintColor(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 407
    sget v0, Lcom/usebutton/sdk/R$id;->web_open_app_text:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 408
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/ColorProgressBar;->setColor(I)V

    .line 410
    sget v0, Lcom/usebutton/sdk/R$id;->web_forward:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/widget/ImageButton;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 412
    sget v0, Lcom/usebutton/sdk/R$id;->web_back:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/widget/ImageButton;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setHeaderBackgroundColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 372
    sget v0, Lcom/usebutton/sdk/R$id;->web_chrome_top:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 373
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->setStatusBarColor(I)V

    return-void
.end method

.method public setHeaderSubtitle(Lcom/usebutton/sdk/internal/BrowserText;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/BrowserText;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 347
    sget v0, Lcom/usebutton/sdk/R$id;->web_chrome_subtitle:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/BrowserText;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 348
    sget v0, Lcom/usebutton/sdk/R$id;->web_chrome_subtitle:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/BrowserText;->getColor()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setHeaderTintColor(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 387
    sget v0, Lcom/usebutton/sdk/R$id;->web_close:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 388
    sget v0, Lcom/usebutton/sdk/R$id;->web_close:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-void
.end method

.method public setHeaderTitle(Lcom/usebutton/sdk/internal/BrowserText;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/BrowserText;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 342
    sget v0, Lcom/usebutton/sdk/R$id;->web_chrome_title:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/BrowserText;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 343
    sget v0, Lcom/usebutton/sdk/R$id;->web_chrome_title:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/BrowserText;->getColor()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public setProgressVisible(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 842
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mCoordinator:Lcom/usebutton/sdk/internal/views/ViewCoordinator;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/views/ViewCoordinator;->reset()V

    .line 843
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ViewUtils;->show(Landroid/view/View;)V

    goto :goto_0

    .line 845
    :cond_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->progressBar:Lcom/usebutton/sdk/internal/views/ColorProgressBar;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ViewUtils;->hide(Landroid/view/View;)V

    :goto_0
    return-void
.end method

.method public showTopCard()V
    .locals 3

    .line 439
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getEventTracker()Lcom/usebutton/sdk/internal/events/EventTracker;

    move-result-object v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/WebViewActivity;->mMeta:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onShowTopCard(Lcom/usebutton/sdk/internal/events/EventTracker;Ljava/lang/String;)V

    return-void
.end method
