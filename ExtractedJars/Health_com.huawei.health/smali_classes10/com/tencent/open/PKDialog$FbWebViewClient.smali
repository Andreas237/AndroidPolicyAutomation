.class Lcom/tencent/open/PKDialog$FbWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/PKDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "FbWebViewClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/open/PKDialog;


# direct methods
.method private constructor <init>(Lcom/tencent/open/PKDialog;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tencent/open/PKDialog;Lcom/tencent/open/PKDialog$1;)V
    .locals 0

    .line 229
    invoke-direct {p0, p1}, Lcom/tencent/open/PKDialog$FbWebViewClient;-><init>(Lcom/tencent/open/PKDialog;)V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 279
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 284
    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$600(Lcom/tencent/open/PKDialog;)Lcom/tencent/open/c/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/open/c/b;->setVisibility(I)V

    .line 285
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 269
    invoke-static {}, Lcom/tencent/open/PKDialog;->access$300()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Webview loading URL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/utils/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 275
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 254
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 255
    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$500(Lcom/tencent/open/PKDialog;)Lcom/tencent/open/PKDialog$OnTimeListener;

    move-result-object v0

    new-instance v1, Lcom/tencent/tauth/UiError;

    invoke-direct {v1, p2, p3, p4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/tencent/open/PKDialog$OnTimeListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 260
    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-string v1, "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38\u6216\u7cfb\u7edf\u9519\u8bef"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-virtual {v0}, Lcom/tencent/open/PKDialog;->dismiss()V

    .line 265
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 3

    .line 233
    invoke-static {}, Lcom/tencent/open/PKDialog;->access$300()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Redirect URL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/utils/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    invoke-static {}, Lcom/tencent/open/utils/ServerSetting;->getInstance()Lcom/tencent/open/utils/ServerSetting;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v1}, Lcom/tencent/open/PKDialog;->access$400(Lcom/tencent/open/PKDialog;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-string v2, "auth://tauth.qq.com/"

    invoke-virtual {v0, v1, v2}, Lcom/tencent/open/utils/ServerSetting;->getEnvUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$500(Lcom/tencent/open/PKDialog;)Lcom/tencent/open/PKDialog$OnTimeListener;

    move-result-object v0

    invoke-static {p2}, Lcom/tencent/open/utils/Util;->parseUrlToJson(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/open/PKDialog$OnTimeListener;->onComplete(Ljava/lang/Object;)V

    .line 237
    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-virtual {v0}, Lcom/tencent/open/PKDialog;->dismiss()V

    .line 238
    const/4 v0, 0x1

    return v0

    .line 239
    :cond_0
    const-string v0, "auth://cancel"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-static {v0}, Lcom/tencent/open/PKDialog;->access$500(Lcom/tencent/open/PKDialog;)Lcom/tencent/open/PKDialog$OnTimeListener;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/open/PKDialog$OnTimeListener;->onCancel()V

    .line 241
    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-virtual {v0}, Lcom/tencent/open/PKDialog;->dismiss()V

    .line 242
    const/4 v0, 0x1

    return v0

    .line 243
    :cond_1
    const-string v0, "auth://close"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 245
    iget-object v0, p0, Lcom/tencent/open/PKDialog$FbWebViewClient;->this$0:Lcom/tencent/open/PKDialog;

    invoke-virtual {v0}, Lcom/tencent/open/PKDialog;->dismiss()V

    .line 246
    const/4 v0, 0x1

    return v0

    .line 248
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
