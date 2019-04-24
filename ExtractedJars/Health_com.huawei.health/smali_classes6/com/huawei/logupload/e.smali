.class Lcom/huawei/logupload/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/logupload/LogUploadService;

.field private final synthetic b:Landroid/content/Context;

.field private final synthetic c:Lcom/huawei/logupload/LogUpload;


# direct methods
.method constructor <init>(Lcom/huawei/logupload/LogUploadService;Landroid/content/Context;Lcom/huawei/logupload/LogUpload;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/logupload/e;->a:Lcom/huawei/logupload/LogUploadService;

    iput-object p2, p0, Lcom/huawei/logupload/e;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    .line 537
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 539
    sget-object v4, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v4

    .line 543
    :try_start_0
    new-instance v5, Lcom/huawei/logupload/a/c;

    iget-object v0, p0, Lcom/huawei/logupload/e;->b:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/logupload/a/c;-><init>(Landroid/content/Context;)V

    .line 544
    iget-object v0, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/huawei/logupload/a/a;->b(Lcom/huawei/logupload/a/c;Ljava/lang/String;)Lcom/huawei/logupload/LogUpload;

    move-result-object v6

    .line 545
    if-nez v6, :cond_1

    .line 548
    iget-object v0, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    invoke-static {v5, v0}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;)J

    move-result-wide v7

    .line 551
    iget-object v0, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0, v7, v8}, Lcom/huawei/logupload/LogUpload;->a(J)V

    .line 552
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "taskId:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 553
    const-string v2, "logUploadInfoTemp.getId():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 554
    const-string v2, "logUploadInfoTemp.getFilepath():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 555
    const-string v2, "logUploadInfoTemp().getSize():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 552
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 557
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/String;I)V

    .line 559
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "logUploadInfo.getTaskId():"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "CommonConstants.getTaskList():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 561
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 562
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    .line 563
    .line 564
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 565
    iget-object v0, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 566
    const-string v0, "mLogUploadInfo"

    .line 567
    iget-object v1, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    .line 566
    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 568
    iget-object v0, p0, Lcom/huawei/logupload/e;->a:Lcom/huawei/logupload/LogUploadService;

    invoke-virtual {v0, v9}, Lcom/huawei/logupload/LogUploadService;->sendBroadcast(Landroid/content/Intent;)V

    .line 580
    :cond_0
    new-instance v9, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v9, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 581
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v10

    .line 582
    iget-object v0, p0, Lcom/huawei/logupload/e;->c:Lcom/huawei/logupload/LogUpload;

    iput-object v0, v10, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 583
    invoke-virtual {v9, v10}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z

    .line 584
    goto :goto_0

    .line 588
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->c(Ljava/lang/String;)I

    move-result v7

    .line 589
    const/4 v0, 0x1

    if-eq v7, v0, :cond_2

    .line 590
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/i;->a(Ljava/lang/String;I)V

    .line 593
    :cond_2
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mLogupload.getTaskId():"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "CommonConstants.getTaskList():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 594
    new-instance v8, Lcom/huawei/logupload/c/i$a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v8, v0}, Lcom/huawei/logupload/c/i$a;-><init>(Landroid/os/Looper;)V

    .line 595
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/logupload/c/i$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v9

    .line 596
    iput-object v6, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 597
    invoke-virtual {v8, v9}, Lcom/huawei/logupload/c/i$a;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 539
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0

    .line 601
    :goto_1
    return-void
.end method
