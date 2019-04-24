.class Lcom/huawei/operation/activity/WebViewActivity$17$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/activity/WebViewActivity$17;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/operation/activity/WebViewActivity$17;

.field final synthetic val$errUrl:Ljava/lang/String;

.field final synthetic val$resUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/operation/activity/WebViewActivity$17;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1421
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity$17$1;->this$1:Lcom/huawei/operation/activity/WebViewActivity$17;

    iput-object p2, p0, Lcom/huawei/operation/activity/WebViewActivity$17$1;->val$resUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/operation/activity/WebViewActivity$17$1;->val$errUrl:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1424
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$17$1;->this$1:Lcom/huawei/operation/activity/WebViewActivity$17;

    iget-object v0, v0, Lcom/huawei/operation/activity/WebViewActivity$17;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$1100(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity$17$1;->val$resUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1425
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$17$1;->this$1:Lcom/huawei/operation/activity/WebViewActivity$17;

    iget-object v0, v0, Lcom/huawei/operation/activity/WebViewActivity$17;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$1100(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity$17$1;->val$errUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1426
    return-void
.end method
