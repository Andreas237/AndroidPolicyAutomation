.class Lcom/huawei/operation/view/CustomWebView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/view/CustomWebView;->initWebViewSettings()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/view/CustomWebView;


# direct methods
.method constructor <init>(Lcom/huawei/operation/view/CustomWebView;)V
    .locals 0

    .line 449
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 452
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    .line 453
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KeyEvent.xxxx = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    const/4 v0, 0x4

    if-ne p2, v0, :cond_3

    .line 456
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$100(Lcom/huawei/operation/view/CustomWebView;)Lcom/huawei/operation/adapter/PluginOperationAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 457
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$100(Lcom/huawei/operation/view/CustomWebView;)Lcom/huawei/operation/adapter/PluginOperationAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$200(Lcom/huawei/operation/view/CustomWebView;)Landroid/app/Activity;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->canFinish(Landroid/app/Activity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 458
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "breathe finish activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$200(Lcom/huawei/operation/view/CustomWebView;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 460
    const/4 v0, 0x1

    return v0

    .line 461
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$100(Lcom/huawei/operation/view/CustomWebView;)Lcom/huawei/operation/adapter/PluginOperationAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v1}, Lcom/huawei/operation/view/CustomWebView;->access$200(Lcom/huawei/operation/view/CustomWebView;)Landroid/app/Activity;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/operation/adapter/PluginOperationAdapter;->canFinish(Landroid/app/Activity;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 462
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "breathe show stop dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    const/4 v0, 0x1

    return v0

    .line 466
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    const-string v1, "304"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 467
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$300(Lcom/huawei/operation/view/CustomWebView;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 468
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KeyEvent mWebView.canGoBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->processBack()Z

    move-result v0

    return v0

    .line 471
    :cond_2
    const-string v0, "Opera_CustomWebView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "KeyEvent setResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$2;->this$0:Lcom/huawei/operation/view/CustomWebView;

    invoke-static {v0}, Lcom/huawei/operation/view/CustomWebView;->access$200(Lcom/huawei/operation/view/CustomWebView;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setResult(I)V

    .line 473
    const/4 v0, 0x0

    return v0

    .line 477
    :cond_3
    const/4 v0, 0x0

    return v0
.end method
