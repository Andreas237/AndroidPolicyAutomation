.class public Lcom/usebutton/sdk/internal/WebViewPresenter;
.super Lcom/usebutton/sdk/internal/base/BasePresenter;
.source "WebViewPresenter.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/browser/BrowserWebClient$Listener;
.implements Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;
.implements Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;
.implements Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;
.implements Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;
.implements Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;,
        Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/base/BasePresenter<",
        "Lcom/usebutton/sdk/internal/WebViewController;",
        ">;",
        "Lcom/usebutton/sdk/internal/browser/BrowserWebClient$Listener;",
        "Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;",
        "Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;",
        "Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;",
        "Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;",
        "Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;"
    }
.end annotation


# instance fields
.field private final browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

.field checkoutCardAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

.field private final configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

.field private final configuration:Lcom/usebutton/sdk/internal/models/Configuration;

.field displayingActiveCard:Z
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private final eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

.field private final link:Lcom/usebutton/sdk/models/Link;

.field private final mainThreadExecutor:Lcom/usebutton/sdk/internal/MainThreadExecutor;

.field private final metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

.field private pendingPageCommit:Ljava/lang/Runnable;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final restrictedDomainManager:Lcom/usebutton/sdk/internal/RestrictedDomainManager;

.field stateMachine:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private final uriParser:Lcom/usebutton/sdk/internal/browser/BrowserUriParser;

.field urlPrivacyValidator:Lcom/usebutton/sdk/internal/util/UrlPrivacyValidator;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;Lcom/usebutton/sdk/internal/util/UrlPrivacyValidator;Lcom/usebutton/sdk/internal/browser/BrowserUriParser;Lcom/usebutton/sdk/internal/events/EventTracker;Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/purchasepath/BrowserInterface;Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;Lcom/usebutton/sdk/internal/models/Configuration;Lcom/usebutton/sdk/internal/MainThreadExecutor;Lcom/usebutton/sdk/internal/ButtonRepository;Lcom/usebutton/sdk/internal/RestrictedDomainManager;)V
    .locals 1
    .param p7    # Lcom/usebutton/sdk/purchasepath/BrowserInterface;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 96
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/base/BasePresenter;-><init>()V

    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->displayingActiveCard:Z

    .line 97
    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutCardAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    .line 98
    iput-object p11, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->mainThreadExecutor:Lcom/usebutton/sdk/internal/MainThreadExecutor;

    .line 99
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutCardAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-virtual {p1, p0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->setCheckoutCardAdapterListener(Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$CheckoutCardAdapterListener;)V

    .line 100
    iput-object p2, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->urlPrivacyValidator:Lcom/usebutton/sdk/internal/util/UrlPrivacyValidator;

    .line 101
    iput-object p3, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->uriParser:Lcom/usebutton/sdk/internal/browser/BrowserUriParser;

    .line 102
    iput-object p4, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    .line 103
    iput-object p5, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 104
    iput-object p6, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->link:Lcom/usebutton/sdk/models/Link;

    .line 105
    iput-object p7, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    .line 106
    iput-object p9, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    .line 107
    iput-object p10, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configuration:Lcom/usebutton/sdk/internal/models/Configuration;

    .line 108
    invoke-virtual {p10}, Lcom/usebutton/sdk/internal/models/Configuration;->getParameters()Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    .line 109
    iput-object p12, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    .line 110
    iput-object p13, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->restrictedDomainManager:Lcom/usebutton/sdk/internal/RestrictedDomainManager;

    .line 112
    new-instance p1, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/usebutton/sdk/internal/WebViewPresenter$BrowserStateChangeListener;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Lcom/usebutton/sdk/internal/WebViewPresenter$1;)V

    .line 113
    new-instance p2, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;

    invoke-direct {p2, p8, p1}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;-><init>(Lcom/usebutton/sdk/internal/browser/BrowserPageViewClient;Lcom/usebutton/sdk/internal/browser/BrowserStateMachine$OnStateChangeListener;)V

    iput-object p2, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->stateMachine:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;

    return-void
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/WebViewPresenter;Ljava/lang/String;)Z
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->shouldReportToPageView(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/ButtonRepository;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    return-object p0
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    return-object p0
.end method

.method static synthetic access$400(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/base/BaseViewController;
    .locals 0

    .line 55
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$600(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/purchasepath/BrowserInterface;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    return-object p0
.end method

.method static synthetic access$700(Lcom/usebutton/sdk/internal/WebViewPresenter;)Lcom/usebutton/sdk/internal/MainThreadExecutor;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->mainThreadExecutor:Lcom/usebutton/sdk/internal/MainThreadExecutor;

    return-object p0
.end method

.method private clearRestrictedDomainsCookies()V
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->restrictedDomainManager:Lcom/usebutton/sdk/internal/RestrictedDomainManager;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getRestrictedCookiesDomains()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/RestrictedDomainManager;->clearCookies(Ljava/util/Set;)V

    return-void
.end method

.method private executePendingPageCommit()V
    .locals 1

    .line 671
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->pendingPageCommit:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 672
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    const/4 v0, 0x0

    .line 675
    iput-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->pendingPageCommit:Ljava/lang/Runnable;

    return-void
.end method

.method private getBrowserCardMap()Lcom/usebutton/sdk/internal/models/BrowserCardMap;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 219
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getBrowser()Lcom/usebutton/sdk/internal/models/Browser;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 220
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Browser;->getCardsMap()Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private hasAutofillModel()Z
    .locals 1

    .line 378
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->hasAutofillFillCardModel()Z

    move-result v0

    return v0
.end method

.method private initAppInstallExtension()V
    .locals 5

    .line 162
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getBrowserCardMap()Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 165
    :cond_0
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->getMap()Ljava/util/Map;

    move-result-object v1

    sget-object v2, Lcom/usebutton/sdk/internal/models/BrowserCardType;->INSTALL_CARD:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 166
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/MetaInfo;->isTargetWebviewOnly()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->link:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v1}, Lcom/usebutton/sdk/models/Link;->getAppLink()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 168
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->getMap()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lcom/usebutton/sdk/internal/models/BrowserCardType;->INSTALL_CARD:Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;

    .line 169
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    new-instance v2, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;

    .line 170
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v3

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getImageLoader()Lcom/usebutton/sdk/internal/ImageLoader;

    move-result-object v3

    new-instance v4, Landroid/os/Handler;

    invoke-direct {v4}, Landroid/os/Handler;-><init>()V

    invoke-direct {v2, v0, v3, v4, p0}, Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;-><init>(Lcom/usebutton/sdk/internal/models/InternalInstallCard;Lcom/usebutton/sdk/internal/ImageLoader;Landroid/os/Handler;Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension$Listener;)V

    .line 169
    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setAppInstallExtension(Lcom/usebutton/sdk/internal/purchasepath/AppInstallExtension;)V

    :cond_1
    return-void
.end method

.method private initAutofill()V
    .locals 4

    .line 186
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->hasAutofillModel()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->isAutofillEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    .line 191
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isAutofillEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 195
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->getAutofillFillCardModel()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;

    move-result-object v0

    .line 198
    new-instance v1, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    .line 199
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v2

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-direct {v1, v2, v0, v3, p0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;Lcom/usebutton/sdk/internal/ButtonRepository;Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension$Listener;)V

    .line 205
    iget-object v2, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v2, v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setAutofillExtension(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;)V

    .line 207
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_2

    return-void

    .line 211
    :cond_2
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/WebViewController;

    if-eqz v1, :cond_3

    .line 212
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;->disableSystemAutofill()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 213
    invoke-interface {v1}, Lcom/usebutton/sdk/internal/WebViewController;->disableSystemAutofillService()V

    :cond_3
    return-void

    :cond_4
    :goto_0
    return-void
.end method

.method private initInternalRewardsExtension()V
    .locals 6

    .line 175
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getBrowserCardMap()Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 177
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isInstantRewardsCardEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    .line 178
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isPredictableRewardsCardEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 179
    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    new-instance v2, Lcom/usebutton/sdk/internal/InternalRewardsExtension;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configuration:Lcom/usebutton/sdk/internal/models/Configuration;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    new-instance v5, Landroid/os/Handler;

    invoke-direct {v5}, Landroid/os/Handler;-><init>()V

    invoke-direct {v2, v3, v4, v5, v0}, Lcom/usebutton/sdk/internal/InternalRewardsExtension;-><init>(Lcom/usebutton/sdk/internal/models/Configuration;Lcom/usebutton/sdk/internal/ButtonRepository;Landroid/os/Handler;Lcom/usebutton/sdk/internal/models/BrowserCardMap;)V

    invoke-virtual {v1, v2}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setExtension(Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;)V

    :cond_1
    return-void
.end method

.method private onPageStarted(Ljava/lang/String;Z)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 335
    :cond_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewController;

    if-nez v0, :cond_1

    return-void

    :cond_1
    if-nez p2, :cond_2

    const/4 p2, 0x1

    .line 341
    invoke-interface {v0, p2}, Lcom/usebutton/sdk/internal/WebViewController;->setProgressVisible(Z)V

    .line 344
    :cond_2
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->shouldReportToPageView(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 345
    iget-object p2, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->stateMachine:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;

    invoke-interface {p2, p1}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;->start(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private shouldReportToPageView(Ljava/lang/String;)Z
    .locals 1

    .line 396
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->urlPrivacyValidator:Lcom/usebutton/sdk/internal/util/UrlPrivacyValidator;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/util/UrlPrivacyValidator;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 400
    :cond_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->trackNavigation(Ljava/lang/String;)V

    .line 401
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isPageViewReportingEnabled()Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method private trackNavigation(Ljava/lang/String;)V
    .locals 2

    .line 406
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->uriParser:Lcom/usebutton/sdk/internal/browser/BrowserUriParser;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/browser/BrowserUriParser;->getUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/browser/BrowserHelpers;->propertiesForUrl(Landroid/net/Uri;Lcom/usebutton/sdk/internal/models/MetaInfo;)Lorg/json/JSONObject;

    move-result-object p1

    .line 407
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isWebNavigateEventsDisabled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string v1, "btn:webview-navigate"

    .line 409
    invoke-virtual {v0, v1, p1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public displayAutofillFillCard()V
    .locals 2

    .line 494
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->hasAutofillExtension()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    if-eqz v0, :cond_0

    .line 495
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->getAutofillExtension()Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;->displayAutofillFillCard(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    :cond_0
    return-void
.end method

.method public onAcceptClicked()V
    .locals 5

    .line 436
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewController;

    if-nez v0, :cond_0

    return-void

    .line 441
    :cond_0
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/WebViewController;->onAppInstallCardClicked()V

    .line 443
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:install-card-accepted"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "promotion_source_token"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 444
    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 443
    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public onAppInstallCardShown()V
    .locals 5

    .line 430
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:install-card-shown"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "promotion_source_token"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 431
    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 430
    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public onAutofillFieldsDetected(Lorg/json/JSONObject;)V
    .locals 3

    const-string v0, "fields"

    .line 626
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 627
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 628
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setIsAutofillPage(Z)V

    goto :goto_0

    .line 630
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setIsAutofillPage(Z)V

    .line 632
    :goto_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->executePendingPageCommit()V

    .line 633
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    new-instance v1, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/usebutton/sdk/internal/WebViewPresenter$AutofillFailableReceiver;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Lcom/usebutton/sdk/internal/WebViewPresenter$1;)V

    invoke-virtual {v0, p1, v1}, Lcom/usebutton/sdk/internal/ButtonRepository;->getAutofillMappings(Lorg/json/JSONObject;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    return-void
.end method

.method public onAutofillFieldsNotDetected()V
    .locals 2

    .line 638
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setIsAutofillPage(Z)V

    .line 639
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->executePendingPageCommit()V

    return-void
.end method

.method public onAutofillFillAccepted(Lorg/json/JSONObject;)V
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 470
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewController;

    if-eqz v0, :cond_0

    .line 472
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/WebViewController;->fillFields(Lorg/json/JSONObject;)V

    .line 475
    :cond_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    if-eqz p1, :cond_1

    .line 476
    invoke-interface {p1}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->hideTopCard()V

    .line 479
    :cond_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v0, "btn:autofill-filled"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "promotion_source_token"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 480
    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    .line 479
    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public onAutofillFillDeclined()V
    .locals 5

    .line 485
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    if-eqz v0, :cond_0

    .line 486
    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->hideTopCard()V

    .line 489
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:autofill-denied"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "promotion_source_token"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 490
    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 489
    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public onAutofillFillDisplayed()V
    .locals 5

    .line 463
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:autofill-shown"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "promotion_source_token"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 464
    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "card_type"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "fill"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    .line 463
    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public onAutofillFormSubmitted(Lorg/json/JSONObject;)V
    .locals 5

    :try_start_0
    const-string v0, "fields"

    .line 645
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    .line 647
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    .line 648
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 649
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "param"

    .line 651
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "value"

    .line 652
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 654
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_0

    .line 655
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 659
    :cond_1
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->saveProfileData(Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method onCtaClicked(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
    .locals 1

    .line 270
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, v0, :cond_0

    return-void

    .line 274
    :cond_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/WebViewController;

    if-nez p1, :cond_1

    return-void

    .line 279
    :cond_1
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->displayingActiveCard:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->displayingActiveCard:Z

    .line 280
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->displayingActiveCard:Z

    if-eqz v0, :cond_2

    .line 281
    invoke-interface {p1}, Lcom/usebutton/sdk/internal/WebViewController;->onShowTopCard()V

    goto :goto_0

    .line 283
    :cond_2
    invoke-interface {p1}, Lcom/usebutton/sdk/internal/WebViewController;->onHideTopCard()V

    :goto_0
    return-void
.end method

.method onCustomActionClick(Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;Landroid/view/View;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 415
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-virtual {p1, v0, p2}, Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;->onCustomActionClick(Lcom/usebutton/sdk/purchasepath/BrowserInterface;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public onDeclineClicked()V
    .locals 5

    .line 449
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    if-eqz v0, :cond_0

    .line 450
    invoke-interface {v0}, Lcom/usebutton/sdk/purchasepath/BrowserInterface;->hideTopCard()V

    .line 453
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->eventTracker:Lcom/usebutton/sdk/internal/events/EventTracker;

    const-string v1, "btn:install-card-declined"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "promotion_source_token"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->metaInfo:Lcom/usebutton/sdk/internal/models/MetaInfo;

    .line 454
    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getSourceToken()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 453
    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public onDisplayAutofillFillCard()V
    .locals 0

    .line 667
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->displayAutofillFillCard()V

    return-void
.end method

.method onFinishActivity()V
    .locals 2

    .line 500
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    .line 501
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getBrowserTransitionStyle()Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    move-result-object v0

    .line 502
    sget-object v1, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->DEFAULT:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 503
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/WebViewController;

    if-eqz v1, :cond_0

    .line 505
    invoke-interface {v1, v0}, Lcom/usebutton/sdk/internal/WebViewController;->animateFinishBrowserTransition(Lcom/usebutton/sdk/internal/BrowserTransitionStyle;)V

    :cond_0
    return-void
.end method

.method public onFooterReachedBottom()V
    .locals 0

    .line 312
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onHideTopCard()V

    return-void
.end method

.method onHideTopCard()V
    .locals 1

    .line 249
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewController;

    if-nez v0, :cond_0

    return-void

    .line 254
    :cond_0
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/WebViewController;->onHideTopCard()V

    return-void
.end method

.method public onNavigateJs(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 615
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onPageStarted(Ljava/lang/String;Z)V

    .line 616
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onPageCommitVisible(Ljava/lang/String;)V

    return-void
.end method

.method public onPageCommitVisible(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 355
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/WebViewPresenter$1;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter$1;-><init>(Lcom/usebutton/sdk/internal/WebViewPresenter;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->pendingPageCommit:Ljava/lang/Runnable;

    .line 364
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/WebViewController;

    if-nez p1, :cond_1

    return-void

    .line 369
    :cond_1
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->hasAutofillModel()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isAutofillEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->buttonRepository:Lcom/usebutton/sdk/internal/ButtonRepository;

    .line 370
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonRepository;->getUser()Lcom/usebutton/sdk/internal/user/UserImpl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/user/UserImpl;->isAutofillEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 371
    invoke-interface {p1}, Lcom/usebutton/sdk/internal/WebViewController;->loadBtnSdkJs()V

    goto :goto_0

    .line 373
    :cond_2
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->executePendingPageCommit()V

    :goto_0
    return-void
.end method

.method public onPageFinished()V
    .locals 2

    .line 383
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewController;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 388
    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/WebViewController;->setProgressVisible(Z)V

    return-void
.end method

.method public onPageFinishedJs(Ljava/lang/String;)V
    .locals 0

    .line 621
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onPageCommitVisible(Ljava/lang/String;)V

    return-void
.end method

.method public onPageStarted(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 327
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->onPageStarted(Ljava/lang/String;Z)V

    return-void
.end method

.method onShowTopCard(Lcom/usebutton/sdk/internal/events/EventTracker;Ljava/lang/String;)V
    .locals 6
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 228
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewController;

    if-nez v0, :cond_0

    return-void

    .line 233
    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutCardAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->getCards()Ljava/util/List;

    move-result-object v1

    .line 234
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/purchasepath/Card;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-string v2, "unknown"

    if-eqz v1, :cond_2

    .line 237
    invoke-virtual {v1}, Lcom/usebutton/sdk/purchasepath/Card;->getKey()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 238
    invoke-virtual {v1}, Lcom/usebutton/sdk/purchasepath/Card;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 239
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v4, 0x40

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_2
    const-string v1, "btn:developer-showed-card"

    const/4 v4, 0x4

    .line 242
    new-array v4, v4, [Ljava/lang/String;

    const-string v5, "card_key"

    aput-object v5, v4, v3

    const/4 v3, 0x1

    aput-object v2, v4, v3

    const/4 v2, 0x2

    const-string v3, "promotion_source_token"

    aput-object v3, v4, v2

    const/4 v2, 0x3

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    const-string p2, "unknown"

    :goto_1
    aput-object p2, v4, v2

    invoke-virtual {p1, v1, v4}, Lcom/usebutton/sdk/internal/events/EventTracker;->trackEventWithProperties(Ljava/lang/String;[Ljava/lang/String;)V

    .line 245
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/WebViewController;->onShowTopCard()V

    return-void
.end method

.method onStateChanged(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
    .locals 1

    .line 258
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewController;

    if-nez v0, :cond_0

    return-void

    .line 263
    :cond_0
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/WebViewController;->onConfigureDismissAllCards(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    .line 264
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-eq p1, v0, :cond_2

    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->displayingActiveCard:Z

    return-void
.end method

.method public onStoreUrl(Ljava/lang/String;)V
    .locals 1

    .line 317
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewController;

    if-nez v0, :cond_0

    return-void

    .line 322
    :cond_0
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/WebViewController;->checkWebViewOnlyAndStartAttendedInstall(Ljava/lang/String;)V

    return-void
.end method

.method onSubtitleClick(Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 421
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;->onSubtitleClick(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    :cond_0
    return-void
.end method

.method public onTopCardChanged(Lcom/usebutton/sdk/purchasepath/Card;)V
    .locals 2

    .line 289
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewController;

    if-nez v0, :cond_0

    return-void

    .line 294
    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutCardAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->getItemCount()I

    move-result v1

    if-nez v1, :cond_1

    .line 295
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/WebViewController;->onHideCta()V

    goto :goto_0

    .line 297
    :cond_1
    invoke-virtual {p1}, Lcom/usebutton/sdk/purchasepath/Card;->getCallToAction()Lcom/usebutton/sdk/purchasepath/CallToAction;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/WebViewController;->onShowCta(Lcom/usebutton/sdk/purchasepath/CallToAction;)V

    .line 300
    :goto_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutCardAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->getItemCount()I

    move-result p1

    const/4 v1, 0x1

    if-gt p1, v1, :cond_2

    const/4 p1, 0x0

    .line 301
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/WebViewController;->onShowAllCard(Z)V

    goto :goto_1

    .line 303
    :cond_2
    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/WebViewController;->onShowAllCard(Z)V

    :goto_1
    return-void
.end method

.method protected onViewAttached()V
    .locals 2

    .line 121
    invoke-super {p0}, Lcom/usebutton/sdk/internal/base/BasePresenter;->onViewAttached()V

    .line 122
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->isPurchasePathExtensionDisabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setExtension(Lcom/usebutton/sdk/purchasepath/PurchasePathExtension;)V

    .line 124
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setAutofillExtension(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;)V

    .line 127
    :cond_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->initAppInstallExtension()V

    .line 129
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->hasExtension()Z

    move-result v0

    if-nez v0, :cond_1

    .line 130
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->initInternalRewardsExtension()V

    .line 133
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->browserInterface:Lcom/usebutton/sdk/purchasepath/BrowserInterface;

    if-eqz v0, :cond_2

    .line 134
    iget-object v1, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->notifyOnInitialized(Lcom/usebutton/sdk/purchasepath/BrowserInterface;)V

    .line 137
    :cond_2
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->initAutofill()V

    .line 138
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->clearRestrictedDomainsCookies()V

    .line 140
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->configParameters:Lcom/usebutton/sdk/internal/models/Configuration$Parameters;

    .line 141
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Configuration$Parameters;->getBrowserTransitionStyle()Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    move-result-object v0

    .line 142
    sget-object v1, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->DEFAULT:Lcom/usebutton/sdk/internal/BrowserTransitionStyle;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/BrowserTransitionStyle;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 143
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/WebViewPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/WebViewController;

    if-eqz v1, :cond_3

    .line 145
    invoke-interface {v1, v0}, Lcom/usebutton/sdk/internal/WebViewController;->animateStartBrowserTransition(Lcom/usebutton/sdk/internal/BrowserTransitionStyle;)V

    :cond_3
    return-void
.end method

.method protected onViewDetached()V
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->notifyOnClosed()V

    .line 157
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setAutofillExtension(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillExtension;)V

    .line 158
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutManager:Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutManager;->setAutofillFillCardModel(Lcom/usebutton/sdk/internal/purchasepath/autofill/AutofillModel$FillCard;)V

    return-void
.end method

.method reloadCards()V
    .locals 1

    .line 392
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->checkoutCardAdapter:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->reloadCards()V

    return-void
.end method

.method setJavaScriptInterface(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 224
    iget-object v0, p0, Lcom/usebutton/sdk/internal/WebViewPresenter;->stateMachine:Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachine;->setJavascriptInterface(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V

    return-void
.end method
