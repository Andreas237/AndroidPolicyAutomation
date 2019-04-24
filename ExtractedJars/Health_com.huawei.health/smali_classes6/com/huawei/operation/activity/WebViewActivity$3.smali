.class Lcom/huawei/operation/activity/WebViewActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/activity/WebViewActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/activity/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/operation/activity/WebViewActivity;)V
    .locals 0

    .line 481
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 484
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initView getViewTreeObserver(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v3}, Lcom/huawei/operation/activity/WebViewActivity;->access$400(Lcom/huawei/operation/activity/WebViewActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$400(Lcom/huawei/operation/activity/WebViewActivity;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 486
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$402(Lcom/huawei/operation/activity/WebViewActivity;Z)Z

    .line 487
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$500(Lcom/huawei/operation/activity/WebViewActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 488
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$600(Lcom/huawei/operation/activity/WebViewActivity;Z)V

    goto :goto_0

    .line 491
    :cond_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initView onGlobalLayout(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v3}, Lcom/huawei/operation/activity/WebViewActivity;->access$400(Lcom/huawei/operation/activity/WebViewActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$500(Lcom/huawei/operation/activity/WebViewActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 493
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$800(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$700(Lcom/huawei/operation/activity/WebViewActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    goto :goto_0

    .line 495
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$800(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity$3;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$900(Lcom/huawei/operation/activity/WebViewActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->load(Ljava/lang/String;)V

    .line 499
    :cond_2
    :goto_0
    return-void
.end method
