.class public Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;
.super Ljava/lang/Object;
.source "BrowserPageImpl.java"

# interfaces
.implements Lcom/usebutton/sdk/purchasepath/BrowserPage;


# instance fields
.field private final javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

.field private final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;->url:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    return-void
.end method


# virtual methods
.method public getBrowserDom(Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 37
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;->javascriptInterface:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->getDom(Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;)V

    return-void
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/usebutton/sdk/internal/browser/BrowserPageImpl;->url:Ljava/lang/String;

    return-object v0
.end method
