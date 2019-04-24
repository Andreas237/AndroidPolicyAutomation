.class Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;->d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$2;)V
    .locals 0

    .line 302
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;-><init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V

    return-void
.end method


# virtual methods
.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0

    .line 343
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 344
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;->d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->i(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 330
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 331
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;->d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->i(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;->d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->d(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V

    .line 323
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 324
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;->d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->h(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V

    .line 337
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 338
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 3

    .line 307
    const-string v0, "mailto"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 309
    new-instance v2, Landroid/content/Intent;

    const-string v0, "android.intent.action.SENDTO"

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$a;->d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->a(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 311
    const/4 v0, 0x1

    return v0

    .line 313
    :cond_0
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 314
    const/4 v0, 0x1

    return v0
.end method
