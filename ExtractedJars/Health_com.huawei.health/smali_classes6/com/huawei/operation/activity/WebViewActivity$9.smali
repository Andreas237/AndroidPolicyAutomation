.class Lcom/huawei/operation/activity/WebViewActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBarRightVmallConpon()V
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

    .line 1125
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity$9;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1128
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCustomTitleBarRightQuitAct onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1129
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$9;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$800(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1130
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$9;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity$9;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$800(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/operation/view/CustomWebView;->getRegisterVmallCouponFunctionRes()Ljava/lang/String;

    move-result-object v1

    const-string v2, "2"

    invoke-static {v0, v1, v2}, Lcom/huawei/operation/jsoperation/JSRegisterFuctionResUtil;->callBackResStatus(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1132
    :cond_0
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showQuitDialog null == mCustomWebView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1134
    :goto_0
    return-void
.end method
