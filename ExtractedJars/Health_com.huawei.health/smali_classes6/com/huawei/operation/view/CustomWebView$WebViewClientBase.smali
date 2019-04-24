.class Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/view/CustomWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WebViewClientBase"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/view/CustomWebView;


# direct methods
.method private constructor <init>(Lcom/huawei/operation/view/CustomWebView;)V
    .locals 0

    .line 1506
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/operation/view/CustomWebView;Lcom/huawei/operation/view/CustomWebView$1;)V
    .locals 0

    .line 1506
    invoke-direct {p0, p1}, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;-><init>(Lcom/huawei/operation/view/CustomWebView;)V

    return-void
.end method


# virtual methods
.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 4

    .line 1830
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doUpdateVisitedHistory enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1831
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 1832
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 5

    .line 1727
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageFinished"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1728
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageFinished enter url="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1729
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1700(Lcom/huawei/operation/view/CustomWebView;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1732
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2600(Lcom/huawei/operation/view/CustomWebView;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/getdiscountlist"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1733
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0, p2}, Lcom/huawei/operation/view/CustomWebView;->isCustomTitle(Ljava/lang/String;)V

    .line 1734
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->access$2602(Lcom/huawei/operation/view/CustomWebView;Z)Z

    .line 1738
    :cond_0
    const-string v0, "file:///android_asset/stressGame/html/twoVideoPlay.html"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "file:///android_asset/stressGame/html/twoVideoPlay_old.html"

    .line 1739
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1740
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2700(Lcom/huawei/operation/view/CustomWebView;)Lcom/huawei/operation/view/WebViewClientImpl;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1741
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2700(Lcom/huawei/operation/view/CustomWebView;)Lcom/huawei/operation/view/WebViewClientImpl;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/operation/view/WebViewClientImpl;->onMyPageFinished()V

    .line 1744
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2000(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x7d7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1745
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageFinished removeMessages mHandler.hasMessages(MSG_CONNECT_TIMEOUT\uff09"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1746
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2000(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x7d7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1748
    :cond_3
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$800(Lcom/huawei/operation/view/CustomWebView;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$800(Lcom/huawei/operation/view/CustomWebView;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1749
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$800(Lcom/huawei/operation/view/CustomWebView;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$800(Lcom/huawei/operation/view/CustomWebView;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 1750
    if-eqz v4, :cond_4

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1751
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->access$700(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)V

    .line 1756
    :cond_4
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$100(Lcom/huawei/operation/view/CustomWebView;)Lcom/huawei/operation/adapter/PluginOperationAdapter;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 1757
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageFinished mAdapter!=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1758
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$100(Lcom/huawei/operation/view/CustomWebView;)Lcom/huawei/operation/adapter/PluginOperationAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$1800(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->checkWhiteUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1760
    invoke-static {}, Lcom/huawei/operation/utils/CasLoginUtil;->getAutoLoginUrl()Ljava/lang/String;

    move-result-object v4

    .line 1761
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoLoginUrl = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1762
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 1763
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1765
    :cond_5
    goto :goto_0

    .line 1767
    :cond_6
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageFinished mAdapter == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1771
    :cond_7
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2000(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x2766

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1772
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1773
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2000(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1775
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 1776
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 5

    .line 1516
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageStarted"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1517
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1700(Lcom/huawei/operation/view/CustomWebView;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1518
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0, p2}, Lcom/huawei/operation/view/CustomWebView;->access$1802(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Ljava/lang/String;

    .line 1519
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0, p2}, Lcom/huawei/operation/view/CustomWebView;->access$1902(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Ljava/lang/String;

    .line 1520
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageStarted originUrl: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v2}, Lcom/huawei/operation/view/CustomWebView;->access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1521
    move-object v4, p2

    .line 1524
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1800(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1525
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not https protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1526
    invoke-static {p2}, Lcom/huawei/operation/utils/Utils;->isWhiteFileUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1527
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not file protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1528
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "JsInteraction"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 1529
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "hbssdk"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 1533
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0, p2}, Lcom/huawei/operation/view/CustomWebView;->isCustomTitle(Ljava/lang/String;)V

    .line 1534
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getProgress()I

    move-result v0

    const/16 v1, 0x64

    if-ge v0, v1, :cond_1

    .line 1535
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageStarted mWebView.getProgress() < 100 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1536
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2000(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x7d7

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1538
    :cond_1
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OverrideUrlLoading url:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1539
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$1800(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->access$2100(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1540
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageStarted isHealthVmall"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1541
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$000(Lcom/huawei/operation/view/CustomWebView;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1542
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageStarted isHealthVmall sendEmptyMessageDelayed DELAY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1543
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2000(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xfa1

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1544
    invoke-static {}, Lcom/huawei/operation/utils/CasLoginManager;->getInstance()Lcom/huawei/operation/utils/CasLoginManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;

    invoke-direct {v1, p0, v4}, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$1;-><init>(Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/operation/utils/CasLoginManager;->syncLoginState(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1572
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load loadUrlVmall isWebViewFirstLogin == true mWebView.stopLoading()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1573
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    goto :goto_0

    .line 1575
    :cond_2
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "load loadUrlVmall isWebViewFirstLogin == false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1576
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 1579
    :cond_3
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 1581
    :goto_0
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1781
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedError errorCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "description is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1782
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedError errorCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "description is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p3, v1, v2

    const-string v2, "enter"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1783
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2000(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x7d1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1784
    const-string v0, " "

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1785
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 1786
    return-void
.end method

.method public onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 4

    .line 1790
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    .line 1791
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedHttpError "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getStatusCode = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " getReasonPhrase"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getReasonPhrase()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1792
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 4

    .line 1796
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    .line 1797
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedSslError errorType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1798
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedSslError errorType is getCertificate : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p3}, Landroid/net/http/SslError;->getCertificate()Landroid/net/http/SslCertificate;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "getUrl : "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p3}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "toString :"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p3}, Landroid/net/http/SslError;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1799
    invoke-virtual {p3}, Landroid/net/http/SslError;->getPrimaryError()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 1801
    :pswitch_0
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedSslError SSL_DATE_INVALID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1802
    goto :goto_0

    .line 1804
    :pswitch_1
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedSslError SSL_EXPIRED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1805
    goto :goto_0

    .line 1807
    :pswitch_2
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedSslError SSL_IDMISMATCH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1808
    goto :goto_0

    .line 1810
    :pswitch_3
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedSslError SSL_INVALID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1811
    goto :goto_0

    .line 1813
    :pswitch_4
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedSslError SSL_NOTYETVALID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1814
    goto :goto_0

    .line 1816
    :pswitch_5
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedSslError SSL_UNTRUSTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1817
    goto :goto_0

    .line 1819
    :pswitch_6
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceivedSslError SSL_MAX_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1820
    .line 1824
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2000(Lcom/huawei/operation/view/CustomWebView;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x7d8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1825
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_0
        :pswitch_3
        :pswitch_6
    .end packed-switch
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 8

    .line 1589
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1590
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldInterceptRequest OverrideUrlLoading "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1592
    const-string v0, "http://localhost/annual2018/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1594
    const-string v0, "http://localhost/annual2018/"

    const-string v1, ""

    :try_start_0
    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 1595
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    .line 1596
    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, v5}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 1598
    new-instance v0, Landroid/webkit/WebResourceResponse;

    const-string v1, "image/png"

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2, v6}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 1599
    :catch_0
    move-exception v5

    .line 1600
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1601
    const/4 v0, 0x0

    return-object v0

    .line 1605
    :cond_0
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1606
    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1608
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not https protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1609
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/operation/utils/Utils;->isWhiteFileUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1610
    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "file:///data/data/com.huawei.health/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    .line 1611
    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2300(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1612
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not file protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1614
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->access$2302(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Ljava/lang/String;

    .line 1615
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldInterceptRequest originUrl: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v2}, Lcom/huawei/operation/view/CustomWebView;->access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1617
    new-instance v5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1618
    new-instance v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$2;

    invoke-direct {v0, p0}, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$2;-><init>(Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;)V

    invoke-virtual {v5, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1632
    :cond_2
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1633
    invoke-static {v4}, Lcom/huawei/operation/utils/Utils;->getHostByJDK(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1634
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1635
    const/4 v0, 0x0

    return-object v0

    .line 1638
    :cond_3
    const-string v0, ".crip.com"

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, ".c-ctrip.com"

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, ".trip.com"

    invoke-virtual {v5, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1639
    :cond_4
    const/4 v0, 0x0

    return-object v0

    .line 1641
    :cond_5
    const-string v0, "/web/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "/miniShop/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "/healthMallPlat/"

    .line 1642
    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "/breathePractice/"

    .line 1643
    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "/heartIndex/"

    .line 1644
    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "/messageH5/"

    .line 1645
    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "/audio/"

    .line 1646
    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 1647
    :cond_6
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldInterceptRequest:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1649
    :try_start_1
    new-instance v6, Ljava/net/URL;

    invoke-direct {v6, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 1650
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v7

    .line 1651
    const-string v0, "x-version"

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$2400(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1652
    const-string v0, "x-huid"

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$2500(Lcom/huawei/operation/view/CustomWebView;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1653
    new-instance v0, Landroid/webkit/WebResourceResponse;

    invoke-virtual {v7}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "encoding"

    invoke-virtual {v7, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 1654
    :catch_1
    move-exception v6

    .line 1655
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "URLConnection Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1659
    :cond_7
    const/4 v0, 0x0

    return-object v0
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 6

    .line 1665
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1666
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url_temp is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1667
    const/4 v0, 0x0

    return-object v0

    .line 1670
    :cond_0
    const-string v0, "http://localhost/annual2018/"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1672
    const-string v0, "http://localhost/annual2018/"

    const-string v1, ""

    :try_start_0
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 1673
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 1674
    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, v4}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 1676
    new-instance v0, Landroid/webkit/WebResourceResponse;

    const-string v1, "image/png"

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2, v5}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 1677
    :catch_0
    move-exception v4

    .line 1678
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1679
    const/4 v0, 0x0

    return-object v0

    .line 1683
    :cond_1
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1684
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not https protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1685
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/operation/utils/Utils;->isWhiteFileUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1686
    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "file:///data/data/com.huawei.health/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    .line 1687
    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$2300(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1688
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not file protocol removeJavascriptInterface"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1690
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->access$2302(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Ljava/lang/String;

    .line 1691
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldInterceptRequest originUrl: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v2}, Lcom/huawei/operation/view/CustomWebView;->access$1900(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1693
    new-instance v4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1694
    new-instance v0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$3;

    invoke-direct {v0, p0}, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase$3;-><init>(Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;)V

    invoke-virtual {v4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1708
    :cond_3
    const-string v0, "/web/"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "/miniShop/"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "/breathePractice/"

    .line 1709
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "/heartIndex/"

    .line 1710
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "/messageH5/"

    .line 1711
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "/audio/"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1713
    :cond_4
    :try_start_1
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 1714
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v5

    .line 1715
    const-string v0, "x-version"

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$2400(Lcom/huawei/operation/view/CustomWebView;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1716
    const-string v0, "x-huid"

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$2500(Lcom/huawei/operation/view/CustomWebView;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1717
    new-instance v0, Landroid/webkit/WebResourceResponse;

    invoke-virtual {v5}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "encoding"

    invoke-virtual {v5, v2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 1718
    :catch_1
    move-exception v4

    .line 1719
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "URLConnection Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1722
    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 4

    .line 1509
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldOverrideUrlLoading OverrideUrlLoading "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1510
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$WebViewClientBase;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0, p2}, Lcom/huawei/operation/view/CustomWebView;->access$1600(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
