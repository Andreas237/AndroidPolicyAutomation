.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$c;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 0

    .line 772
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$c;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;)V
    .locals 0

    .line 772
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$c;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    .line 777
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 778
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$c;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->f(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 779
    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 784
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 785
    const-string v0, "about:blank"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$c;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->n(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 788
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$c;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0, p2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->c(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)V

    .line 789
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$c;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0, p2}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->d(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 791
    :cond_0
    return-void
.end method
