.class Lcom/huawei/openalliance/ad/views/PPSWebView$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/PPSWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/PPSWebView;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/PPSWebView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$1;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$1;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Lcom/huawei/openalliance/ad/views/PPSWebView;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$1;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Lcom/huawei/openalliance/ad/views/PPSWebView;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$1;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Lcom/huawei/openalliance/ad/views/PPSWebView;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/PPSWebView$1;->a:Lcom/huawei/openalliance/ad/views/PPSWebView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/PPSWebView;->a(Lcom/huawei/openalliance/ad/views/PPSWebView;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
