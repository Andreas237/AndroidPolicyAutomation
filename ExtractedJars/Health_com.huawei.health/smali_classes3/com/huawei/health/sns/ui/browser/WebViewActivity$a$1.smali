.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$1;
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
.field final synthetic b:Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;)V
    .locals 0

    .line 712
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$a$1;->b:Lcom/huawei/health/sns/ui/browser/WebViewActivity$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 716
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 717
    return-void
.end method
