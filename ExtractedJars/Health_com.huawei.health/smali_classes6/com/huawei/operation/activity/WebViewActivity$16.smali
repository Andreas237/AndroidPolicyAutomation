.class Lcom/huawei/operation/activity/WebViewActivity$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/activity/WebViewActivity;->mCustomLeftBtnArrowType()V
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

    .line 1340
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1343
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$800(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$1100(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1344
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Contants.WEBVIEW_STATUS_LEFT_ARROW"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1345
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$800(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    const-string v1, "306"

    invoke-virtual {v0, v1}, Lcom/huawei/operation/view/CustomWebView;->callBackWebviewStatus(Ljava/lang/String;)V

    .line 1347
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    const-string v1, "pushNotificationIntent"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/operation/activity/WebViewActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 1348
    const-string v0, "isPushNotification"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 1349
    if-eqz v5, :cond_1

    .line 1350
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCustomTitleBar isPush in if"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1351
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 1352
    const-string v0, "isPushNotification"

    const/4 v1, 0x0

    invoke-interface {v6, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1353
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1354
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$1300(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 1355
    goto :goto_0

    .line 1356
    :cond_1
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCustomTitleBar isPush in else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1357
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->setResult(I)V

    .line 1359
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/operation/activity/WebViewActivity;->isTaskRoot()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1360
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCustomTitleBar is  TaskRoot,jump to main"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1361
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$1300(Lcom/huawei/operation/activity/WebViewActivity;)V

    .line 1363
    :cond_2
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$800(Lcom/huawei/operation/activity/WebViewActivity;)Lcom/huawei/operation/view/CustomWebView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/operation/view/CustomWebView;->goBack()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1364
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setCustomTitleBar in finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1365
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$16;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/operation/activity/WebViewActivity;->finish()V

    .line 1367
    :cond_3
    return-void
.end method
