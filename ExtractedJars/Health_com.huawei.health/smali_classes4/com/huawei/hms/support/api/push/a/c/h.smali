.class public Lcom/huawei/hms/support/api/push/a/c/h;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/hms/support/api/push/a/b/a;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;Ljava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/huawei/hms/support/api/push/a/c/h;->a:Landroid/content/Context;

    .line 24
    iput-object p2, p0, Lcom/huawei/hms/support/api/push/a/c/h;->b:Lcom/huawei/hms/support/api/push/a/b/a;

    .line 25
    iput-object p3, p0, Lcom/huawei/hms/support/api/push/a/c/h;->c:Ljava/lang/String;

    .line 26
    return-void
.end method

.method private static b(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;)Landroid/content/Intent;
    .locals 5

    .line 100
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 101
    const/4 v0, 0x0

    return-object v0

    .line 103
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/hms/support/api/push/a/d/a;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    .line 104
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 107
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v4

    .line 109
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Intent.parseUri(msg.intentUri, 0)\uff0c"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Landroid/content/Intent;->toURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v4}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    move-object v3, v4

    .line 119
    :cond_1
    goto :goto_0

    .line 115
    :catch_0
    move-exception v4

    .line 116
    const-string v0, "PushSelfShowLog"

    const-string v1, "intentUri error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    goto :goto_0

    .line 117
    :catch_1
    move-exception v4

    .line 118
    const-string v0, "PushSelfShowLog"

    const-string v1, "intentUri error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    goto :goto_0

    .line 123
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->t()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 124
    new-instance v4, Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->t()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 125
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v4}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 126
    move-object v3, v4

    .line 129
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    :goto_0
    return-object v3
.end method


# virtual methods
.method public a(Landroid/content/Context;)Z
    .locals 2

    .line 49
    const-string v0, "cosa"

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/c/h;->b:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/api/push/a/c/h;->b(Landroid/content/Context;)Z

    move-result v0

    return v0

    .line 51
    :cond_0
    const-string v0, "email"

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/c/h;->b:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/api/push/a/c/h;->c(Landroid/content/Context;)Z

    move-result v0

    return v0

    .line 54
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;)Z
    .locals 4

    .line 81
    const/4 v2, 0x0

    .line 82
    const-string v0, "cosa"

    invoke-virtual {p2}, Lcom/huawei/hms/support/api/push/a/b/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 83
    invoke-static {p1, p2}, Lcom/huawei/hms/support/api/push/a/c/h;->b(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;)Landroid/content/Intent;

    move-result-object v3

    .line 84
    if-nez v3, :cond_0

    .line 85
    const-string v0, "PushSelfShowLog"

    const-string v1, "launchCosaApp,intent == null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const/4 v2, 0x1

    .line 88
    :cond_0
    invoke-static {p1, v3}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 89
    const-string v0, "PushSelfShowLog"

    const-string v1, "no permission to start activity"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const/4 v2, 0x1

    .line 92
    :cond_1
    goto :goto_0

    .line 93
    :cond_2
    const/4 v2, 0x0

    .line 96
    :goto_0
    return v2
.end method

.method public b(Landroid/content/Context;)Z
    .locals 3

    .line 60
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/c/h;->b:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/push/a/b/a;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/hms/support/api/push/a/d/a;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    const-string v0, "4"

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/c/h;->b:Lcom/huawei/hms/support/api/push/a/b/a;

    const/4 v2, -0x1

    invoke-static {p1, v0, v1, v2}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/support/api/push/a/b/a;I)V

    .line 63
    const/4 v0, 0x0

    return v0

    .line 65
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public c(Landroid/content/Context;)Z
    .locals 3

    .line 72
    invoke-static {p1}, Lcom/huawei/hms/support/api/push/a/d/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    const-string v0, "15"

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/c/h;->b:Lcom/huawei/hms/support/api/push/a/b/a;

    const/4 v2, -0x1

    invoke-static {p1, v0, v1, v2}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/support/api/push/a/b/a;I)V

    .line 75
    const/4 v0, 0x0

    return v0

    .line 77
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public run()V
    .locals 5

    .line 30
    const-string v0, "PushSelfShowLog"

    const-string v1, "enter run()"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/c/h;->a:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/push/a/c/h;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 34
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/c/h;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/c/h;->b:Lcom/huawei/hms/support/api/push/a/b/a;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hms/support/api/push/a/c/h;->a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/c/h;->a:Landroid/content/Context;

    const-string v1, "17"

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/c/h;->b:Lcom/huawei/hms/support/api/push/a/b/a;

    const/4 v3, -0x1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/support/api/push/a/b/a;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return-void

    .line 40
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/a/c/h;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/a/c/h;->b:Lcom/huawei/hms/support/api/push/a/b/a;

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/a/c/h;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/support/api/push/a/c/d;->a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 44
    :cond_1
    goto :goto_0

    .line 42
    :catch_0
    move-exception v4

    .line 43
    const-string v0, "PushSelfShowLog"

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    :goto_0
    return-void
.end method
