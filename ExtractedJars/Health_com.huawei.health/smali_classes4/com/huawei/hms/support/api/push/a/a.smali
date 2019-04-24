.class public Lcom/huawei/hms/support/api/push/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;Lcom/huawei/hms/support/api/push/a/b/a;)V
    .locals 6

    .line 95
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "receive a selfshow message ,the type is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/a/a/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 98
    const-string v0, "3"

    const/4 v1, -0x1

    invoke-static {p1, v0, p3, v1}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/support/api/push/a/b/a;I)V

    .line 100
    return-void

    .line 104
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/hms/support/api/push/a/b/a;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Ljava/lang/String;)J

    move-result-wide v3

    .line 105
    const-wide/16 v0, 0x0

    cmp-long v0, v3, v0

    if-nez v0, :cond_1

    .line 107
    const-string v0, "extra_encrypt_data"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 108
    new-instance v0, Lcom/huawei/hms/support/api/push/a/c/h;

    invoke-direct {v0, p1, p3, v5}, Lcom/huawei/hms/support/api/push/a/c/h;-><init>(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/c/h;->start()V

    .line 109
    goto :goto_0

    .line 110
    :cond_1
    const-string v0, "PushSelfShowLog"

    const-string v1, "waiting \u2026\u2026"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 112
    invoke-static {p1, p2, v3, v4}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Landroid/content/Intent;J)V

    .line 115
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/huawei/hms/support/api/push/a/b/a;I)V
    .locals 5

    .line 121
    const-string v0, "PushSelfShowLog"

    const-string v1, "receive a selfshow userhandle message"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const-string v0, "-1"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    invoke-static {p1, p2}, Lcom/huawei/hms/support/api/push/a/d/a;->b(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_0

    .line 128
    :cond_0
    invoke-static {p1, p5}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;I)V

    .line 133
    :goto_0
    const-string v0, "1"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 135
    new-instance v0, Lcom/huawei/hms/support/api/push/a/a/a;

    invoke-direct {v0, p1, p4}, Lcom/huawei/hms/support/api/push/a/a/a;-><init>(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;)V

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/a/a;->a()V

    .line 138
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->j()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 140
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->j()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 142
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.android.push.intent.CLICK"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 143
    const-string v0, "click"

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 144
    invoke-virtual {p4}, Lcom/huawei/hms/support/api/push/a/b/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 145
    invoke-virtual {p1, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    goto :goto_1

    .line 147
    :catch_0
    move-exception v3

    .line 148
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "message.extras is not a json format,err info "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    :cond_1
    :goto_1
    invoke-static {p1, p3, p4, p5}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/support/api/push/a/b/a;I)V

    .line 155
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;[B[BLjava/lang/String;I)V
    .locals 7

    .line 72
    new-instance v6, Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-direct {v6, p3, p4}, Lcom/huawei/hms/support/api/push/a/b/a;-><init>([B[B)V

    .line 74
    invoke-virtual {v6}, Lcom/huawei/hms/support/api/push/a/b/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    const-string v0, "PushSelfShowLog"

    const-string v1, "parseMessage failed"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    return-void

    .line 79
    :cond_0
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " onReceive the msg id = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/hms/support/api/push/a/b/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",and cmd is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",and the eventId is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const/4 v0, 0x0

    if-ne v0, p5, :cond_1

    .line 84
    invoke-direct {p0, p1, p2, v6}, Lcom/huawei/hms/support/api/push/a/a;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/huawei/hms/support/api/push/a/b/a;)V

    goto :goto_0

    .line 87
    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move-object v4, v6

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hms/support/api/push/a/a;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/huawei/hms/support/api/push/a/b/a;I)V

    .line 89
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 12

    .line 26
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 27
    :cond_0
    const-string v0, "PushSelfShowLog"

    const-string v1, "enter SelfShowReceiver receiver, context or intent is null"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 28
    return-void

    .line 30
    :cond_1
    :try_start_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v7

    .line 31
    const-string v0, "com.huawei.intent.action.PUSH"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 36
    const-string v0, "selfshow_info"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "selfshow_token"

    .line 37
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 38
    :cond_2
    const-string v0, "PushSelfShowLog"

    const-string v1, "not contain selfshow info or token, invalid message."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 39
    return-void

    .line 42
    :cond_3
    const-string v0, "selfshow_info"

    :try_start_2
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v8

    .line 43
    const-string v0, "selfshow_token"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v9

    .line 45
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    const/4 v0, 0x0

    if-ne v0, v9, :cond_5

    .line 46
    :cond_4
    const-string v0, "PushSelfShowLog"

    const-string v1, "self show info or token is null."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 47
    return-void

    .line 50
    :cond_5
    const-string v0, "selfshow_event_id"

    :try_start_3
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 51
    const-string v0, "selfshow_event_id"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 55
    :cond_6
    const/4 v11, 0x0

    .line 56
    const-string v0, "selfshow_notify_id"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 57
    const-string v0, "selfshow_notify_id"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v11

    .line 58
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get notifyId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    :cond_7
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v8

    move-object v4, v9

    move-object v5, v10

    move v6, v11

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hms/support/api/push/a/a;->a(Landroid/content/Context;Landroid/content/Intent;[B[BLjava/lang/String;I)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 67
    :cond_8
    goto :goto_0

    .line 63
    :catch_0
    move-exception v7

    .line 64
    const-string v0, "PushSelfShowLog"

    const-string v1, "onReceive RuntimeException."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    goto :goto_0

    .line 65
    :catch_1
    move-exception v7

    .line 66
    const-string v0, "PushSelfShowLog"

    const-string v1, "onReceive Exception."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    :goto_0
    return-void
.end method
