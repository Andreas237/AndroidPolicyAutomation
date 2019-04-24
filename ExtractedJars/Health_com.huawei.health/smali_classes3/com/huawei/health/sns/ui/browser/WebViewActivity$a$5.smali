.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/webkit/SslErrorHandler;

.field final synthetic c:Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;Landroid/webkit/SslErrorHandler;)V
    .locals 0

    .line 720
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$5;->c:Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$5;->b:Landroid/webkit/SslErrorHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 724
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$5;->b:Landroid/webkit/SslErrorHandler;

    invoke-virtual {v0}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 725
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$5;->c:Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->onBackPressed()V

    .line 726
    return-void
.end method
