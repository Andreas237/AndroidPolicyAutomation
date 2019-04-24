.class Lcom/huawei/login/ui/login/LoginInit$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/login/ui/login/LoginInit;->logoutWhenStTimeout(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/login/ui/login/LoginInit;

.field final synthetic val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lcom/huawei/login/ui/login/LoginInit;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 408
    iput-object p1, p0, Lcom/huawei/login/ui/login/LoginInit$2;->this$0:Lcom/huawei/login/ui/login/LoginInit;

    iput-object p2, p0, Lcom/huawei/login/ui/login/LoginInit$2;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 411
    iget-object v0, p0, Lcom/huawei/login/ui/login/LoginInit$2;->this$0:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v5

    .line 412
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter logoutWhenStTimeout time st is = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    iget-object v0, p0, Lcom/huawei/login/ui/login/LoginInit$2;->this$0:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v6

    .line 414
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e28

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "migrate_timeout_s_key"

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v5, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 417
    iget-object v0, p0, Lcom/huawei/login/ui/login/LoginInit$2;->this$0:Lcom/huawei/login/ui/login/LoginInit;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->access$100(Lcom/huawei/login/ui/login/LoginInit;)V

    .line 418
    iget-object v0, p0, Lcom/huawei/login/ui/login/LoginInit$2;->this$0:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->cleanLoginData()V

    .line 419
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v7

    .line 420
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 421
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 422
    const-string v0, "com.huawei.plugin.account.logout"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 423
    const-string v0, "logoutNotExit"

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 425
    const-string v9, ""

    .line 427
    :try_start_0
    invoke-static {}, Lcom/huawei/login/ui/login/LoginInit;->access$000()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v6}, Lo/dec;->c(ILjava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v9, v0

    .line 430
    goto :goto_0

    .line 428
    :catch_0
    move-exception v10

    .line 429
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    :goto_0
    const-string v0, "invalidst"

    invoke-virtual {v8, v0, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 433
    invoke-virtual {v7, v8}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 434
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 435
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v8, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 436
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----mContext sendBroadcast----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 438
    :cond_0
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----mContext is null----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/huawei/login/ui/login/LoginInit$2;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 442
    iget-object v0, p0, Lcom/huawei/login/ui/login/LoginInit$2;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 445
    :cond_2
    return-void
.end method
