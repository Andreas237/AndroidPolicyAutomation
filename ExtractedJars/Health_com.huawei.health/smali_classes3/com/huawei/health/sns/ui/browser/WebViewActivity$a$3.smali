.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;

.field final synthetic d:Landroid/webkit/SslErrorHandler;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;Landroid/webkit/SslErrorHandler;)V
    .locals 0

    .line 703
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$3;->c:Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$3;->d:Landroid/webkit/SslErrorHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 708
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$3;->d:Landroid/webkit/SslErrorHandler;

    invoke-virtual {v0}, Landroid/webkit/SslErrorHandler;->cancel()V

    .line 709
    return-void
.end method
