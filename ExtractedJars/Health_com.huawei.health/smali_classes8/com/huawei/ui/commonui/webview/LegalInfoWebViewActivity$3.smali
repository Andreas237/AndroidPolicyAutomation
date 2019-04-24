.class Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$3;->d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$3;->d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->b(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->cancel()V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$3;->d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->e(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$3;->d:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V

    .line 209
    return-void
.end method
