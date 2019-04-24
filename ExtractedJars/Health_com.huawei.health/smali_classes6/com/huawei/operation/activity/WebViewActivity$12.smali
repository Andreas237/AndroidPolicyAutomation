.class Lcom/huawei/operation/activity/WebViewActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/activity/WebViewActivity;->handleMorePopWindow(Landroid/view/View;Lcom/huawei/operation/beans/TitleBean;)V
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

    .line 1241
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity$12;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    iput-object p2, p0, Lcom/huawei/operation/activity/WebViewActivity$12;->val$titleBean:Lcom/huawei/operation/beans/TitleBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1244
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1245
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1246
    const-string v0, "itemName"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1247
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity$12;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->hg:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1248
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$12;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$800(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/activity/WebViewActivity$12;->val$titleBean:Lcom/huawei/operation/beans/TitleBean;

    invoke-virtual {v1}, Lcom/huawei/operation/beans/TitleBean;->fetch_getShopcarUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->reload(Ljava/lang/String;)V

    .line 1249
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$12;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$3500(Lcom/huawei/operation/activity/WebViewActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 1250
    return-void
.end method
