.class public Lcom/usebutton/sdk/internal/web/Navigator;
.super Ljava/lang/Object;
.source "Navigator.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/Navigable;


# instance fields
.field private mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/util/Publisher<",
            "Lcom/usebutton/sdk/internal/Navigable$NavigationListener;",
            ">;"
        }
    .end annotation
.end field

.field private final presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

.field private final webView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;Lcom/usebutton/sdk/internal/WebViewPresenter;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Lcom/usebutton/sdk/internal/util/Publisher;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/Publisher;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/web/Navigator;->mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;

    .line 17
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/Navigator;->webView:Landroid/webkit/WebView;

    .line 18
    iput-object p2, p0, Lcom/usebutton/sdk/internal/web/Navigator;->presenter:Lcom/usebutton/sdk/internal/WebViewPresenter;

    return-void
.end method


# virtual methods
.method public back()V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/Navigator;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/Navigator;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    :cond_0
    return-void
.end method

.method public canNavigateBack()Z
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/Navigator;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    return v0
.end method

.method public canNavigateForward()Z
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/Navigator;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v0

    return v0
.end method

.method public forward()V
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/Navigator;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/Navigator;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goForward()V

    :cond_0
    return-void
.end method

.method public getObservable()Lcom/usebutton/sdk/internal/functional/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/usebutton/sdk/internal/functional/Observable<",
            "Lcom/usebutton/sdk/internal/Navigable$NavigationListener;",
            ">;"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/Navigator;->mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;

    return-object v0
.end method

.method public onNavigation()V
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/Navigator;->mPublisher:Lcom/usebutton/sdk/internal/util/Publisher;

    new-instance v1, Lcom/usebutton/sdk/internal/web/Navigator$1;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/web/Navigator$1;-><init>(Lcom/usebutton/sdk/internal/web/Navigator;)V

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/Publisher;->perform(Lcom/usebutton/sdk/internal/util/Publisher$Action;)V

    return-void
.end method
