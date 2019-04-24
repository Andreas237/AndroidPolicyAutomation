.class Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;
.super Landroid/webkit/WebChromeClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;-><init>(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)V

    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Landroid/util/Patterns;->WEB_URL:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V

    const/4 v0, 0x1

    return v0
.end method

.method public onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsBeforeUnload(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V

    const/4 v0, 0x1

    return v0
.end method

.method public onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V

    const/4 v0, 0x1

    return v0
.end method

.method public onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super/range {p0 .. p5}, Landroid/webkit/WebChromeClient;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p5}, Landroid/webkit/JsPromptResult;->cancel()V

    const/4 v0, 0x1

    return v0
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->d(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->e(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v4

    const-string v0, "MainWebviewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onProgressChanged"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->f(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "newProgress"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->g(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->f(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/16 v0, 0x50

    if-lt p2, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->g(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "MainWebviewActivity"

    const-string v1, "onProgressChanged done"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Z)Z

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    iget-object v0, v0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a:Landroid/os/Handler;

    const/16 v1, 0x1001

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_2
    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "MainWebviewActivity"

    const-string v1, "onReceivedTitle isEmpty isUrl"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->h(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->i(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "MainWebviewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onReceivedTitle set done"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0, p2}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->a(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback<[Landroid/net/Uri;>;Landroid/webkit/WebChromeClient$FileChooserParams;)Z"
        }
    .end annotation

    const-string v0, "MainWebviewActivity"

    const-string v1, "onShowFileChooser"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;->onShowFileChooser(Landroid/app/Activity;Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z

    move-result v0

    return v0
.end method

.method public openFileChooser(Landroid/webkit/ValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;)V"
        }
    .end annotation

    const-string v0, "MainWebviewActivity"

    const-string v1, "openFileChooser"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-interface {v0, v1, p1}, Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;->openFileChooser(Landroid/app/Activity;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public openFileChooser(Landroid/webkit/ValueCallback;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;Ljava/lang/String;)V"
        }
    .end annotation

    const-string v0, "MainWebviewActivity"

    const-string v1, "openFileChooser2"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-interface {v0, v1, p1, p2}, Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;->openFileChooser(Landroid/app/Activity;Landroid/webkit/ValueCallback;Ljava/lang/String;)V

    return-void
.end method

.method public openFileChooser(Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    const-string v0, "MainWebviewActivity"

    const-string v1, "openFileChooser3"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;->j(Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;)Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity$a;->a:Lcom/huawei/hwCloudJs/core/webview/MainWebviewActivity;

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/huawei/hwCloudJs/api/WebviewFileChooserListenner;->openFileChooser(Landroid/app/Activity;Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
