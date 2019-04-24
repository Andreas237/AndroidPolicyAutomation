.class Lcom/huawei/feedback/component/e;
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
.field final synthetic a:Lcom/huawei/logupload/LogUpload;

.field final synthetic b:Lcom/huawei/feedback/component/ProgressService;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lcom/huawei/feedback/component/e;->b:Lcom/huawei/feedback/component/ProgressService;

    iput-object p2, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 424
    iget-object v0, p0, Lcom/huawei/feedback/component/e;->b:Lcom/huawei/feedback/component/ProgressService;

    iget-object v1, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    invoke-static {v0, v1}, Lcom/huawei/feedback/component/ProgressService;->d(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;)I

    move-result v4

    .line 425
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mLogUploadInfo.getId(): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    iget-object v0, p0, Lcom/huawei/feedback/component/e;->b:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->g(Lcom/huawei/feedback/component/ProgressService;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    iget-object v0, p0, Lcom/huawei/feedback/component/e;->b:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->e(Lcom/huawei/feedback/component/ProgressService;)Landroid/app/NotificationManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/app/NotificationManager;->cancel(I)V

    .line 431
    const/4 v5, 0x0

    .line 432
    invoke-static {}, Lcom/huawei/feedback/component/ProgressService;->d()Lcom/huawei/logupload/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 434
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/component/ProgressService;->d()Lcom/huawei/logupload/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/logupload/a;->a()Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 438
    goto :goto_0

    .line 436
    :catch_0
    move-exception v6

    .line 437
    const-string v0, "ProgressService"

    const-string v1, "external queryAllRecord RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    :cond_0
    :goto_0
    const/4 v6, 0x0

    .line 441
    if-eqz v5, :cond_3

    .line 442
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 443
    const/4 v6, 0x0

    goto :goto_2

    .line 445
    :cond_1
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/logupload/LogUpload;

    .line 446
    invoke-static {}, Lcom/huawei/feedback/component/ProgressService;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 447
    add-int/lit8 v6, v6, 0x1

    .line 449
    :cond_2
    goto :goto_1

    .line 464
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/huawei/feedback/component/e;->b:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->g(Lcom/huawei/feedback/component/ProgressService;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    iget-object v0, p0, Lcom/huawei/feedback/component/e;->b:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->h(Lcom/huawei/feedback/component/ProgressService;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    iget-object v0, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/feedback/logic/f;->a(Ljava/lang/String;I)V

    .line 472
    iget-object v0, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 473
    const-string v0, "ProgressServicefilepath"

    iget-object v1, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v1}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    new-instance v7, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    invoke-virtual {v0}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 475
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 476
    const-string v0, "ProgressService"

    const-string v1, "file delete sucess"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 478
    :cond_4
    const-string v0, "ProgressService"

    const-string v1, "file not exist or error! delete file fail!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 480
    :goto_3
    goto :goto_4

    .line 481
    :cond_5
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file path is empty or null: mLogUploadInfo.getFilepath()):"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/component/e;->a:Lcom/huawei/logupload/LogUpload;

    .line 482
    invoke-virtual {v2}, Lcom/huawei/logupload/LogUpload;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 481
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 488
    :goto_4
    if-nez v6, :cond_6

    .line 489
    iget-object v0, p0, Lcom/huawei/feedback/component/e;->b:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->e(Lcom/huawei/feedback/component/ProgressService;)Landroid/app/NotificationManager;

    move-result-object v0

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 494
    iget-object v0, p0, Lcom/huawei/feedback/component/e;->b:Lcom/huawei/feedback/component/ProgressService;

    invoke-virtual {v0}, Lcom/huawei/feedback/component/ProgressService;->stopSelf()V

    .line 499
    :cond_6
    return-void
.end method
