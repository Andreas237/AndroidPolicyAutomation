.class public Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "SKWebView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/webview/SKWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SKWebViewClient"
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "SKWebView"


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/webview/SKWebView;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/webview/SKWebView;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0

    .line 561
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 563
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$700(Lcom/shopkick/app/webview/SKWebView;)V

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 568
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    const/16 v0, 0x3fb

    .line 574
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    const/16 v0, 0x402

    .line 575
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    const/16 v0, 0x400

    .line 576
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    const/16 v0, 0x3ff

    .line 577
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    .line 580
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/webview/SKWebView;->access$900(Lcom/shopkick/app/webview/SKWebView;Z)V

    .line 581
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$800(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewStatusCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 582
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$800(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewStatusCallback;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/shopkick/app/webview/IWebViewStatusCallback;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 550
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 552
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$700(Lcom/shopkick/app/webview/SKWebView;)V

    .line 554
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$800(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewStatusCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 555
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$800(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewStatusCallback;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/shopkick/app/webview/IWebViewStatusCallback;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 588
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x3fb

    .line 597
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    const/16 v0, 0x402

    .line 598
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    const/16 v0, 0x400

    .line 599
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    const/16 v0, 0x3ff

    .line 600
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    .line 603
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/webview/SKWebView;->access$900(Lcom/shopkick/app/webview/SKWebView;Z)V

    .line 604
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$800(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewStatusCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 605
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$800(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewStatusCallback;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/shopkick/app/webview/IWebViewStatusCallback;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 5

    .line 613
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "SSL Error detected. ToString = %s\n\n Error code: %d. Certificate: %s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    .line 614
    invoke-virtual {p3}, Landroid/net/http/SslError;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p3}, Landroid/net/http/SslError;->getCertificate()Landroid/net/http/SslCertificate;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/http/SslCertificate;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    .line 613
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 615
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v1

    const-string v2, "SKWebView"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    new-instance v1, Ljavax/net/ssl/SSLException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\nDuplicated"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 618
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p2, :cond_8

    .line 440
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 442
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "sk"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 443
    invoke-static {p2}, Lcom/shopkick/app/url/URLDispatcher;->getUriKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v4, "webview_action"

    .line 445
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v2}, Lcom/shopkick/app/webview/SKWebView;->access$400(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v3

    .line 450
    :cond_0
    invoke-static {v1}, Lcom/shopkick/app/url/URLDispatcher;->convertAppContextLink(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 451
    iget-object v4, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v4}, Lcom/shopkick/app/webview/SKWebView;->access$400(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v3

    .line 456
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v2}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v2, "mailto:"

    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 457
    invoke-static {p2}, Landroid/net/MailTo;->parse(Ljava/lang/String;)Landroid/net/MailTo;

    move-result-object p1

    .line 458
    new-instance p2, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.extra.EMAIL"

    .line 459
    new-array v2, v3, [Ljava/lang/String;

    invoke-virtual {p1}, Landroid/net/MailTo;->getTo()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v0

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.extra.SUBJECT"

    .line 460
    invoke-virtual {p1}, Landroid/net/MailTo;->getSubject()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.extra.CC"

    .line 461
    invoke-virtual {p1}, Landroid/net/MailTo;->getCc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.extra.TEXT"

    .line 462
    invoke-virtual {p1}, Landroid/net/MailTo;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "message/rfc822"

    .line 463
    invoke-virtual {p2, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 464
    iget-object p1, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {p1}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object p1

    const v0, 0x7f110280

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 465
    iget-object v0, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v0}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {p2, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return v3

    .line 470
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v2}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v2, ".mp4"

    invoke-virtual {p2, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 471
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string/jumbo v4, "video/*"

    .line 472
    invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 473
    iget-object v4, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v4}, Lcom/shopkick/app/webview/SKWebView;->access$500(Lcom/shopkick/app/webview/SKWebView;)Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_3
    const-string v2, "intent://"

    .line 478
    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 480
    :try_start_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 481
    invoke-static {p2, v3}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 484
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 486
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    const/high16 v6, 0x10000

    .line 487
    invoke-virtual {v5, v4, v6}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 489
    invoke-virtual {v2, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 491
    :cond_4
    new-instance v5, Landroid/content/Intent;

    const-string v6, "android.intent.action.VIEW"

    invoke-virtual {v4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v5, v6, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_1

    .line 493
    :try_start_1
    invoke-virtual {v2, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_0
    :goto_0
    return v3

    :catch_1
    :cond_5
    const-string v2, "market://"

    .line 512
    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 514
    :try_start_2
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 515
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v2, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 516
    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object p2

    check-cast p2, Landroid/app/Activity;

    .line 517
    invoke-virtual {p2, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    return v3

    .line 521
    :catch_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "http://play.google.com/store/apps/"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "?"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return v0

    .line 527
    :cond_6
    iget-object v2, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v2}, Lcom/shopkick/app/webview/SKWebView;->access$600(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 528
    iget-object v2, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-static {v2}, Lcom/shopkick/app/webview/SKWebView;->access$600(Lcom/shopkick/app/webview/SKWebView;)Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Lcom/shopkick/app/webview/IWebViewURLHandlingCallback;->shouldOverrideURLLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    return v3

    :cond_7
    const-string p1, "http://"

    .line 533
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    const-string p1, "https://"

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 535
    :try_start_3
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.VIEW"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 536
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 537
    iget-object p2, p0, Lcom/shopkick/app/webview/SKWebView$SKWebViewClient;->this$0:Lcom/shopkick/app/webview/SKWebView;

    invoke-virtual {p2}, Lcom/shopkick/app/webview/SKWebView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    return v3

    :catch_3
    return v3

    :cond_8
    return v0
.end method
