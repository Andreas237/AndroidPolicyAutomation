.class public Lcom/usebutton/sdk/internal/views/PopupWebView;
.super Landroid/widget/FrameLayout;
.source "PopupWebView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ButtonPopupWebView"


# instance fields
.field private mBackground:Landroid/view/View;

.field private final mListener:Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;

.field private mWebView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;)V
    .locals 0
    .param p2    # Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 41
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 42
    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mListener:Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;

    .line 43
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->initPopup()V

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/views/PopupWebView;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->destroyWebView()V

    return-void
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/views/PopupWebView;)Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mListener:Lcom/usebutton/sdk/internal/views/PopupWebView$OnPopupClosedListener;

    return-object p0
.end method

.method private destroyWebView()V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 71
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 72
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    const/4 v0, 0x0

    .line 73
    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    return-void
.end method

.method private initPopup()V
    .locals 3

    .line 47
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    sget v1, Lcom/usebutton/sdk/R$layout;->btn_web_view_popup:I

    const/4 v2, 0x1

    .line 48
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 50
    sget v0, Lcom/usebutton/sdk/R$id;->web_popup_background:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mBackground:Landroid/view/View;

    .line 51
    sget v0, Lcom/usebutton/sdk/R$id;->web_popup_web_view:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    .line 52
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 53
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    new-instance v1, Landroid/webkit/WebViewClient;

    invoke-direct {v1}, Landroid/webkit/WebViewClient;-><init>()V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 54
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    new-instance v1, Lcom/usebutton/sdk/internal/views/PopupWebView$1;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/views/PopupWebView$1;-><init>(Lcom/usebutton/sdk/internal/views/PopupWebView;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method private open()V
    .locals 3

    .line 80
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mBackground:Landroid/view/View;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/usebutton/sdk/R$anim;->btn_fade_in:I

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 81
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/usebutton/sdk/R$anim;->btn_slide_up:I

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 88
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mBackground:Landroid/view/View;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/usebutton/sdk/R$anim;->btn_fade_out:I

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 89
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$anim;->btn_slide_down:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 90
    new-instance v1, Lcom/usebutton/sdk/internal/views/PopupWebView$2;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/views/PopupWebView$2;-><init>(Lcom/usebutton/sdk/internal/views/PopupWebView;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 107
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public getWebView()Landroid/webkit/WebView;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/PopupWebView;->mWebView:Landroid/webkit/WebView;

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 116
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 117
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/PopupWebView;->open()V

    return-void
.end method
