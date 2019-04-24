.class public Lcom/huawei/hwid/vermanager/a;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/cloudservice/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/cloudservice/a;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/a;->a:Lcom/huawei/cloudservice/a;

    .line 26
    iput-object p2, p0, Lcom/huawei/hwid/vermanager/a;->a:Lcom/huawei/cloudservice/a;

    .line 27
    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 30
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 31
    const-string v0, "ReleaseAccountCenterWebViewClient"

    const-string v1, "onPageFinished"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lcom/huawei/hwid/vermanager/a;->a:Lcom/huawei/cloudservice/a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/cloudservice/a;->a(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 33
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 36
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 37
    const-string v0, "ReleaseAccountCenterWebViewClient"

    const-string v1, "onPageStarted"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/huawei/hwid/vermanager/a;->a:Lcom/huawei/cloudservice/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/cloudservice/a;->a(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 39
    return-void
.end method
