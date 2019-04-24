.class Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$2;->c:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$2;->c:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->d(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$2;->c:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->e(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$2;->c:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-static {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->c(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V

    .line 117
    return-void
.end method
