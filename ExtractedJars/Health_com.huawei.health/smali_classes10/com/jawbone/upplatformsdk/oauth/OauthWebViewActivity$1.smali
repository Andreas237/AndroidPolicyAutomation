.class Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity$1;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;


# direct methods
.method constructor <init>(Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity$1;->this$0:Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 6

    .line 57
    const-string v3, "&code="

    .line 60
    invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 62
    const-string v0, "http://localhost/huaweiwear?"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 66
    :cond_0
    const/4 v0, -0x1

    if-le v4, v0, :cond_1

    .line 69
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity$1;->this$0:Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v4

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->access$002(Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 73
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity$1;->this$0:Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;

    invoke-virtual {v0}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 74
    const-string v0, "code"

    iget-object v1, p0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity$1;->this$0:Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;

    invoke-static {v1}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->access$000(Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity$1;->this$0:Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v5}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->setResult(ILandroid/content/Intent;)V

    .line 76
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity$1;->this$0:Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;

    invoke-virtual {v0}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->finish()V

    .line 79
    :cond_1
    const-string v0, "http://localhost/huaweiwear?&error=access_denied"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 80
    iget-object v0, p0, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity$1;->this$0:Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;

    invoke-virtual {v0}, Lcom/jawbone/upplatformsdk/oauth/OauthWebViewActivity;->finish()V

    .line 82
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 83
    return-void
.end method
