.class public Lcom/shopkick/app/webview/SKWebView;
.super Landroid/widget/RelativeLayout;
.source "SKWebView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;,
        Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;
    }
.end annotation


# static fields
.field private static final ACCEPT_LANGUAGE_HEADER:Ljava/lang/String; = "Accept-Language"

.field public static final EMPTY_PAGE_URL:Ljava/lang/String; = "about:blank"

.field private static final TAG:Ljava/lang/String; = "SKWebView"

.field public static final WEBVIEW_ACTION_CLOSE:Ljava/lang/String; = "close"

.field public static final WEBVIEW_ACTION_CLOSE_DELAY_MS:I = 0x3e8

.field public static final WEBVIEW_ACTION_LINK_KEY:Ljava/lang/String; = "webview_action"


# instance fields
.field private activity:Landroid/app/Activity;

.field private backButton:Lcom/shopkick/app/widget/SKButton;

.field private buttonContainer:Landroid/widget/RelativeLayout;

.field private clickListener:Landroid/view/View$OnClickListener;

.field private footer:Landroid/view/View;

.field private footerText:Landroid/widget/TextView;

.field private forwardButton:Lcom/shopkick/app/widget/SKButton;

.field private goToOAndAButton:Lcom/shopkick/app/widget/TransparentTapView;

.field private header:Landroid/widget/TextView;

.field private inactiveBackButton:Landroid/view/View;

.field private inactiveForwardButton:Landroid/view/View;

.field private isLoading:Z

.field private mFilePathCallback:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private mUploadMessage:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field private progressBar:Landroid/widget/ProgressBar;

.field private progressEnabled:Z

.field private progressTextView:Landroid/widget/TextView;

.field private refreshButton:Lcom/shopkick/app/widget/SKButton;

.field private statusCallback:Lcom/shopkick/app/webview/IWebViewStatusCallback;

.field touchListener:Landroid/view/View$OnTouchListener;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private urlHandlingCallback:Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;

.field private webChromeClient:Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

.field private webView:Landroid/webkit/WebView;

.field private webViewClient:Landroid/webkit/WebViewClient;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 124
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/webview/SKWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 128
    invoke-direct {p0, p1, p2, v0}, Lcom/shopkick/app/webview/SKWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 132
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 107
    sget-object p1, Lcom/shopkick/app/webview/-$$Lambda$SKWebView$s6KMWc0S1CHAvucj6SAEaA_L_IY;->INSTANCE:Lcom/shopkick/app/webview/-$$Lambda$SKWebView$s6KMWc0S1CHAvucj6SAEaA_L_IY;

    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->touchListener:Landroid/view/View$OnTouchListener;

    .line 234
    new-instance p1, Lcom/shopkick/app/webview/SKWebView$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/webview/SKWebView$1;-><init>(Lcom/shopkick/app/webview/SKWebView;)V

    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->clickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/webview/SKWebView;->backButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/webview/SKWebView;->mUploadMessage:Landroid/webkit/ValueCallback;

    return-object p0
.end method

.method static synthetic access$1002(Lcom/shopkick/app/webview/SKWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->mUploadMessage:Landroid/webkit/ValueCallback;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/shopkick/app/webview/SKWebView;)Landroid/webkit/ValueCallback;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/webview/SKWebView;->mFilePathCallback:Landroid/webkit/ValueCallback;

    return-object p0
.end method

.method static synthetic access$1102(Lcom/shopkick/app/webview/SKWebView;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->mFilePathCallback:Landroid/webkit/ValueCallback;

    return-object p1
.end method

.method static synthetic access$1200(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/webview/SKWebView;->webChromeClient:Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/webview/SKWebView;->forwardButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/webview/SKWebView;->refreshButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/webview/SKWebView;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/webview/SKWebView;->activity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/webview/SKWebView;->urlHandlingCallback:Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/webview/SKWebView;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/shopkick/app/webview/SKWebView;->toggleNavigationVisibility()V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewStatusCallback;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/shopkick/app/webview/SKWebView;->statusCallback:Lcom/shopkick/app/webview/IWebViewStatusCallback;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/webview/SKWebView;Z)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/shopkick/app/webview/SKWebView;->setIsLoading(Z)V

    return-void
.end method

.method static synthetic lambda$new$42(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 108
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 111
    :pswitch_0
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-nez p1, :cond_0

    .line 112
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    :cond_0
    :goto_0
    const/4 p0, 0x0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private setIsLoading(Z)V
    .locals 1

    .line 371
    iget-boolean v0, p0, Lcom/shopkick/app/webview/SKWebView;->isLoading:Z

    if-eq v0, p1, :cond_0

    .line 372
    iput-boolean p1, p0, Lcom/shopkick/app/webview/SKWebView;->isLoading:Z

    .line 373
    invoke-direct {p0}, Lcom/shopkick/app/webview/SKWebView;->updateProgress()V

    :cond_0
    return-void
.end method

.method private setWebViewBackgroundTransparent()V
    .locals 7

    .line 263
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 264
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 266
    :try_start_0
    const-class v0, Landroid/view/View;

    const-string v2, "setLayerType"

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v1

    const-class v5, Landroid/graphics/Paint;

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 267
    iget-object v2, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    aput-object v1, v3, v6

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private toggleNavigationVisibility()V
    .locals 5

    .line 252
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->backButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0}, Lcom/shopkick/app/webview/SKWebView;->canGoBack()Z

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->inactiveBackButton:Landroid/view/View;

    invoke-virtual {p0}, Lcom/shopkick/app/webview/SKWebView;->canGoBack()Z

    move-result v1

    const/16 v4, 0x8

    if-eqz v1, :cond_1

    move v1, v4

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->forwardButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0}, Lcom/shopkick/app/webview/SKWebView;->canGoForward()Z

    move-result v1

    if-eqz v1, :cond_2

    move v2, v3

    :cond_2
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->inactiveForwardButton:Landroid/view/View;

    invoke-virtual {p0}, Lcom/shopkick/app/webview/SKWebView;->canGoForward()Z

    move-result v1

    if-eqz v1, :cond_3

    move v3, v4

    :cond_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private updateProgress()V
    .locals 2

    .line 378
    iget-boolean v0, p0, Lcom/shopkick/app/webview/SKWebView;->progressEnabled:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/shopkick/app/webview/SKWebView;->isLoading:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 382
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 383
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->progressTextView:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 379
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->progressBar:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 380
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->progressTextView:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    return-void
.end method


# virtual methods
.method public canGoBack()Z
    .locals 1

    .line 402
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    return v0
.end method

.method public canGoForward()Z
    .locals 1

    .line 392
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v0

    return v0
.end method

.method public destroy()V
    .locals 3

    const/4 v0, 0x0

    .line 192
    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->statusCallback:Lcom/shopkick/app/webview/IWebViewStatusCallback;

    .line 193
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->webChromeClient:Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    if-eqz v1, :cond_0

    .line 194
    iget-object v2, p0, Lcom/shopkick/app/webview/SKWebView;->activity:Landroid/app/Activity;

    check-cast v2, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 195
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->activity:Landroid/app/Activity;

    check-cast v1, Lcom/shopkick/app/activities/BaseActivity;

    iget-object v2, p0, Lcom/shopkick/app/webview/SKWebView;->webChromeClient:Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/activities/BaseActivity;->removePermissionResultListener(Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;)V

    .line 196
    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webChromeClient:Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    .line 198
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    if-eqz v1, :cond_1

    .line 199
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 200
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 201
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 202
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->destroy()V

    .line 204
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    if-eqz v1, :cond_2

    .line 205
    invoke-virtual {v1, v0}, Lcom/shopkick/app/url/URLDispatcher;->setCallback(Lcom/shopkick/app/url/IURLDispatcherCallback;)V

    .line 206
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v1}, Lcom/shopkick/app/url/URLDispatcher;->destroy()V

    .line 209
    :cond_2
    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->buttonContainer:Landroid/widget/RelativeLayout;

    .line 210
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->backButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->backButton:Lcom/shopkick/app/widget/SKButton;

    .line 212
    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->inactiveBackButton:Landroid/view/View;

    .line 213
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->forwardButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->forwardButton:Lcom/shopkick/app/widget/SKButton;

    .line 215
    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->inactiveForwardButton:Landroid/view/View;

    .line 216
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->refreshButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 217
    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->refreshButton:Lcom/shopkick/app/widget/SKButton;

    .line 218
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->goToOAndAButton:Lcom/shopkick/app/widget/TransparentTapView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/TransparentTapView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->goToOAndAButton:Lcom/shopkick/app/widget/TransparentTapView;

    return-void
.end method

.method public enableFooter(Ljava/lang/String;)V
    .locals 2

    .line 299
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->footer:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 300
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->footerText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public enableNavigation()V
    .locals 2

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->header:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->buttonContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->backButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 230
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->forwardButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 231
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->refreshButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public getUrlFromActualWebView()Ljava/lang/String;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 187
    :cond_0
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public goBack()V
    .locals 1

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    :cond_0
    return-void
.end method

.method public goForward()V
    .locals 1

    .line 396
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goForward()V

    :cond_0
    return-void
.end method

.method public loadHtml(Ljava/lang/String;)V
    .locals 6

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    const-string/jumbo v3, "text/html"

    const-string/jumbo v4, "utf-8"

    const/4 v1, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public loadJavaScript(Ljava/lang/String;)V
    .locals 7

    .line 312
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"><script type=\"text/javascript\">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "</script>"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "</head><body></body>"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 315
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    const-string/jumbo v4, "text/html"

    const-string/jumbo v5, "utf-8"

    const/4 v2, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public loadUrl(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 319
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/webview/SKWebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public loadUrl(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 325
    invoke-direct {p0, p1}, Lcom/shopkick/app/webview/SKWebView;->setIsLoading(Z)V

    return-void

    .line 329
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 330
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "sk"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 331
    invoke-static {p1}, Lcom/shopkick/app/url/URLDispatcher;->getUriKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "webview_action"

    .line 333
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v1, p1, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 338
    :cond_1
    invoke-static {v0}, Lcom/shopkick/app/url/URLDispatcher;->convertAppContextLink(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 339
    iget-object v1, p0, Lcom/shopkick/app/webview/SKWebView;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v1, v0, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    .line 344
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/webview/SKWebView;->urlHandlingCallback:Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;

    if-eqz p2, :cond_3

    .line 345
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-interface {p2, v0, p1}, Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;->shouldOverrideURLLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    return-void

    .line 351
    :cond_3
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 352
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Accept-Language"

    .line 353
    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 356
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->progressTextView:Landroid/widget/TextView;

    const p2, 0x7f11019e

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    const/4 p1, 0x1

    .line 357
    invoke-direct {p0, p1}, Lcom/shopkick/app/webview/SKWebView;->setIsLoading(Z)V

    return-void
.end method

.method public reload()V
    .locals 1

    const/4 v0, 0x1

    .line 361
    invoke-direct {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->setIsLoading(Z)V

    .line 362
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    return-void
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    .line 366
    invoke-direct {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->setIsLoading(Z)V

    .line 367
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearView()V

    return-void
.end method

.method public setCacheMode(I)V
    .locals 1

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 284
    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    return-void
.end method

.method public setDispatcherCallback(Lcom/shopkick/app/url/IURLDispatcherCallback;)V
    .locals 1

    .line 288
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->setCallback(Lcom/shopkick/app/url/IURLDispatcherCallback;)V

    return-void
.end method

.method public setHorizontalScrollBarEnabled(Z)V
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    return-void
.end method

.method public setProgressEnabled(Z)V
    .locals 1

    .line 292
    iget-boolean v0, p0, Lcom/shopkick/app/webview/SKWebView;->progressEnabled:Z

    if-eq v0, p1, :cond_0

    .line 293
    iput-boolean p1, p0, Lcom/shopkick/app/webview/SKWebView;->progressEnabled:Z

    .line 294
    invoke-direct {p0}, Lcom/shopkick/app/webview/SKWebView;->updateProgress()V

    :cond_0
    return-void
.end method

.method public setStatusCallback(Lcom/shopkick/app/webview/IWebViewStatusCallback;)V
    .locals 0

    .line 416
    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->statusCallback:Lcom/shopkick/app/webview/IWebViewStatusCallback;

    return-void
.end method

.method public setURLHandlingCallback(Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;)V
    .locals 0

    .line 424
    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->urlHandlingCallback:Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;

    return-void
.end method

.method public setVerticalScrollBarEnabled(Z)V
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    return-void
.end method

.method public setup(Landroid/app/Activity;Lcom/shopkick/app/url/URLDispatcherFactory;)V
    .locals 3

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    return-void

    .line 141
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/webview/SKWebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01ef

    const/4 v2, 0x1

    .line 142
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const v0, 0x7f0905a7

    .line 144
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    const v0, 0x7f090843

    .line 145
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->header:Landroid/widget/TextView;

    const v0, 0x7f090845

    .line 146
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->progressBar:Landroid/widget/ProgressBar;

    const v0, 0x7f090844

    .line 147
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->progressTextView:Landroid/widget/TextView;

    const v0, 0x7f0900ba

    .line 148
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->buttonContainer:Landroid/widget/RelativeLayout;

    const v0, 0x7f090055

    .line 149
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->backButton:Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f090309

    .line 150
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->inactiveBackButton:Landroid/view/View;

    const v0, 0x7f09029a

    .line 151
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->forwardButton:Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f09030a

    .line 152
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->inactiveForwardButton:Landroid/view/View;

    const v0, 0x7f0905a1

    .line 153
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->refreshButton:Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f090293

    .line 154
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->footer:Landroid/view/View;

    const v0, 0x7f090294

    .line 155
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->footerText:Landroid/widget/TextView;

    const v0, 0x7f0904e3

    .line 156
    invoke-virtual {p0, v0}, Lcom/shopkick/app/webview/SKWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/TransparentTapView;

    iput-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->goToOAndAButton:Lcom/shopkick/app/widget/TransparentTapView;

    .line 158
    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->activity:Landroid/app/Activity;

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcherForWebView(Landroid/webkit/WebView;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 161
    new-instance p1, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;

    invoke-direct {p1, p0}, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;-><init>(Lcom/shopkick/app/webview/SKWebView;)V

    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->webViewClient:Landroid/webkit/WebViewClient;

    .line 162
    new-instance p1, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;-><init>(Lcom/shopkick/app/webview/SKWebView;Lcom/shopkick/app/webview/SKWebView$1;)V

    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->webChromeClient:Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    .line 164
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webViewClient:Landroid/webkit/WebViewClient;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 165
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView;->webChromeClient:Lcom/shopkick/app/webview/SKWebView$SKWebChromeClient;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 167
    invoke-direct {p0}, Lcom/shopkick/app/webview/SKWebView;->setWebViewBackgroundTransparent()V

    .line 168
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V

    .line 169
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V

    .line 171
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    .line 172
    invoke-virtual {p1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 173
    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 174
    invoke-virtual {p1, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    const/4 v0, 0x2

    invoke-virtual {p1, v0, p2}, Landroid/webkit/WebView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 180
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView;->webView:Landroid/webkit/WebView;

    iget-object p2, p0, Lcom/shopkick/app/webview/SKWebView;->touchListener:Landroid/view/View$OnTouchListener;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method
