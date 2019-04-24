.class Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$c;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$c;->e:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$4;)V
    .locals 0

    .line 277
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$c;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;)V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 0

    .line 282
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 283
    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 288
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 289
    const-string v0, "about:blank"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity$c;->e:Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;

    invoke-static {v0, p2}, Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;->c(Lcom/huawei/health/sns/ui/browser/WebViewSimpleActivity;Ljava/lang/String;)V

    .line 294
    :cond_0
    return-void
.end method
