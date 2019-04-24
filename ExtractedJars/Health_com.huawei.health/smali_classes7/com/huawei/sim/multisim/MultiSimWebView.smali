.class public Lcom/huawei/sim/multisim/MultiSimWebView;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Landroid/webkit/WebView;

.field public d:Landroid/content/Context;

.field e:Ljava/lang/String;

.field private f:Z

.field g:Ljava/lang/String;

.field private h:Landroid/widget/ProgressBar;

.field private i:Lo/ecx;

.field private k:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 87
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->b:Ljava/lang/String;

    .line 88
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->e:Ljava/lang/String;

    .line 89
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->a:Ljava/lang/String;

    .line 90
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->g:Ljava/lang/String;

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->f:Z

    .line 99
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "https://yihaoduozhongduan.com:8088/yhdzd/yhdzdLogin"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "https://yihaoduozhongduan.com:8088/yhdzd/"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "https://zdnlpz.yhdzd.chinamobile.com:9191"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "https://esim.yhdzd.chinamobile.com:8015 "

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "https://open.10086.cn/websheet/signup"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->k:[Ljava/lang/String;

    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/multisim/MultiSimWebView;)Landroid/widget/ProgressBar;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->h:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 220
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->c:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/sim/multisim/MultiSimWebView$3;

    invoke-direct {v1, p0}, Lcom/huawei/sim/multisim/MultiSimWebView$3;-><init>(Lcom/huawei/sim/multisim/MultiSimWebView;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 412
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->c:Landroid/webkit/WebView;

    new-instance v1, Lcom/huawei/sim/multisim/MultiSimWebView$4;

    invoke-direct {v1, p0}, Lcom/huawei/sim/multisim/MultiSimWebView$4;-><init>(Lcom/huawei/sim/multisim/MultiSimWebView;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 420
    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 8

    .line 180
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 182
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {p1, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v4

    .line 184
    const-string v0, "[<>]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    .line 185
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 186
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    const-string v0, "MultiSimWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " multisim url is illegal..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 190
    :cond_0
    const-string v0, "MultiSimWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "multisim url is correct..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->k:[Ljava/lang/String;

    array-length v0, v0

    if-ge v7, v0, :cond_2

    .line 192
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->k:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 193
    const/4 v0, 0x1

    return v0

    .line 191
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 198
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 166
    invoke-direct {p0, p1}, Lcom/huawei/sim/multisim/MultiSimWebView;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/sim/multisim/MultiSimWebView;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 169
    :cond_0
    const-string v0, "MultiSimWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===www===This url is illegal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    :goto_0
    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 424
    const-string v0, "MultiSimWebView"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadUrl type="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " url="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", postData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    const-string v0, "WS"

    :try_start_0
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 429
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 430
    const-string v0, "carrierPostData"

    invoke-virtual {v4, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 431
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    .line 432
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->c:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "?param="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "utf-8"

    invoke-static {v5, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 433
    goto :goto_0

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->c:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "?carrierPostData="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "utf-8"

    invoke-static {p2, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 441
    :goto_0
    goto :goto_1

    .line 437
    :catch_0
    move-exception v4

    .line 438
    const-string v0, "MultiSimWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    goto :goto_1

    .line 439
    :catch_1
    move-exception v4

    .line 440
    const-string v0, "MultiSimWebView"

    const-string v1, "UnsupportedEncodingException"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 442
    :goto_1
    return-void
.end method

.method public dataPlanAccountUpdatedWithInfo(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 213
    const-string v0, "MultiSimWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->f:Z

    .line 215
    return-void
.end method

.method public doneSelected()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 203
    const-string v0, "MultiSimWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doneSelected, url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iget-boolean v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->f:Z

    if-eqz v0, :cond_0

    .line 205
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimWebView;->setResult(I)V

    .line 207
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimWebView;->finish()V

    .line 208
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 109
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 111
    const-string v0, "MultiSimWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iput-object p0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->d:Landroid/content/Context;

    .line 114
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->i:Lo/ecx;

    .line 115
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->i:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 116
    const-string v0, "MultiSimWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimWebView;->finish()V

    .line 119
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimWebView;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 120
    const-string v0, "url"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->b:Ljava/lang/String;

    .line 122
    const-string v0, "post_data"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->a:Ljava/lang/String;

    .line 123
    const-string v0, "req_type"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->g:Ljava/lang/String;

    .line 124
    const-string v0, "MultiSimWebView"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate type="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->g:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " url="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " postData="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    sget v0, Lcom/huawei/sim/R$layout;->activity_multi_sim_web_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimWebView;->setContentView(I)V

    .line 127
    sget v0, Lcom/huawei/sim/R$id;->load_url_progress:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->h:Landroid/widget/ProgressBar;

    .line 128
    sget v0, Lcom/huawei/sim/R$id;->web_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimWebView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->c:Landroid/webkit/WebView;

    .line 129
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->c:Landroid/webkit/WebView;

    const/4 v0, 0x1

    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 130
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    .line 131
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 132
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 133
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 134
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 135
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 137
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 138
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    .line 139
    sget-object v0, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->c:Landroid/webkit/WebView;

    const-string v1, "DataActivationController"

    invoke-virtual {v0, p0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimWebView;->d()V

    .line 146
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->c:Landroid/webkit/WebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->c:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->requestFocus()Z

    .line 148
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimWebView;->setResult(I)V

    .line 159
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimWebView;->g:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/sim/multisim/MultiSimWebView;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    return-void
.end method
