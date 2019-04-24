.class public Lorg/researchstack/backbone/ui/views/LocalWebView;
.super Landroid/webkit/WebView;
.source "LocalWebView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/ui/views/LocalWebView$LocalWebViewCallbacks;
    }
.end annotation


# static fields
.field private static final SCHEMA_LOCAL_HTML:Ljava/lang/String; = "file:///android_asset/"


# instance fields
.field private callbacks:Lorg/researchstack/backbone/ui/views/LocalWebView$LocalWebViewCallbacks;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 32
    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 33
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/LocalWebView;->init()V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/LocalWebView;->init()V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 44
    invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/LocalWebView;->init()V

    .line 46
    return-void
.end method

.method static synthetic access$000(Lorg/researchstack/backbone/ui/views/LocalWebView;)Lorg/researchstack/backbone/ui/views/LocalWebView$LocalWebViewCallbacks;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/LocalWebView;

    .prologue
    .line 18
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/LocalWebView;->callbacks:Lorg/researchstack/backbone/ui/views/LocalWebView$LocalWebViewCallbacks;

    return-object v0
.end method

.method private init()V
    .locals 2

    .prologue
    .line 50
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/LocalWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 51
    new-instance v0, Lorg/researchstack/backbone/ui/views/LocalWebView$1;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/LocalWebView$1;-><init>(Lorg/researchstack/backbone/ui/views/LocalWebView;)V

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/views/LocalWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 96
    new-instance v0, Lorg/researchstack/backbone/ui/views/LocalWebView$2;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/LocalWebView$2;-><init>(Lorg/researchstack/backbone/ui/views/LocalWebView;)V

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/views/LocalWebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 108
    return-void
.end method


# virtual methods
.method public setCallbacks(Lorg/researchstack/backbone/ui/views/LocalWebView$LocalWebViewCallbacks;)V
    .locals 0
    .param p1, "callbacks"    # Lorg/researchstack/backbone/ui/views/LocalWebView$LocalWebViewCallbacks;

    .prologue
    .line 112
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/LocalWebView;->callbacks:Lorg/researchstack/backbone/ui/views/LocalWebView$LocalWebViewCallbacks;

    .line 113
    return-void
.end method
