.class Lcom/huawei/login/ui/login/LoginInit$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/login/ui/login/LoginInit;->logout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/login/ui/login/LoginInit;


# direct methods
.method constructor <init>(Lcom/huawei/login/ui/login/LoginInit;)V
    .locals 0

    .line 347
    iput-object p1, p0, Lcom/huawei/login/ui/login/LoginInit$1;->this$0:Lcom/huawei/login/ui/login/LoginInit;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 351
    iget-object v0, p0, Lcom/huawei/login/ui/login/LoginInit$1;->this$0:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->cleanLoginData()V

    .line 353
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_GUIDE_SET_USER_INFO_SUCCESS_FLAG"

    const-string v3, "false"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 356
    new-instance v5, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/dcy;-><init>(I)V

    .line 357
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_exist_kid_watch"

    const-string v3, ""

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 359
    invoke-static {}, Lcom/huawei/login/ui/login/LoginInit;->access$000()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_cloud_push_receiver"

    const-string v3, ""

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 361
    iget-object v0, p0, Lcom/huawei/login/ui/login/LoginInit$1;->this$0:Lcom/huawei/login/ui/login/LoginInit;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->access$100(Lcom/huawei/login/ui/login/LoginInit;)V

    .line 363
    invoke-static {}, Lcom/huawei/login/ui/login/LoginInit;->access$000()Landroid/content/Context;

    move-result-object v0

    const-string v1, "1"

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V

    .line 365
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v6

    .line 366
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 367
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 368
    const-string v0, "com.huawei.plugin.account.logout"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 369
    invoke-virtual {v6, v7}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 372
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 373
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v7, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto :goto_0

    .line 375
    :cond_0
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----mContext is null----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    :goto_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Enter logout  --> close , account logout()"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 381
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 382
    invoke-virtual {v6, v8}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 385
    :cond_1
    return-void
.end method
