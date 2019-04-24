.class Lcom/huawei/ui/commonui/webview/WebViewActivity$a;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/webview/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/commonui/webview/WebViewActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V
    .locals 0

    .line 563
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$a;->e:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;Lcom/huawei/ui/commonui/webview/WebViewActivity$5;)V
    .locals 0

    .line 563
    invoke-direct {p0, p1}, Lcom/huawei/ui/commonui/webview/WebViewActivity$a;-><init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V

    return-void
.end method


# virtual methods
.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 1

    .line 594
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z

    move-result v0

    return v0
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    .line 566
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$a;->e:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->i(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 568
    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 4

    .line 572
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$a;->e:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-virtual {v0, p2}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b(Ljava/lang/String;)V

    .line 574
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$a;->e:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->a(Lcom/huawei/ui/commonui/webview/WebViewActivity;)I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 575
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 576
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "title: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "http://"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "huaweischeme://"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 578
    :cond_0
    return-void

    .line 580
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$a;->e:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    iget-object v0, v0, Lcom/huawei/ui/commonui/webview/WebViewActivity;->c:Lo/emr;

    invoke-virtual {v0, p2}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 583
    :cond_2
    return-void
.end method

.method public onReceivedTouchIconUrl(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0

    .line 588
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebChromeClient;->onReceivedTouchIconUrl(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 589
    return-void
.end method
