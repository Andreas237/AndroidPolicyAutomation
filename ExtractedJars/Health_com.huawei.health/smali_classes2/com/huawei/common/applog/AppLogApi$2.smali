.class final Lcom/huawei/common/applog/AppLogApi$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 480
    iput-object p1, p0, Lcom/huawei/common/applog/AppLogApi$2;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 485
    iget-object v0, p0, Lcom/huawei/common/applog/AppLogApi$2;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/common/applog/AppLogApi;->checkTimeOver(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/common/applog/AppLogApi$2;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/common/applog/AppLogApi;->checkPolicyOver(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 491
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.phoneservice.AUTOCHECK"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/common/applog/AppLogApi$2;->val$context:Landroid/content/Context;

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 493
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 494
    const-string v0, "LogVersion"

    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$500()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 495
    const-string v0, "LogSubversion"

    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$600()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    const-string v0, "ProductName"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    const-string v0, "ProductVersion"

    sget-object v1, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 498
    invoke-static {}, Lcom/huawei/common/applog/AppLogApi;->access$000()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/e;->x(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 499
    iget-object v0, p0, Lcom/huawei/common/applog/AppLogApi$2;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/feedback/e;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 500
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 501
    move-object v5, v4

    .line 508
    :cond_0
    const-string v0, "SN"

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    const-string v0, "IMEI"

    invoke-virtual {v3, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    const-string v0, "metaData"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 512
    :try_start_0
    iget-object v0, p0, Lcom/huawei/common/applog/AppLogApi$2;->val$context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 515
    goto :goto_0

    .line 513
    :catch_0
    move-exception v6

    .line 514
    const-string v0, "AppLogApi"

    const-string v1, "AppLogApi checkUploadlog start AutoUploadService intent error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    :cond_1
    :goto_0
    return-void
.end method
