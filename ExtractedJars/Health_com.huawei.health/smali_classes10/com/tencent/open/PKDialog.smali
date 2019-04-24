.class public Lcom/tencent/open/PKDialog;
.super Lcom/tencent/open/b;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/open/c/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/PKDialog$1;,
        Lcom/tencent/open/PKDialog$OnTimeListener;,
        Lcom/tencent/open/PKDialog$THandler;,
        Lcom/tencent/open/PKDialog$FbWebViewClient;,
        Lcom/tencent/open/PKDialog$JsListener;
    }
.end annotation


# static fields
.field private static final MSG_CANCEL:I = 0x2

.field private static final MSG_COMPLETE:I = 0x1

.field private static final MSG_ON_LOAD:I = 0x4

.field private static final MSG_SHOW_PROCESS:I = 0x5

.field private static final MSG_SHOW_TIPS:I = 0x3

.field private static final TAG:Ljava/lang/String;

.field private static final WEBVIEW_HEIGHT:I = 0xb9

.field static sToast:Landroid/widget/Toast; = null


# instance fields
.field private listener:Lcom/tencent/tauth/IUiListener;

.field private mFlMain:Lcom/tencent/open/c/a;

.field private mHandler:Landroid/os/Handler;

.field private mListener:Lcom/tencent/open/PKDialog$OnTimeListener;

.field private mUrl:Ljava/lang/String;

.field private mWeakContext:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/content/Context;>;"
        }
    .end annotation
.end field

.field private mWebView:Lcom/tencent/open/c/b;

.field private mWebviewHeight:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 48
    const-class v0, Lcom/tencent/open/PKDialog;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/PKDialog;->TAG:Ljava/lang/String;

    .line 298
    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V
    .locals 6

    .line 74
    const v0, 0x1030010

    invoke-direct {p0, p1, v0}, Lcom/tencent/open/b;-><init>(Landroid/content/Context;I)V

    .line 75
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    .line 76
    iput-object p3, p0, Lcom/tencent/open/PKDialog;->mUrl:Ljava/lang/String;

    .line 77
    new-instance v0, Lcom/tencent/open/PKDialog$OnTimeListener;

    invoke-virtual {p5}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/tencent/open/PKDialog$OnTimeListener;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V

    iput-object v0, p0, Lcom/tencent/open/PKDialog;->mListener:Lcom/tencent/open/PKDialog$OnTimeListener;

    .line 78
    new-instance v0, Lcom/tencent/open/PKDialog$THandler;

    iget-object v1, p0, Lcom/tencent/open/PKDialog;->mListener:Lcom/tencent/open/PKDialog$OnTimeListener;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/tencent/open/PKDialog$THandler;-><init>(Lcom/tencent/open/PKDialog;Lcom/tencent/open/PKDialog$OnTimeListener;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/open/PKDialog;->mHandler:Landroid/os/Handler;

    .line 79
    iput-object p4, p0, Lcom/tencent/open/PKDialog;->listener:Lcom/tencent/tauth/IUiListener;

    .line 80
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x43390000    # 185.0f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I

    .line 81
    sget-object v0, Lcom/tencent/open/PKDialog;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "density="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; webviewHeight="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method static synthetic access$200(Lcom/tencent/open/PKDialog;)Landroid/os/Handler;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    .line 47
    sget-object v0, Lcom/tencent/open/PKDialog;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic access$500(Lcom/tencent/open/PKDialog;)Lcom/tencent/open/PKDialog$OnTimeListener;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mListener:Lcom/tencent/open/PKDialog$OnTimeListener;

    return-object v0
.end method

.method static synthetic access$600(Lcom/tencent/open/PKDialog;)Lcom/tencent/open/c/b;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    return-object v0
.end method

.method static synthetic access$800(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-static {p0, p1}, Lcom/tencent/open/PKDialog;->showTips(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$900(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-static {p0, p1}, Lcom/tencent/open/PKDialog;->showProcessDialog(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private createViews()V
    .locals 6

    .line 103
    new-instance v0, Lcom/tencent/open/c/a;

    iget-object v1, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tencent/open/c/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/c/a;

    .line 104
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/c/a;

    const/high16 v1, 0x66000000

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/a;->setBackgroundColor(I)V

    .line 105
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/c/a;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/a;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 108
    new-instance v0, Lcom/tencent/open/c/b;

    iget-object v1, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/tencent/open/c/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    .line 109
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setBackgroundColor(I)V

    .line 110
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 112
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 114
    :try_start_0
    const-class v0, Landroid/view/View;

    const-string v1, "setLayerType"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Landroid/graphics/Paint;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 115
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    goto :goto_0

    .line 116
    :catch_0
    move-exception v5

    .line 117
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    .line 121
    :cond_0
    :goto_0
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    iget v0, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I

    const/4 v1, -0x1

    invoke-direct {v5, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 124
    const/16 v0, 0xd

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 125
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0, v5}, Lcom/tencent/open/c/b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/c/a;

    iget-object v1, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/a;->addView(Landroid/view/View;)V

    .line 127
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/c/a;

    invoke-virtual {v0, p0}, Lcom/tencent/open/c/a;->a(Lcom/tencent/open/c/a$a;)V

    .line 128
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mFlMain:Lcom/tencent/open/c/a;

    invoke-virtual {p0, v0}, Lcom/tencent/open/PKDialog;->setContentView(Landroid/view/View;)V

    .line 130
    return-void
.end method

.method private initViews()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .line 137
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setVerticalScrollBarEnabled(Z)V

    .line 138
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setHorizontalScrollBarEnabled(Z)V

    .line 139
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    new-instance v1, Lcom/tencent/open/PKDialog$FbWebViewClient;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/tencent/open/PKDialog$FbWebViewClient;-><init>(Lcom/tencent/open/PKDialog;Lcom/tencent/open/PKDialog$1;)V

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 140
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    iget-object v1, p0, Lcom/tencent/open/PKDialog;->mChromeClient:Landroid/webkit/WebChromeClient;

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 141
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->clearFormData()V

    .line 144
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    .line 145
    if-nez v3, :cond_0

    .line 146
    return-void

    .line 148
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 149
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 151
    const/4 v0, -0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 154
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setNeedInitialFocus(Z)V

    .line 155
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 156
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 158
    sget-object v0, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V

    .line 159
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 161
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 162
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 163
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "databases"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 166
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 168
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->jsBridge:Lcom/tencent/open/a;

    new-instance v1, Lcom/tencent/open/PKDialog$JsListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/tencent/open/PKDialog$JsListener;-><init>(Lcom/tencent/open/PKDialog;Lcom/tencent/open/PKDialog$1;)V

    const-string v2, "sdk_js_if"

    invoke-virtual {v0, v1, v2}, Lcom/tencent/open/a;->a(Lcom/tencent/open/a$b;Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->clearView()V

    .line 171
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    iget-object v1, p0, Lcom/tencent/open/PKDialog;->mUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->loadUrl(Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 173
    return-void
.end method

.method private loadUrlWithBrowser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 375
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 376
    new-instance v0, Landroid/content/ComponentName;

    invoke-direct {v0, p1, p2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 377
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 378
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 379
    const/high16 v0, 0x10000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 381
    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 383
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 387
    :cond_0
    return-void
.end method

.method private static showProcessDialog(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 337
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 338
    :cond_0
    return-void

    .line 340
    :cond_1
    :try_start_0
    invoke-static {p1}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 341
    const-string v0, "action"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 342
    const-string v0, "msg"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 343
    .line 370
    goto :goto_0

    .line 367
    :catch_0
    move-exception v1

    .line 369
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 371
    :goto_0
    return-void
.end method

.method private static showTips(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 303
    :try_start_0
    invoke-static {p1}, Lcom/tencent/open/utils/Util;->parseJson(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 304
    const-string v0, "type"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 306
    const-string v0, "msg"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 308
    if-nez v3, :cond_1

    .line 309
    sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    if-nez v0, :cond_0

    .line 310
    const/4 v0, 0x0

    invoke-static {p0, v4, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    goto :goto_0

    .line 313
    :cond_0
    sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    sget-object v1, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 314
    sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    invoke-virtual {v0, v4}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 315
    sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V

    .line 317
    :goto_0
    sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_2

    .line 318
    :cond_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_3

    .line 319
    sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    if-nez v0, :cond_2

    .line 320
    const/4 v0, 0x1

    invoke-static {p0, v4, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    goto :goto_1

    .line 323
    :cond_2
    sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    sget-object v1, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    invoke-virtual {v1}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 324
    sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    invoke-virtual {v0, v4}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 325
    sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V

    .line 327
    :goto_1
    sget-object v0, Lcom/tencent/open/PKDialog;->sToast:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 332
    :cond_3
    :goto_2
    goto :goto_3

    .line 329
    :catch_0
    move-exception v2

    .line 331
    invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V

    .line 333
    :goto_3
    return-void
.end method


# virtual methods
.method public callJs(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 195
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0, v2}, Lcom/tencent/open/c/b;->loadUrl(Ljava/lang/String;)V

    .line 196
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 86
    invoke-super {p0}, Lcom/tencent/open/b;->onBackPressed()V

    .line 87
    return-void
.end method

.method protected onConsoleMessage(Ljava/lang/String;)V
    .locals 3

    .line 524
    const-string v0, "PKDialog"

    const-string v1, "--onConsoleMessage--"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->jsBridge:Lcom/tencent/open/a;

    iget-object v1, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0, v1, p1}, Lcom/tencent/open/a;->a(Landroid/webkit/WebView;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 529
    goto :goto_0

    .line 527
    :catch_0
    move-exception v2

    .line 530
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 92
    invoke-super {p0, p1}, Lcom/tencent/open/b;->onCreate(Landroid/os/Bundle;)V

    .line 93
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/tencent/open/PKDialog;->requestWindowFeature(I)Z

    .line 95
    invoke-virtual {p0}, Lcom/tencent/open/PKDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 96
    invoke-virtual {p0}, Lcom/tencent/open/PKDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 97
    invoke-direct {p0}, Lcom/tencent/open/PKDialog;->createViews()V

    .line 98
    invoke-direct {p0}, Lcom/tencent/open/PKDialog;->initViews()V

    .line 99
    return-void
.end method

.method public onKeyboardHidden()V
    .locals 2

    .line 518
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 519
    sget-object v0, Lcom/tencent/open/PKDialog;->TAG:Ljava/lang/String;

    const-string v1, "keyboard hide"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    return-void
.end method

.method public onKeyboardShown(I)V
    .locals 2

    .line 501
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 502
    iget v0, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWeakContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 505
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_0

    .line 507
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/PKDialog;->mWebView:Lcom/tencent/open/c/b;

    invoke-virtual {v0}, Lcom/tencent/open/c/b;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, p0, Lcom/tencent/open/PKDialog;->mWebviewHeight:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 510
    :cond_1
    :goto_0
    sget-object v0, Lcom/tencent/open/PKDialog;->TAG:Ljava/lang/String;

    const-string v1, "keyboard show"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    return-void
.end method
