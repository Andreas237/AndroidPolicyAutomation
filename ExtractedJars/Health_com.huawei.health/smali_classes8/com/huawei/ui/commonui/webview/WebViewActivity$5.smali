.class Lcom/huawei/ui/commonui/webview/WebViewActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/commonui/webview/WebViewActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/commonui/webview/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/webview/WebViewActivity;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$5;->d:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$5;->d:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->d(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "canGoBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$5;->d:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->d(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    .line 212
    :cond_0
    const-string v0, "WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no GoBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/WebViewActivity$5;->d:Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/WebViewActivity;->b(Lcom/huawei/ui/commonui/webview/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    .line 214
    invoke-virtual {v4}, Landroid/app/Activity;->finish()V

    .line 216
    :goto_0
    return-void
.end method
