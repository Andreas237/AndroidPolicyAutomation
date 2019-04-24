.class public Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/component/ProgressService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ProgressReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/component/ProgressService;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/component/ProgressService;)V
    .locals 0

    .line 331
    iput-object p1, p0, Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 337
    if-eqz p2, :cond_2

    .line 338
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    .line 341
    const/4 v4, 0x0

    .line 343
    const-string v0, "mLogUploadInfo"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 346
    goto :goto_0

    .line 344
    :catch_0
    move-exception v5

    .line 345
    const-string v0, "ProgressService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ProgressReceiver onReceive error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    :goto_0
    if-eqz v4, :cond_0

    instance-of v0, v4, Lcom/huawei/logupload/LogUpload;

    if-eqz v0, :cond_0

    .line 348
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    move-object v1, v4

    check-cast v1, Lcom/huawei/logupload/LogUpload;

    invoke-static {v0, v1}, Lcom/huawei/feedback/component/ProgressService;->c(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;)Lcom/huawei/logupload/LogUpload;

    .line 351
    :cond_0
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 352
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    iget-object v1, p0, Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v1}, Lcom/huawei/feedback/component/ProgressService;->f(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/logupload/LogUpload;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lcom/huawei/feedback/component/ProgressService;->a(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;Landroid/content/Intent;)V

    goto :goto_1

    .line 354
    :cond_1
    const-string v0, "com.example.logupload.progressSmall"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v0}, Lcom/huawei/feedback/component/ProgressService;->f(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/logupload/LogUpload;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 356
    iget-object v0, p0, Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    iget-object v1, p0, Lcom/huawei/feedback/component/ProgressService$ProgressReceiver;->a:Lcom/huawei/feedback/component/ProgressService;

    invoke-static {v1}, Lcom/huawei/feedback/component/ProgressService;->f(Lcom/huawei/feedback/component/ProgressService;)Lcom/huawei/logupload/LogUpload;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lcom/huawei/feedback/component/ProgressService;->b(Lcom/huawei/feedback/component/ProgressService;Lcom/huawei/logupload/LogUpload;Landroid/content/Intent;)V

    .line 360
    :cond_2
    :goto_1
    return-void
.end method
