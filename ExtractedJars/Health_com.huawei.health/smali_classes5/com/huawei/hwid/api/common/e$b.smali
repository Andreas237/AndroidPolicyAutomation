.class Lcom/huawei/hwid/api/common/e$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:Lcom/huawei/cloudservice/CloudRequestHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 1409
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 1405
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/e$b;->a:Landroid/content/Context;

    .line 1406
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/e$b;->b:Z

    .line 1410
    iput-object p1, p0, Lcom/huawei/hwid/api/common/e$b;->a:Landroid/content/Context;

    .line 1411
    iput-object p2, p0, Lcom/huawei/hwid/api/common/e$b;->c:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 1412
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1420
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/e$b;->b:Z

    if-eqz v0, :cond_0

    .line 1421
    return-void

    .line 1426
    :cond_0
    :try_start_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 1427
    const-string v0, "LogoutBroadcastReceiver"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1428
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$b;->a:Landroid/content/Context;

    invoke-static {v0, v4}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1431
    goto :goto_0

    .line 1429
    :catch_0
    move-exception v4

    .line 1430
    const-string v0, "CloudAccountImpl"

    const-string v1, "IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1432
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/e$b;->b:Z

    .line 1435
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 1436
    return-void

    .line 1438
    :cond_1
    const-string v4, ""

    .line 1440
    :try_start_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v4

    .line 1444
    goto :goto_1

    .line 1441
    :catch_1
    move-exception v5

    .line 1442
    const-string v0, "CloudAccountImpl"

    const-string v1, "LogoutBroadcastReceiver param error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1443
    return-void

    .line 1449
    :goto_1
    invoke-static {p1}, Lcom/huawei/hwid/api/common/e;->e(Landroid/content/Context;)V

    .line 1451
    const-string v0, "com.huawei.hwid.ACTION_LOGOUT_CANCEL"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1452
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$b;->c:Lcom/huawei/cloudservice/CloudRequestHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1453
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$b;->c:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "logout hwid cancel: press cancel or back key"

    const/16 v3, 0xbba

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1454
    const-string v0, "CloudAccountImpl"

    const-string v1, "logout hwid cancel: press cancel or back key"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 1456
    :cond_2
    const-string v0, "com.huawei.hwid.ACTION_LOGOUT_FAIL"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1457
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$b;->c:Lcom/huawei/cloudservice/CloudRequestHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1458
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$b;->c:Lcom/huawei/cloudservice/CloudRequestHandler;

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "logout hwid failed"

    const/16 v3, 0x13

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 1459
    const-string v0, "CloudAccountImpl"

    const-string v1, "logout hwid failed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1462
    :cond_3
    :goto_2
    return-void
.end method
