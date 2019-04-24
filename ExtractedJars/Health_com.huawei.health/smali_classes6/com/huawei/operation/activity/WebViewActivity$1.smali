.class Lcom/huawei/operation/activity/WebViewActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/activity/WebViewActivity;->initGRSManager()V
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

    .line 318
    iput-object p1, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 321
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "getToken"

    invoke-virtual {v0, v1}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 322
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/huawei/operation/utils/WebViewUtils;->setTokenKeyUrlSP(Landroid/content/Context;Ljava/lang/String;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    invoke-virtual {v0, v1}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 324
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v5}, Lcom/huawei/operation/utils/WebViewUtils;->setActivityKeyUrlSP(Landroid/content/Context;Ljava/lang/String;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v2}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v2

    const-string v3, "achievementUrl"

    invoke-virtual {v2, v3}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/web/annualHtml/annualReport.html"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$102(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 326
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v2}, Lcom/huawei/operation/activity/WebViewActivity;->access$000(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v2

    const-string v3, "achievementUrl"

    invoke-virtual {v2, v3}, Lo/cze;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/web/annualHtml/annualReport2018.html"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/activity/WebViewActivity;->access$202(Lcom/huawei/operation/activity/WebViewActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 327
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "tokenKeyUrl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "activityKeyUrl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const-string v0, "Opera_WebViewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "annualUrl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v3}, Lcom/huawei/operation/activity/WebViewActivity;->access$100(Lcom/huawei/operation/activity/WebViewActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    iget-object v0, p0, Lcom/huawei/operation/activity/WebViewActivity$1;->this$0:Lcom/huawei/operation/activity/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/operation/activity/WebViewActivity;->access$300(Lcom/huawei/operation/activity/WebViewActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x7df

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 332
    return-void
.end method
