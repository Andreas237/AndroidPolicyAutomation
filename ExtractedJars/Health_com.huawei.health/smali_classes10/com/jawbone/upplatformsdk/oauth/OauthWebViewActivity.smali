.class public Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private accessCode:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    const-class v0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;)Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->accessCode:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->accessCode:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 35
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 36
    invoke-virtual {p0}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    .line 38
    sget v0, Lcom/huawei/hwthirdlib/R$layout;->oauth_webview:I

    invoke-virtual {p0, v0}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->setContentView(I)V

    .line 40
    invoke-virtual {p0}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 41
    const-string v0, "auth_uri"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/net/Uri;

    .line 44
    if-nez v3, :cond_0

    .line 45
    invoke-virtual {p0}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->finish()V

    .line 46
    return-void

    .line 50
    :cond_0
    sget v0, Lcom/huawei/hwthirdlib/R$id;->webview:I

    invoke-virtual {p0, v0}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/webkit/WebView;

    .line 51
    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 52
    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 53
    invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 55
    new-instance v0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity$1;

    invoke-direct {v0, p0}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity$1;-><init>(Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;)V

    invoke-virtual {v4, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 86
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://jawbone.com/auth/oauth2/auth"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 87
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 90
    :cond_1
    return-void
.end method
