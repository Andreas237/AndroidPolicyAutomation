.class Lcom/huawei/operation/activity/WebViewActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/activity/WebViewActivity;->mCustomTitleBarRightMoreType(Lcom/huawei/operation/beans/TitleBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/activity/WebViewActivity;

.field final synthetic val$titleBean:Lcom/huawei/operation/beans/TitleBean;


# direct methods
.method constructor <init>(Lcom/huawei/operation/activity/WebViewActivity;Lcom/huawei/operation/beans/TitleBean;)V
    .locals 0

    .line 1151
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity$10;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    iput-object p2, p0, Lcom/huawei/operation/activity/WebViewActivity$10;->val$titleBean:Lcom/huawei/operation/beans/TitleBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1154
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$10;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    sget-object v1, Lo/dae;->he:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$3600(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)V

    .line 1155
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$10;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity$10;->val$titleBean:Lcom/huawei/operation/beans/TitleBean;

    invoke-static {v0, p1, v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$3700(Lcom/huawei/operation/activity/WebViewActivity;Landroid/view/View;Lcom/huawei/operation/beans/TitleBean;)V

    .line 1156
    return-void
.end method
