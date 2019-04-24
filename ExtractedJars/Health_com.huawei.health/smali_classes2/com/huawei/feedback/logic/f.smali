.class public final Lcom/huawei/feedback/logic/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a(Lcom/huawei/feedback/bean/f;)J
    .locals 4

    const-class v3, Lcom/huawei/feedback/logic/f;

    monitor-enter v3

    .line 19
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v2

    .line 21
    invoke-static {v2}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;)V

    .line 23
    invoke-static {v2, p0}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;Lcom/huawei/feedback/bean/f;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit v3

    return-wide v0

    :catchall_0
    move-exception p0

    monitor-exit v3

    throw p0
.end method

.method public static declared-synchronized a()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/feedback/bean/f;>;"
        }
    .end annotation

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 83
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 84
    invoke-static {v1}, Lcom/huawei/feedback/a/a/e;->c(Lcom/huawei/feedback/a/a/c;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method

.method public static declared-synchronized a(I)V
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 133
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 134
    invoke-static {v1, p0}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static declared-synchronized a(Ljava/lang/String;I)V
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 69
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 71
    invoke-static {v1}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;)V

    .line 73
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    monitor-exit v2

    return-void

    .line 76
    :cond_0
    invoke-static {v1, p0, p1}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static declared-synchronized a(Ljava/lang/String;)Z
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 50
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 51
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 52
    const-string p0, ""

    .line 54
    :cond_0
    invoke-static {v1, p0}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v2

    return v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static declared-synchronized b(Ljava/lang/String;)Lcom/huawei/feedback/bean/f;
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 91
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 92
    invoke-static {v1, p0}, Lcom/huawei/feedback/a/a/e;->d(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Lcom/huawei/feedback/bean/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static declared-synchronized b()V
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 111
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 112
    invoke-static {v1}, Lcom/huawei/feedback/a/a/e;->d(Lcom/huawei/feedback/a/a/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method

.method public static declared-synchronized b(Lcom/huawei/feedback/bean/f;)V
    .locals 4

    const-class v3, Lcom/huawei/feedback/logic/f;

    monitor-enter v3

    .line 30
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v2

    .line 32
    invoke-static {v2}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;)V

    .line 34
    if-nez p0, :cond_0

    .line 35
    monitor-exit v3

    return-void

    .line 38
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->v()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 40
    invoke-static {v2, p0}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;Lcom/huawei/feedback/bean/f;)J

    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v2, p0}, Lcom/huawei/feedback/a/a/e;->c(Lcom/huawei/feedback/a/a/c;Lcom/huawei/feedback/bean/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    :goto_0
    monitor-exit v3

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v3

    throw p0
.end method

.method public static declared-synchronized c(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/feedback/bean/f;>;"
        }
    .end annotation

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 103
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 104
    invoke-static {v1, p0}, Lcom/huawei/feedback/a/a/e;->c(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static declared-synchronized c()V
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 117
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 118
    invoke-static {v1}, Lcom/huawei/feedback/a/a/e;->e(Lcom/huawei/feedback/a/a/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method

.method public static declared-synchronized c(Lcom/huawei/feedback/bean/f;)V
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 58
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 60
    invoke-static {v1}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;)V

    .line 62
    if-nez p0, :cond_0

    .line 63
    monitor-exit v2

    return-void

    .line 65
    :cond_0
    invoke-static {v1, p0}, Lcom/huawei/feedback/a/a/e;->b(Lcom/huawei/feedback/a/a/c;Lcom/huawei/feedback/bean/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static declared-synchronized d()V
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 142
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 145
    invoke-static {v1}, Lcom/huawei/feedback/a/a/d;->a(Lcom/huawei/feedback/a/a/c;)V

    .line 146
    invoke-static {v1}, Lcom/huawei/feedback/a/a/d;->b(Lcom/huawei/feedback/a/a/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method

.method public static declared-synchronized d(Lcom/huawei/feedback/bean/f;)V
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 167
    :try_start_0
    new-instance v1, Ljava/lang/Thread;

    new-instance v0, Lcom/huawei/feedback/logic/p;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/logic/p;-><init>(Lcom/huawei/feedback/bean/f;)V

    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 168
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static declared-synchronized d(Ljava/lang/String;)V
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 125
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 126
    invoke-static {v1, p0}, Lcom/huawei/feedback/a/a/e;->e(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static declared-synchronized e(Ljava/lang/String;)Lcom/huawei/feedback/bean/f;
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 183
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 184
    invoke-static {v1, p0}, Lcom/huawei/feedback/a/a/e;->f(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Lcom/huawei/feedback/bean/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static declared-synchronized e()V
    .locals 3

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 150
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 153
    invoke-static {v1}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;)V

    .line 154
    invoke-static {v1}, Lcom/huawei/feedback/a/a/e;->b(Lcom/huawei/feedback/a/a/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method

.method public static declared-synchronized f()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    const-class v2, Lcom/huawei/feedback/logic/f;

    monitor-enter v2

    .line 172
    :try_start_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/a/a/c;->a(Landroid/content/Context;)Lcom/huawei/feedback/a/a/c;

    move-result-object v1

    .line 174
    invoke-static {v1}, Lcom/huawei/feedback/a/a/e;->a(Lcom/huawei/feedback/a/a/c;)V

    .line 176
    invoke-static {v1}, Lcom/huawei/feedback/a/a/e;->f(Lcom/huawei/feedback/a/a/c;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method
