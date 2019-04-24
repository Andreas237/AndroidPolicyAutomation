.class Lcom/huawei/hwid/api/common/d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/cloudservice/CloudRequestHandler;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/d;->c:Z

    .line 24
    iput-object p1, p0, Lcom/huawei/hwid/api/common/d;->a:Landroid/content/Context;

    .line 25
    iput-object p2, p0, Lcom/huawei/hwid/api/common/d;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 26
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 31
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/d;->c:Z

    if-eqz v0, :cond_0

    .line 32
    return-void

    .line 34
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 35
    const-string v0, "BindSafePhoneBroadcastReceiver"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 36
    iget-object v0, p0, Lcom/huawei/hwid/api/common/d;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 39
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/d;->c:Z

    .line 41
    invoke-static {p1}, Lcom/huawei/hwid/core/d/b/e;->a(Landroid/content/Context;)V

    .line 42
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 43
    return-void

    .line 47
    :cond_1
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 48
    const-string v0, "BindSafePhoneBroadcastReceiver"

    const-string v1, "BindSafePhoneBroadcastReceiver receiver : "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "com.huawei.hwid.ACTION.BINDSAFEPHONE.SUCCESS"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 50
    :cond_2
    const-string v0, "BindSafePhoneBroadcastReceiver"

    const-string v1, "BindSafePhoneBroadcastReceiver receiver not ACTION_BIND_SAFEPHONE"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    return-void

    .line 53
    :cond_3
    const-string v0, "result"

    :try_start_1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 54
    const-string v0, "result"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 55
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 56
    const-string v0, "1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 59
    const-string v0, "result"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v0, "secrityPhoneOrsecrityEmail"

    const-string v1, "secrityPhoneOrsecrityEmail"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string v0, "accountName"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 64
    const-string v0, "accountName"

    const-string v1, "accountName"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 67
    :cond_4
    const-string v0, "result"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/d;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v4}, Lcom/huawei/cloudservice/CloudRequestHandler;->onFinish(Landroid/os/Bundle;)V

    .line 70
    goto :goto_1

    .line 71
    :cond_6
    const-string v0, "error"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    .line 72
    iget-object v0, p0, Lcom/huawei/hwid/api/common/d;->b:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-interface {v0, v3}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    :goto_1
    goto :goto_2

    .line 74
    :catch_0
    move-exception v2

    .line 75
    const-string v0, "BindSafePhoneBroadcastReceiver"

    const-string v1, "BroadcastReceiver components are not allowed to register to receive intents"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    :goto_2
    return-void
.end method
