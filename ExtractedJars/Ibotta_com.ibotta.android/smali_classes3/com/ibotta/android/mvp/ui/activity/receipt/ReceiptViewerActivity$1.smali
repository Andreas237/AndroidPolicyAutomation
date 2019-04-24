.class Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity$1;
.super Landroid/webkit/WebViewClient;
.source "ReceiptViewerActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->initWebView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 100
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;->onReceiptLoadFinished()V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 94
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 95
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;->onReceiptLoadStarted()V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 106
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 107
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->access$200(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerPresenter;->onReceiptLoadError()V

    return-void
.end method
