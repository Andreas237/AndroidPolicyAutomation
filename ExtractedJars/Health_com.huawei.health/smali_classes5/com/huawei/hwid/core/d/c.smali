.class public Lcom/huawei/hwid/core/d/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 25
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 26
    :cond_0
    return-void

    .line 28
    :cond_1
    const-string v1, "com.huawei.cloudserive.loginSuccess"

    .line 29
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 32
    return-void
.end method

.method public static b(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 42
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 43
    :cond_0
    return-void

    .line 45
    :cond_1
    const-string v1, "com.huawei.cloudserive.loginFailed"

    .line 46
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 48
    return-void
.end method
