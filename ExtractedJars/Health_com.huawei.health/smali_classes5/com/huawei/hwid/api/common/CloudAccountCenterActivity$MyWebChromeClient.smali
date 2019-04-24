.class Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MyWebChromeClient"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V
    .locals 0

    .line 269
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$1;)V
    .locals 0

    .line 269
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;-><init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    .line 272
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 273
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 274
    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 278
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0, p2}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Ljava/lang/String;)V

    .line 281
    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback<[Landroid/net/Uri;>;Landroid/webkit/WebChromeClient$FileChooserParams;)Z"
        }
    .end annotation

    .line 317
    const-string v0, "CloudActivity"

    const-string v1, "onShowFileChooser For Android > 5.0"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0, p2}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/webkit/ValueCallback;)Landroid/webkit/ValueCallback;

    .line 319
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 321
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    const-string v2, "hwid_string_not_support_split"

    invoke-static {v1, v2}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/l;->a(Landroid/content/Context;I)V

    .line 322
    if-eqz p2, :cond_0

    .line 324
    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Landroid/net/Uri;

    invoke-interface {p2, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 327
    goto :goto_0

    .line 325
    :catch_0
    move-exception v3

    .line 326
    const-string v0, "CloudActivity"

    const-string v1, "isInMultiWindowMode openFileChooser  e"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    :cond_0
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 331
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v1, p3}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/webkit/WebChromeClient$FileChooserParams;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 332
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    const/16 v1, 0x3ea

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;I)I

    .line 333
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    const/16 v1, 0x3ea

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 335
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    const/16 v1, 0x3ea

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;I)V

    .line 338
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public openFileChooser(Landroid/webkit/ValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;)V"
        }
    .end annotation

    .line 285
    const-string v0, "CloudActivity"

    const-string v1, "SuppressWarnings openFileChooser For Android < 3.0"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/webkit/ValueCallback;Ljava/lang/String;)V

    .line 288
    return-void
.end method

.method public openFileChooser(Landroid/webkit/ValueCallback;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 292
    const-string v0, "CloudActivity"

    const-string v1, "openFileChooser For Android 3.0+"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0, p2}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/webkit/ValueCallback;Ljava/lang/String;)V

    .line 295
    return-void
.end method

.method public openFileChooser(Landroid/webkit/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/webkit/ValueCallback<Landroid/net/Uri;>;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 299
    const-string v0, "CloudActivity"

    const-string v1, "openFileChooser For Android > 4.1"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0, p2}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 303
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    const-string v2, "hwid_string_not_support_split"

    invoke-static {v1, v2}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/l;->a(Landroid/content/Context;I)V

    .line 304
    if-eqz p1, :cond_0

    .line 306
    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 309
    goto :goto_0

    .line 307
    :catch_0
    move-exception v3

    .line 308
    const-string v0, "CloudActivity"

    const-string v1, "isInMultiWindowMode openFileChooser  e"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    :cond_0
    :goto_0
    return-void

    .line 313
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$MyWebChromeClient;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->c(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/webkit/ValueCallback;Ljava/lang/String;)V

    .line 314
    return-void
.end method
