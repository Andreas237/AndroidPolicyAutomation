.class public Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;
.super Ljava/lang/Object;
.source "ButtonJavascriptInterface.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;,
        Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$DecodeAsyncTask;
    }
.end annotation


# static fields
.field static final BTN_SDK_JS_FILENAME:Ljava/lang/String; = "btnsdk.js"

.field static final INJECTED_OBJECT:Ljava/lang/String; = "ButtonSdk"

.field static final NAV_JS_FILENAME:Ljava/lang/String; = "nav.js"

.field private static final TAG:Ljava/lang/String; = "ButtonJavascriptInterface"


# instance fields
.field private lastUrl:Ljava/lang/String;

.field private listener:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;

.field private final navigator:Lcom/usebutton/sdk/internal/web/Navigator;

.field private final webView:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;Landroid/webkit/WebView;Lcom/usebutton/sdk/internal/web/Navigator;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 29
    iput-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->lastUrl:Ljava/lang/String;

    .line 56
    iput-object p2, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->webView:Landroid/webkit/WebView;

    .line 57
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->listener:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;

    .line 58
    iput-object p3, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->navigator:Lcom/usebutton/sdk/internal/web/Navigator;

    const-string p1, "ButtonSdk"

    .line 60
    invoke-virtual {p2, p0, p1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)Landroid/webkit/WebView;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->webView:Landroid/webkit/WebView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->listener:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)Lcom/usebutton/sdk/internal/web/Navigator;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->navigator:Lcom/usebutton/sdk/internal/web/Navigator;

    return-object p0
.end method


# virtual methods
.method public fillFields(Lorg/json/JSONObject;)V
    .locals 3

    const-string v0, "btnsdk.fillFields(%s)"

    const/4 v1, 0x1

    .line 155
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 157
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$3;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$3;-><init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public getDom(Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;)V
    .locals 3

    const-string v0, "(function() { return encodeURI(document.documentElement.outerHTML); })();"

    .line 188
    iget-object v1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->webView:Landroid/webkit/WebView;

    new-instance v2, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$5;

    invoke-direct {v2, p0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$5;-><init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;Lcom/usebutton/sdk/purchasepath/BrowserPage$DomResultListener;)V

    invoke-virtual {v1, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public loadBtnSdkJs(Landroid/content/Context;)V
    .locals 2

    .line 136
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string v0, "btnsdk.js"

    invoke-virtual {p1, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->streamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1

    .line 138
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$2;-><init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 150
    sget-object v0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->TAG:Ljava/lang/String;

    const-string v1, "Error loading btnsdk.js"

    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public loadNavJs(Landroid/content/Context;)V
    .locals 3

    .line 123
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string v0, "nav.js"

    invoke-virtual {p1, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->streamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 125
    sget-object v0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->TAG:Ljava/lang/String;

    const-string v1, "Error loading navigation JS"

    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_0

    .line 129
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->webView:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public observeFields(Lorg/json/JSONObject;)V
    .locals 3

    const-string v0, "btnsdk.observeFields(%s)"

    const/4 v1, 0x1

    .line 166
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 168
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$4;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$4;-><init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V

    invoke-virtual {v0, p1, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public onAutofillFieldsDetected(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 98
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 99
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->listener:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;->onAutofillFieldsDetected(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 101
    sget-object v0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->TAG:Ljava/lang/String;

    const-string v1, "Error parsing autofill json"

    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onAutofillFieldsNotDetected(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 107
    iget-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->listener:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;->onAutofillFieldsNotDetected()V

    return-void
.end method

.method public onAutofillFormSubmitted(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 113
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 114
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->listener:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;->onAutofillFormSubmitted(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 116
    sget-object v0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->TAG:Ljava/lang/String;

    const-string v1, "Could not parse submitted form fields"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onNavigation()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$1;

    invoke-direct {v1, p0}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$1;-><init>(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onPageFinished(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_4

    .line 82
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "about:blank"

    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->lastUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 90
    :cond_2
    sget-object v0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->TAG:Ljava/lang/String;

    const-string v1, "onPageFinishedJs %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->listener:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;

    invoke-interface {v0, p1}, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;->onPageFinishedJs(Ljava/lang/String;)V

    .line 92
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->lastUrl:Ljava/lang/String;

    return-void

    :cond_3
    :goto_0
    return-void

    :cond_4
    :goto_1
    return-void
.end method

.method public setListener(Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 201
    iput-object p1, p0, Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface;->listener:Lcom/usebutton/sdk/internal/web/ButtonJavascriptInterface$Listener;

    return-void
.end method
