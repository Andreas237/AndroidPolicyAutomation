.class final Lcom/huawei/common/applog/AppLogApi$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 436
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 438
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 439
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 440
    const-string v0, "AppLogApi"

    const-string v1, "LOGPACAKAGE_SUCCESS!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 447
    const-string v0, "AppLogApi"

    const-string v1, "no hasPhoneServiceAutoUpload!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$000()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 450
    const-string v0, "aesSecret"

    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$100()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 451
    const-string v0, "filepath"

    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$200()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 452
    const-string v0, "uploadFile"

    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$300()Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 453
    const-string v0, "metaData"

    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$400()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 455
    :try_start_0
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$000()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 464
    goto :goto_0

    .line 456
    :catch_0
    move-exception v3

    .line 458
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$000()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 460
    :try_start_1
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$000()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 463
    goto :goto_0

    .line 461
    :catch_1
    move-exception v4

    .line 462
    const-string v0, "AppLogApi"

    const-string v1, "start AutoUploadService intent error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 466
    :cond_0
    :goto_0
    return-void
.end method
