.class Lcom/usebutton/sdk/internal/InstallSheetPresenter;
.super Lcom/usebutton/sdk/internal/base/BasePresenter;
.source "InstallSheetPresenter.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/base/BasePresenter<",
        "Lcom/usebutton/sdk/internal/InstallSheetController;",
        ">;",
        "Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;"
    }
.end annotation


# static fields
.field static final LOADING_TIMER_DELAY_IN_MILLIS:J = 0x1388L


# instance fields
.field private installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

.field private isLoaded:Z

.field private final webViewObserver:Lcom/usebutton/sdk/internal/WebViewObserver;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/models/InstallSheet;Lcom/usebutton/sdk/internal/WebViewObserver;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/base/BasePresenter;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    const/4 p1, 0x0

    .line 21
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->isLoaded:Z

    .line 22
    iput-object p2, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->webViewObserver:Lcom/usebutton/sdk/internal/WebViewObserver;

    return-void
.end method

.method private enableWebView()V
    .locals 3

    .line 93
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->isLoaded:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 94
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->isLoaded:Z

    .line 95
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/InstallSheet;->getWebActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v0

    .line 96
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/InstallSheetController;

    if-eqz v1, :cond_0

    .line 98
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v2

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/usebutton/sdk/internal/InstallSheetController;->setWebAction(ILjava/lang/String;)V

    .line 99
    invoke-interface {v1}, Lcom/usebutton/sdk/internal/InstallSheetController;->initBackground()V

    .line 100
    invoke-interface {v1}, Lcom/usebutton/sdk/internal/InstallSheetController;->initWebButton()V

    :cond_0
    return-void
.end method


# virtual methods
.method onClickAppButton()V
    .locals 1

    .line 61
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/InstallSheetController;

    if-eqz v0, :cond_0

    .line 63
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/InstallSheetController;->startAttendedInstall()V

    :cond_0
    return-void
.end method

.method onClickBackground()V
    .locals 1

    .line 47
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/InstallSheetController;

    if-eqz v0, :cond_0

    .line 49
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/InstallSheetController;->shutdown()V

    :cond_0
    return-void
.end method

.method onClickWebButton()V
    .locals 1

    .line 54
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/InstallSheetController;

    if-eqz v0, :cond_0

    .line 56
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/InstallSheetController;->shutdown()V

    :cond_0
    return-void
.end method

.method onLoadingTimerComplete()V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->enableWebView()V

    return-void
.end method

.method public onProgressChanged(I)V
    .locals 1

    .line 81
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/InstallSheetController;

    if-eqz v0, :cond_0

    .line 83
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/InstallSheetController;->setWebViewProgress(I)V

    :cond_0
    const/16 v0, 0x64

    if-lt p1, v0, :cond_1

    .line 87
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->enableWebView()V

    .line 88
    iget-object p1, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->webViewObserver:Lcom/usebutton/sdk/internal/WebViewObserver;

    invoke-virtual {p1, p0}, Lcom/usebutton/sdk/internal/WebViewObserver;->removeListener(Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;)V

    :cond_1
    return-void
.end method

.method onStart()V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->webViewObserver:Lcom/usebutton/sdk/internal/WebViewObserver;

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/WebViewObserver;->addListener(Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;)V

    return-void
.end method

.method onStop()V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->webViewObserver:Lcom/usebutton/sdk/internal/WebViewObserver;

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/WebViewObserver;->removeListener(Lcom/usebutton/sdk/internal/WebViewObserver$OnProgressChangedListener;)V

    return-void
.end method

.method protected onViewAttached()V
    .locals 7

    .line 27
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/InstallSheetController;

    if-eqz v0, :cond_0

    .line 29
    iget-object v1, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/InstallSheet;->getTitleText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v1

    .line 30
    iget-object v2, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/InstallSheet;->getAppTitleText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    .line 31
    iget-object v3, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/InstallSheet;->getAppSubtitleText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v3

    .line 32
    iget-object v4, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/InstallSheet;->getAppActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v4

    .line 33
    iget-object v5, p0, Lcom/usebutton/sdk/internal/InstallSheetPresenter;->installSheet:Lcom/usebutton/sdk/internal/models/InstallSheet;

    invoke-virtual {v5}, Lcom/usebutton/sdk/internal/models/InstallSheet;->getWebActionText()Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v5

    .line 35
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v6

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v6, v1}, Lcom/usebutton/sdk/internal/InstallSheetController;->setTitle(ILjava/lang/String;)V

    .line 36
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v1

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/usebutton/sdk/internal/InstallSheetController;->setAppTitle(ILjava/lang/String;)V

    .line 37
    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v1

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/usebutton/sdk/internal/InstallSheetController;->setAppSubtitle(ILjava/lang/String;)V

    .line 38
    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/Text;->getColor()I

    move-result v1

    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/usebutton/sdk/internal/InstallSheetController;->setAppAction(ILjava/lang/String;)V

    .line 39
    invoke-virtual {v5}, Lcom/usebutton/sdk/internal/models/Text;->getCopy()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/usebutton/sdk/internal/InstallSheetController;->setWebAction(Ljava/lang/String;)V

    .line 41
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/InstallSheetController;->initAppButton()V

    const-wide/16 v1, 0x1388

    .line 42
    invoke-interface {v0, v1, v2}, Lcom/usebutton/sdk/internal/InstallSheetController;->initLoadingTimer(J)V

    :cond_0
    return-void
.end method
