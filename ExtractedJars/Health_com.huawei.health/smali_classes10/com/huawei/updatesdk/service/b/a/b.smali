.class public Lcom/huawei/updatesdk/service/b/a/b;
.super Ljava/lang/Object;


# direct methods
.method public static a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;
    .locals 2

    new-instance v1, Lcom/huawei/updatesdk/service/b/a/c;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/huawei/updatesdk/service/b/a/c;-><init>(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;)V

    invoke-virtual {v1}, Lcom/huawei/updatesdk/service/b/a/c;->a()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;)Lcom/huawei/updatesdk/service/b/a/c;
    .locals 1

    new-instance v0, Lcom/huawei/updatesdk/service/b/a/c;

    invoke-direct {v0, p0, p1}, Lcom/huawei/updatesdk/service/b/a/c;-><init>(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;)V

    invoke-static {v0, p0}, Lcom/huawei/updatesdk/service/b/a/b;->a(Lcom/huawei/updatesdk/service/b/a/c;Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;)V

    return-object v0
.end method

.method private static a(Lcom/huawei/updatesdk/service/b/a/c;Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;)V
    .locals 4

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "StoreAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "executeTask, ActiveCount:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/huawei/updatesdk/support/b/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getActiveCount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", TaskCount:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/huawei/updatesdk/support/b/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->getTaskCount()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;->isSerial()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/huawei/updatesdk/support/b/d;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/service/b/a/c;->a(Ljava/util/concurrent/Executor;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/huawei/updatesdk/support/b/d;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/service/b/a/c;->a(Ljava/util/concurrent/Executor;)V

    :goto_0
    return-void
.end method
