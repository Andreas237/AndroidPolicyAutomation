.class Lcom/usebutton/sdk/internal/BrowserProxy;
.super Ljava/lang/Object;
.source "BrowserProxy.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/BrowserInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;,
        Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;
    }
.end annotation


# instance fields
.field activityWeakReference:Ljava/lang/ref/WeakReference;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/usebutton/sdk/internal/WebViewActivity;",
            ">;"
        }
    .end annotation
.end field

.field private footer:Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;

.field private header:Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/WebViewActivity;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    .line 42
    new-instance p1, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserHeader;-><init>(Lcom/usebutton/sdk/internal/BrowserProxy;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->header:Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;

    .line 43
    new-instance p1, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/BrowserProxy$BrowserFooter;-><init>(Lcom/usebutton/sdk/internal/BrowserProxy;)V

    iput-object p1, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->footer:Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/BrowserProxy;)Z
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BrowserProxy;->check()Z

    move-result p0

    return p0
.end method

.method private check()Z
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method destroy()V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    return-void
.end method

.method public getCardList()Lcom/usebutton/sdk/purchasepath/CardList;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 77
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BrowserProxy;->check()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getCardList()Lcom/usebutton/sdk/purchasepath/CardList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getFooter()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 124
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BrowserProxy;->check()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->footer:Lcom/usebutton/sdk/purchasepath/BrowserInterface$Footer;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getHeader()Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 115
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BrowserProxy;->check()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->header:Lcom/usebutton/sdk/purchasepath/BrowserInterface$Header;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getViewContainer()Landroid/widget/RelativeLayout;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 68
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BrowserProxy;->check()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->getViewContainer()Landroid/widget/RelativeLayout;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hideTopCard()V
    .locals 1

    .line 93
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BrowserProxy;->check()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->onHideTopCard()V

    :cond_0
    return-void
.end method

.method public reloadCards()V
    .locals 1

    .line 101
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BrowserProxy;->check()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->reloadCards()V

    :cond_0
    return-void
.end method

.method public setBrowserChromeClient(Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 106
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BrowserProxy;->check()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/WebViewActivity;->setBrowserChromeClient(Lcom/usebutton/sdk/purchasepath/BrowserChromeClient;)V

    :cond_0
    return-void
.end method

.method public showTopCard()V
    .locals 1

    .line 85
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BrowserProxy;->check()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/BrowserProxy;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/WebViewActivity;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/WebViewActivity;->onShowTopCard()V

    :cond_0
    return-void
.end method
