.class public Lcom/huawei/health/sns/logic/push/HealthPushAgentReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 41
    const/4 v4, 0x0

    .line 42
    if-eqz p2, :cond_0

    .line 43
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 45
    :cond_0
    const-string v5, ""

    .line 46
    const-string v0, "com.huawei.healthgroup.push.action.PUSH_TOKEN"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 47
    const-string v0, "com.huawei.healthgroup.push.extra.PUSH_TOKEN"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 48
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    const-string v0, "HealthPushAgentReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "health group PushDealReceiver push recevier PushToken : token is Empty !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    return-void

    .line 52
    :cond_1
    invoke-static {p1, v5}, Lo/avc;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 53
    const-string v0, "HealthPushAgentReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "health group PushDealReceiver push receive pushtoken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 55
    :cond_2
    const-string v0, "com.huawei.healthgroup.push.action.PUSH_MSG"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x0

    .line 59
    const-string v0, "com.huawei.healthgroup.push.extra.PUSH_MSG"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v0

    move-object v7, v0

    .line 60
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 61
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v6, v0

    .line 65
    :cond_3
    goto :goto_0

    .line 63
    :catch_0
    move-exception v8

    .line 64
    const-string v0, "HealthPushAgentReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "health group PushDealReceiver push onPushMsg, encoding exception."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :goto_0
    const-string v0, "HealthPushAgentReceiver"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "health group PushDealReceiver receive pushmsg, content: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 69
    new-instance v0, Lo/avc;

    invoke-direct {v0}, Lo/avc;-><init>()V

    invoke-virtual {v0, p1, v7, v5}, Lo/avc;->b(Landroid/content/Context;[BLjava/lang/String;)V

    .line 72
    :cond_4
    :goto_1
    return-void
.end method
