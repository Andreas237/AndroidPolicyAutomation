.class Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dcx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->saveLoginInfo(Lcom/huawei/login/ui/login/util/LoginInfoData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;


# direct methods
.method constructor <init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)V
    .locals 0

    .line 433
    iput-object p1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProcessed(Lo/ddb;)V
    .locals 6

    .line 436
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "----login result"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/ddb;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$100(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setIsLogined(Z)V

    .line 438
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 439
    const/16 v1, 0x3ef

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "need_relogin"

    const-string v3, "false"

    .line 438
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 440
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$300(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)Lcom/huawei/login/ui/login/util/ILoginCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 441
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$300(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)Lcom/huawei/login/ui/login/util/ILoginCallback;

    move-result-object v0

    new-instance v1, Lcom/huawei/login/ui/login/util/LoginResult;

    invoke-direct {v1}, Lcom/huawei/login/ui/login/util/LoginResult;-><init>()V

    invoke-interface {v0, v1}, Lcom/huawei/login/ui/login/util/ILoginCallback;->onLoginSuccess(Ljava/lang/Object;)V

    .line 443
    :cond_0
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----login successful, send broadcast!----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 445
    const-string v0, "com.huawei.plugin.account.login"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 446
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$100(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 447
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$100(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 450
    :cond_1
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$100(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 451
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----send broadcast to all----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;->this$0:Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->access$100(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto :goto_0

    .line 454
    :cond_2
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----mContext is null----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    :goto_0
    return-void
.end method
