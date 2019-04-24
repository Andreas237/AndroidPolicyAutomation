.class Lcom/ibotta/android/activity/browser/WebViewBrowserActivity$WebViewBrowserActivityClient;
.super Landroid/webkit/WebViewClient;
.source "WebViewBrowserActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WebViewBrowserActivityClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity$WebViewBrowserActivityClient;->this$0:Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 168
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity$WebViewBrowserActivityClient;->this$0:Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 171
    iget-object p1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity$WebViewBrowserActivityClient;->this$0:Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;

    invoke-static {p1, p2}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->access$100(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;Ljava/lang/String;)V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 162
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 163
    iget-object p1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity$WebViewBrowserActivityClient;->this$0:Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;

    invoke-static {p1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->access$000(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 176
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    const-string p1, "Failed to load web page: (code=%1$d) %2$s"

    const/4 p4, 0x2

    .line 177
    new-array p4, p4, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x0

    aput-object p2, p4, v0

    const/4 p2, 0x1

    aput-object p3, p4, p2

    invoke-static {p1, p4}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    iget-object p1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity$WebViewBrowserActivityClient;->this$0:Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;

    invoke-static {p1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->access$200(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;)V

    return-void
.end method
