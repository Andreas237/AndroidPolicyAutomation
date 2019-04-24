.class Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/utils/CasLoginManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MyLoginWebViewClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/utils/CasLoginManager;


# direct methods
.method private constructor <init>(Lcom/huawei/operation/utils/CasLoginManager;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/operation/utils/CasLoginManager;Lcom/huawei/operation/utils/CasLoginManager$1;)V
    .locals 0

    .line 251
    invoke-direct {p0, p1}, Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;-><init>(Lcom/huawei/operation/utils/CasLoginManager;)V

    return-void
.end method


# virtual methods
.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 300
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 301
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 5

    .line 281
    const-string v0, "https://hwid1.vmall.com/CAS/stRemoteLogin"

    invoke-static {p2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 282
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-static {v2}, Lcom/huawei/operation/utils/CasLoginManager;->access$300(Lcom/huawei/operation/utils/CasLoginManager;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 283
    const-string v0, "CasLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6d41\u63a7"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 285
    return-void

    .line 287
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/operation/utils/CasLoginManager;->access$302(Lcom/huawei/operation/utils/CasLoginManager;J)J

    .line 289
    :cond_1
    invoke-static {}, Lcom/huawei/operation/utils/CasLoginUtil;->getAutoLoginUrl()Ljava/lang/String;

    move-result-object v4

    .line 290
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-static {v0}, Lcom/huawei/operation/utils/CasLoginManager;->access$400(Lcom/huawei/operation/utils/CasLoginManager;)Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 291
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-static {v0}, Lcom/huawei/operation/utils/CasLoginManager;->access$400(Lcom/huawei/operation/utils/CasLoginManager;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 293
    :cond_2
    const-string v0, "javascript:window.java_obj.showSource(document.getElementsByTagName(\'pre\')[0].innerHTML);"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 295
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 296
    return-void
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 9

    .line 306
    const-string v0, "https://cart.vmall.com/newcart/cache2cart.json"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 307
    const/4 v4, 0x0

    .line 309
    :try_start_0
    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 310
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/net/HttpURLConnection;

    .line 311
    const-string v0, "GET"

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 312
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->connect()V

    .line 313
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 314
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    .line 315
    const-string v0, "CasLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "https://cart.vmall.com\u8bf7\u6c42\u6210\u529f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-static {v0}, Lcom/huawei/operation/utils/CasLoginManager;->access$200(Lcom/huawei/operation/utils/CasLoginManager;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 317
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$MyLoginWebViewClient;->this$0:Lcom/huawei/operation/utils/CasLoginManager;

    invoke-static {v0}, Lcom/huawei/operation/utils/CasLoginManager;->access$200(Lcom/huawei/operation/utils/CasLoginManager;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    :cond_0
    if-eqz v4, :cond_2

    .line 328
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 331
    goto :goto_1

    .line 329
    :catch_0
    move-exception v5

    .line 330
    const-string v0, "CasLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close inputStream fail,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    goto :goto_1

    .line 323
    :catch_1
    move-exception v5

    .line 324
    const-string v0, "CasLoginManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 326
    if-eqz v4, :cond_2

    .line 328
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 331
    goto :goto_1

    .line 329
    :catch_2
    move-exception v5

    .line 330
    const-string v0, "CasLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close inputStream fail,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    goto :goto_1

    .line 326
    :catchall_0
    move-exception v7

    if-eqz v4, :cond_1

    .line 328
    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 331
    goto :goto_0

    .line 329
    :catch_3
    move-exception v8

    .line 330
    const-string v0, "CasLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close inputStream fail,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    :cond_1
    :goto_0
    throw v7

    .line 335
    :cond_2
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v0

    return-object v0
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    .line 274
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
