.class public Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;
.super Landroid/app/Activity;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;,
        Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$e;,
        Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;,
        Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;,
        Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;
    }
.end annotation


# static fields
.field private static final B:I = 0x1001

.field private static final C:I = 0x12c

.field private static final b:Ljava/lang/String; = "MainWebviewActivity"

.field private static final c:I = 0x1

.field private static final d:I = 0x0


# instance fields
.field private A:Z

.field private D:Landroid/content/BroadcastReceiver;

.field a:Landroid/os/Handler;

.field private e:Landroid/webkit/WebView;

.field private f:Ljava/lang/String;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/ProgressBar;

.field private i:Landroid/widget/FrameLayout;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/view/View;

.field private m:Landroid/widget/Button;

.field private n:Landroid/app/ActionBar;

.field private o:I

.field private p:Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

.field private q:Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

.field private v:Lcom/huawei/hwCloudJs/api/IJsWebview;

.field private w:Ljava/lang/String;

.field private x:Z

.field private y:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;

.field private z:Landroid/support/v4/content/LocalBroadcastManager;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->f:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->o:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->x:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->A:Z

    new-instance v0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$3;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->D:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$4;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;I)I
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->o:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 7

    const/4 v4, 0x0

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :try_start_0
    invoke-static {}, Lcom/huawei/hwCloudJs/support/a/b;->a()Lcom/huawei/hwCloudJs/support/a/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwCloudJs/support/a/b;->c(Ljava/lang/String;)Lcom/huawei/hwCloudJs/support/a/a;

    move-result-object v5

    if-eqz v5, :cond_0

    const-string v0, "MainWebviewActivity"

    const-string v1, "cache != null"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v5}, Lcom/huawei/hwCloudJs/support/a/a;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    new-instance v0, Landroid/webkit/WebResourceResponse;

    const-string v1, "UTF-8"

    new-instance v2, Ljava/io/ByteArrayInputStream;

    const-string v3, "UTF-8"

    invoke-virtual {v6, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, p2, v1, v2}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "MainWebviewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IOException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-object v4
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    return-object v0
.end method

.method private a()V
    .locals 5

    invoke-static {}, Lcom/huawei/hwCloudJs/JsClientApi;->webViewUserAgentString()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/huawei/hwCloudJs/JsClientApi;->isneedoriginalUserAgent()Z

    move-result v3

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v4

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz v3, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private a(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    const-string v0, "MainWebviewActivity"

    const-string v1, "JS actionbar_start_icon Visible"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;

    invoke-direct {v1, p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$d;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static a(Landroid/webkit/WebView;)V
    .locals 1

    const-string v0, "accessibility"

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v0, "accessibilityTraversal"

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v0, "searchBoxJavaBridge_"

    invoke-virtual {p0, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n:Landroid/app/ActionBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->x:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsActionbar;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->w:Ljava/lang/String;

    return-object p1
.end method

.method private b()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {}, Lcom/huawei/hwCloudJs/JsClientApi;->webSettingsMixmode()I

    move-result v2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MainWebviewActivity"

    const-string v1, "titleColorid isEmpty"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n:Landroid/app/ActionBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {p0, p1}, Lcom/huawei/hwCloudJs/d/e;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "MainWebviewActivity"

    const-string v1, "Resources.NotFoundException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->f:Ljava/lang/String;

    return-object v0
.end method

.method private c()V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "JavascriptInterface"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/hwCloudJs/JsClientApi;->getjsInterfacemap()Ljava/util/HashMap;

    move-result-object v3

    const-string v0, "MainWebviewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JsClientApi.isUrlWhileList()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->t:Ljava/lang/String;

    invoke-static {v2}, Lcom/huawei/hwCloudJs/JsClientApi;->isUrlWhileList(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->t:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/JsClientApi;->isUrlWhileList(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Class;

    :try_start_0
    invoke-virtual {v6}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v7

    instance-of v0, v7, Lcom/huawei/hwCloudJs/api/WebviewObject;

    if-eqz v0, :cond_0

    move-object v8, v7

    check-cast v8, Lcom/huawei/hwCloudJs/api/WebviewObject;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-interface {v8, v0}, Lcom/huawei/hwCloudJs/api/WebviewObject;->setWebView(Landroid/webkit/WebView;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v7, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    move-exception v7

    const-string v0, "MainWebviewActivity"

    const-string v1, "Js addJsInterface InstantiationException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    move-exception v7

    const-string v0, "MainWebviewActivity"

    const-string v1, "Js addJsInterface IllegalAccessException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Ljava/lang/String;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private c(Ljava/lang/String;)Z
    .locals 4

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "MainWebviewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadPage, MalformedURLException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    return v0

    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->g:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private d()V
    .locals 3

    const-string v0, "webviewlay"

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->i:Landroid/widget/FrameLayout;

    const-string v0, "progressbar_hor"

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->h:Landroid/widget/ProgressBar;

    const-string v0, "webView"

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    const-string v0, "loading_progressbar"

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->g:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    const-string v0, "nonetLayout"

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->l:Landroid/view/View;

    const-string v0, "setNetBtn"

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->m:Landroid/widget/Button;

    const-string v0, "lay_nonet_fail"

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "MainWebviewActivity"

    const-string v1, "browser is null!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-eqz v2, :cond_1

    new-instance v0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$1;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->m:Landroid/widget/Button;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->m:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$2;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method

.method static synthetic e(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->h:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private e()V
    .locals 5

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->f()V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n:Landroid/app/ActionBar;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayShowCustomEnabled(Z)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n:Landroid/app/ActionBar;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayOptions(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n:Landroid/app/ActionBar;

    const-string v1, "jssdk_actionbar_layout"

    invoke-static {p0, v1}, Lcom/huawei/hwCloudJs/d/e;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setCustomView(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getCustomView()Landroid/view/View;

    move-result-object v2

    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    return-void

    :cond_1
    const-string v0, "back_to_homepage"

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k:Landroid/widget/ImageView;

    const-string v0, "actionbar_title_textview"

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/d/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    invoke-interface {v0}, Lcom/huawei/hwCloudJs/api/IJsActionbar;->isShow()Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    invoke-interface {v0}, Lcom/huawei/hwCloudJs/api/IJsActionbar;->textcolorID()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    invoke-interface {v0}, Lcom/huawei/hwCloudJs/api/IJsActionbar;->getStartIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    invoke-interface {v0}, Lcom/huawei/hwCloudJs/api/IJsActionbar;->getActionbarTitle()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->s:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->s:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->s:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Ljava/lang/String;)V

    :cond_4
    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->hide()V

    :cond_6
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->o:I

    return v0
.end method

.method private f()V
    .locals 4

    invoke-static {}, Lcom/huawei/hwCloudJs/JsClientApi;->getjsActionbarClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    instance-of v0, v3, Lcom/huawei/hwCloudJs/api/IJsActionbar;

    if-eqz v0, :cond_0

    move-object v0, v3

    check-cast v0, Lcom/huawei/hwCloudJs/api/IJsActionbar;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    invoke-interface {v0, p0}, Lcom/huawei/hwCloudJs/api/IJsActionbar;->setContext(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "MainWebviewActivity"

    const-string v1, "Js initJsActionbar InstantiationException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "MainWebviewActivity"

    const-string v1, "Js initJsActionbar IllegalAccessException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method private g()V
    .locals 4

    invoke-static {}, Lcom/huawei/hwCloudJs/JsClientApi;->getjsWebviewClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    instance-of v0, v3, Lcom/huawei/hwCloudJs/api/IJsWebview;

    if-eqz v0, :cond_0

    move-object v0, v3

    check-cast v0, Lcom/huawei/hwCloudJs/api/IJsWebview;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->v:Lcom/huawei/hwCloudJs/api/IJsWebview;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "MainWebviewActivity"

    const-string v1, "Js initJsWebview InstantiationException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "MainWebviewActivity"

    const-string v1, "Js initJsWebview IllegalAccessException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->x:Z

    return v0
.end method

.method static synthetic h(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->r:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->s:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->p:Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->i:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->l:Landroid/view/View;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/IJsWebview;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->v:Lcom/huawei/hwCloudJs/api/IJsWebview;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->w:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    const-string v0, "MainWebviewActivity"

    const-string v1, "onActivityResult..."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->p:Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->p:Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    invoke-static {p1, p2, p3}, Lcom/huawei/hwCloudJs/JsClientApi;->handleActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->o:I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MainWebviewActivity"

    const-string v1, "goBack"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "jssdk_webmain"

    invoke-static {p0, v0}, Lcom/huawei/hwCloudJs/d/e;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->setContentView(I)V

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->t:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "urlTitle"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->r:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->t:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "MainWebviewActivity"

    const-string v1, "url invalid!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->finish()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d()V

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->g()V

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->n:Landroid/app/ActionBar;

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e()V

    invoke-static {}, Lcom/huawei/hwCloudJs/JsClientApi;->webviewFileChooserListenner()Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->p:Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    invoke-static {}, Lcom/huawei/hwCloudJs/JsClientApi;->webViewDownLoadListener()Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->q:Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Landroid/webkit/WebView;)V

    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a()V

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->b()V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->requestFocus()Z

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$b;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->q:Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->q:Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;->setContext(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->q:Lcom/huawei/hwCloudJs/api/WebviewDownloadListenner;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$e;

    invoke-direct {v1, p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$e;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/JsClientApi;->createApi(Landroid/webkit/WebView;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->f:Ljava/lang/String;

    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->D:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->A:Z

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->d()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->z:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->z:Landroid/support/v4/content/LocalBroadcastManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "com.huawei.jssdk.finishAll"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->y:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->z:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->y:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;

    invoke-virtual {v0, v1, v5}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    :cond_3
    invoke-direct {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->c()V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->r:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->r:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 6

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    move-object v1, p0

    iget-object v2, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    iget-object v3, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->w:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->k:Landroid/widget/ImageView;

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lcom/huawei/hwCloudJs/api/IJsActionbar;->setControlIcon(Landroid/content/Context;Landroid/webkit/WebView;Ljava/lang/String;Landroid/view/View;Landroid/view/Menu;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->f:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/JsClientApi;->destroyApi(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->o:I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->D:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->A:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->D:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->z:Landroid/support/v4/content/LocalBroadcastManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->y:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->z:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->y:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$c;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->i:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->i:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->removeAllViews()V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e:Landroid/webkit/WebView;

    :cond_3
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->u:Lcom/huawei/hwCloudJs/api/IJsActionbar;

    invoke-interface {v0, p2}, Lcom/huawei/hwCloudJs/api/IJsActionbar;->handleOptionsItemSelected(Landroid/view/MenuItem;)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->finish()V

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method protected onPause()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->f:Ljava/lang/String;

    new-instance v1, Lcom/huawei/hwCloudJs/service/jsapi/OnHideMsg;

    invoke-direct {v1}, Lcom/huawei/hwCloudJs/service/jsapi/OnHideMsg;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/JsClientApi;->notifyNativeMsgToBridge(Ljava/lang/String;Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)V

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const-string v0, "MainWebviewActivity"

    const-string v1, "onRequestPermissionsResult..."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1, p2, p3}, Lcom/huawei/hwCloudJs/JsClientApi;->handleActivityPermissionResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method protected onResume()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->f:Ljava/lang/String;

    new-instance v1, Lcom/huawei/hwCloudJs/service/jsapi/OnShowMsg;

    invoke-direct {v1}, Lcom/huawei/hwCloudJs/service/jsapi/OnShowMsg;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/JsClientApi;->notifyNativeMsgToBridge(Ljava/lang/String;Lcom/huawei/hwCloudJs/service/jsmsg/NativeMsg;)V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    return-void
.end method
