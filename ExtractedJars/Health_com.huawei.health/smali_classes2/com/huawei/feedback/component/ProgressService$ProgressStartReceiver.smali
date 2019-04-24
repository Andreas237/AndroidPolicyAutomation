.class public Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/component/ProgressService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ProgressStartReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/component/ProgressService;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/component/ProgressService;)V
    .locals 0

    .line 603
    iput-object p1, p0, Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    .line 607
    if-eqz p2, :cond_3

    .line 608
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 609
    const-string v0, "com.example.logupload.progress.start"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 611
    const-string v0, "ProgressService"

    const-string v1, "ProgressStartReceiver onReceive"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    const-wide/16 v5, -0x1

    .line 619
    const-string v0, "strID"

    const-wide/16 v1, -0x1

    :try_start_0
    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v5, v0

    .line 623
    goto :goto_0

    .line 620
    :catch_0
    move-exception v7

    .line 622
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

    .line 628
    :goto_0
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "strId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->h(Lcom/huawei/feedback/component/ProgressService;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/logupload/LogUpload;

    .line 630
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 631
    const-string v0, "0"

    invoke-virtual {v7, v0}, Lcom/huawei/logupload/LogUpload;->d(Ljava/lang/String;)V

    .line 632
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lcom/huawei/feedback/logic/f;->a(Ljava/lang/String;I)V

    .line 634
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mLogUploadInfo.getId() :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 635
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mLogUploadInfo.getTaskId() :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 636
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mLogUploadInfo.getIsPause() :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 637
    const-string v0, "ProgressService"

    const-string v1, "ProgressStartReceiver refresh"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressStartReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;Z)V

    .line 639
    const/4 v8, 0x0

    .line 641
    :try_start_1
    invoke-static {}, Lcom/huawei/feedback/component/ProgressService;->d()Lcom/huawei/logupload/a;

    move-result-object v0

    invoke-interface {v0, v7}, Lcom/huawei/logupload/a;->a(Lcom/huawei/logupload/LogUpload;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move v8, v0

    .line 644
    goto :goto_1

    .line 642
    :catch_1
    move-exception v9

    .line 643
    const-string v0, "ProgressService"

    const-string v1, "onReceive\uff1a external updateStatus RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 646
    :goto_1
    if-eqz v8, :cond_1

    .line 647
    new-instance v9, Landroid/content/Intent;

    const-string v0, "com.huawei.lcagent.UPLOAD_REQUEST"

    invoke-direct {v9, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 648
    const-string v0, "com.huawei.logupload.LogUploadService"

    invoke-virtual {v9, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 649
    const-string v0, "alert_visible"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->h()Z

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 650
    const-string v0, "filepath"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 651
    const-string v0, "id"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 652
    const-string v0, "size"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 658
    const-string v0, "encrypt"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->l()Z

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 659
    const-string v0, "privacy"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->r()Z

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 674
    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_0

    .line 675
    const-string v0, "usertype"

    const/4 v1, 0x5

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_2

    .line 677
    :cond_0
    const-string v0, "usertype"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 680
    :goto_2
    const-string v0, "flags"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->m()I

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 681
    const-string v0, "channelId"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->C()I

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 682
    const-string v0, "feedBackPackageName"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 683
    const-string v0, "feedBackClassName"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->F()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 687
    const-string v0, "encryptKey"

    invoke-virtual {v7}, Lcom/huawei/logupload/LogUpload;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 691
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 694
    :cond_1
    goto :goto_3

    .line 695
    :cond_2
    const-string v0, "ProgressService"

    const-string v1, "ProgressStartReceiver mLogUploadInfo == null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    :cond_3
    :goto_3
    return-void
.end method
