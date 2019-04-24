.class public Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/component/ProgressService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ProgressCancelReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/component/ProgressService;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/component/ProgressService;)V
    .locals 0

    .line 703
    iput-object p1, p0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 707
    if-eqz p2, :cond_0

    invoke-static {}, Lcom/huawei/feedback/e;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 708
    :cond_0
    return-void

    .line 710
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    .line 712
    const-string v0, "com.example.logupload.progress.cancel"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 714
    const-string v0, "ProgressService"

    const-string v1, "ProgressCancelReceiver onReceive"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 718
    const-wide/16 v4, -0x1

    .line 719
    const/4 v6, 0x0

    .line 722
    const-string v0, "strID"

    const-wide/16 v1, -0x1

    :try_start_0
    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    move-wide v4, v0

    .line 723
    const-string v0, "comeFromRecord"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 727
    goto :goto_0

    .line 724
    :catch_0
    move-exception v7

    .line 726
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "strId get exception"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 732
    :goto_0
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "strId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 733
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->h(Lcom/huawei/feedback/component/ProgressService;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/logupload/LogUpload;

    .line 734
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 736
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->i(Lcom/huawei/feedback/component/ProgressService;)V

    .line 738
    if-nez v6, :cond_3

    .line 742
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->j(Lcom/huawei/feedback/component/ProgressService;)Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->j(Lcom/huawei/feedback/component/ProgressService;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_5

    .line 744
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0, v7, v4, v5}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;J)V

    goto :goto_1

    .line 749
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0, v7, v4, v5}, Lcom/huawei/feedback/component/ProgressService;->b(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;J)V

    goto :goto_1

    .line 752
    :cond_4
    const-string v0, "ProgressService"

    const-string v1, "ProgressCancelReceiver\uff1a ProgressCancelReceiver mLogUploadInfo == null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 757
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 762
    const-string v0, "com.example.logupload.exception"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 763
    const-string v0, "strID"

    invoke-virtual {v8, v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 764
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 767
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-virtual {v0, v8}, Lcom/huawei/feedback/component/ProgressService;->sendBroadcast(Landroid/content/Intent;)V

    .line 781
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->k(Lcom/huawei/feedback/component/ProgressService;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 782
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressCancelReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-virtual {v0}, Lcom/huawei/feedback/component/ProgressService;->stopSelf()V

    .line 794
    :cond_6
    return-void
.end method
