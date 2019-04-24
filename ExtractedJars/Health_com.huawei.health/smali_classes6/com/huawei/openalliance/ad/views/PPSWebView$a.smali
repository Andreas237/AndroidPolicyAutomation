.class Lcom/huawei/openalliance/ad/views/PPSWebView$a;
.super Landroid/webkit/WebChromeClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/PPSWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/PPSWebView;


# direct methods
.method private constructor <init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/openalliance/ad/views/PPSWebView;Lcom/huawei/openalliance/ad/views/PPSWebView$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/PPSWebView$a;-><init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->d(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/views/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const/16 v0, 0x64

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->d(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/views/b;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/b;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->d(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/views/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/b;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->d(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/views/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/b;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->d(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/views/b;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/openalliance/ad/views/b;->setProgress(I)V

    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_detail:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const-string v0, "about:blank"

    invoke-static {p2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p2, " "

    :cond_1
    :goto_0
    const/4 v2, 0x0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->e(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->e(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->isShowPageTitle()Z

    move-result v2

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->f(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/views/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->f(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/views/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/openalliance/ad/views/a;->setTitle(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->f(Lcom/huawei/openalliance/ad/views/PPSWebView;)Lcom/huawei/openalliance/ad/views/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/openalliance/ad/views/a;->a(Z)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->g(Lcom/huawei/openalliance/ad/views/PPSWebView;)Landroid/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$a;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->g(Lcom/huawei/openalliance/ad/views/PPSWebView;)Landroid/app/ActionBar;

    move-result-object v0

    if-eqz v2, :cond_4

    move-object v1, p2

    goto :goto_1

    :cond_4
    const-string v1, " "

    :goto_1
    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_2
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method
