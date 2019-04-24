.class Lcom/huawei/operation/activity/WebViewActivity$21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/activity/WebViewActivity;->showRightTextBtnMyActivity(Z)V
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

    .line 1524
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity$21;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1527
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick myActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1528
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$21;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/operation/activity/WebViewActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1529
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload isNetworkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1530
    return-void

    .line 1532
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$21;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$3800(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1533
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$21;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$1100(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 1535
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$21;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0, p1}, Lcom/huawei/operation/activity/WebViewActivity;->access$3900(Lcom/huawei/operation/activity/WebViewActivity;Landroid/view/View;)V

    .line 1536
    return-void
.end method
