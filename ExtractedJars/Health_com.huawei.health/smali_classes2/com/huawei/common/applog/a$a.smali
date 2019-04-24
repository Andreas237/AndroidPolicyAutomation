.class Lcom/huawei/common/applog/a$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/common/applog/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/common/applog/a;


# direct methods
.method constructor <init>(Lcom/huawei/common/applog/a;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/huawei/common/applog/a$a;->a:Lcom/huawei/common/applog/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 189
    iget-object v4, p0, Lcom/huawei/common/applog/a$a;->a:Lcom/huawei/common/applog/a;

    .line 190
    invoke-static {}, Lcom/huawei/common/applog/a;->c()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 192
    :try_start_0
    invoke-static {v4}, Lcom/huawei/common/applog/a;->a(Lcom/huawei/common/applog/a;)I

    move-result v0

    invoke-static {v4}, Lcom/huawei/common/applog/a;->b(Lcom/huawei/common/applog/a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4}, Lcom/huawei/common/applog/a;->c(Lcom/huawei/common/applog/a;)I

    move-result v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/common/applog/c;->a(ILjava/lang/String;IZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    goto :goto_0

    .line 193
    :catch_0
    move-exception v6

    .line 194
    const-string v0, "AppLogManager"

    const-string v1, "LogWrite init IOException"

    :try_start_1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    .line 197
    :goto_1
    invoke-static {v4}, Lcom/huawei/common/applog/a;->d(Lcom/huawei/common/applog/a;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 200
    :try_start_2
    iget-object v0, p0, Lcom/huawei/common/applog/a$a;->a:Lcom/huawei/common/applog/a;

    invoke-static {v0}, Lcom/huawei/common/applog/a;->e(Lcom/huawei/common/applog/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 201
    invoke-static {v4}, Lcom/huawei/common/applog/a;->f(Lcom/huawei/common/applog/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/common/applog/bean/a;

    .line 202
    if-eqz v5, :cond_0

    .line 204
    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/common/applog/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 205
    invoke-static {}, Lcom/huawei/common/applog/c;->a()V

    goto/16 :goto_2

    .line 207
    :cond_0
    const-string v0, "AppLogManager"

    const-string v1, "PrintWoker poll timeout , shutdown"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    invoke-static {}, Lcom/huawei/common/applog/c;->a()V

    .line 212
    invoke-static {v4}, Lcom/huawei/common/applog/a;->f(Lcom/huawei/common/applog/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/common/applog/bean/a;

    .line 213
    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/common/applog/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 214
    invoke-static {}, Lcom/huawei/common/applog/c;->a()V

    goto :goto_2

    .line 218
    :cond_1
    invoke-static {v4}, Lcom/huawei/common/applog/a;->f(Lcom/huawei/common/applog/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3c

    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/common/applog/bean/a;

    .line 219
    if-eqz v5, :cond_2

    .line 221
    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/common/applog/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 223
    :cond_2
    const-string v0, "AppLogManager"

    const-string v1, "PrintWoker poll timeout , shutdown"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    const-string v0, "I"

    const-string v1, "AppLogManager"

    const-string v2, "PrintWoker poll timeout , shutdown"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/common/applog/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 227
    invoke-static {}, Lcom/huawei/common/applog/c;->a()V

    .line 228
    invoke-static {v4}, Lcom/huawei/common/applog/a;->f(Lcom/huawei/common/applog/a;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/common/applog/bean/a;

    .line 229
    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/common/applog/bean/a;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/common/applog/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_3

    .line 242
    :goto_2
    goto/16 :goto_1

    .line 233
    :catch_1
    move-exception v5

    .line 234
    const-string v0, "AppLogManager"

    const-string v1, "PrintWoker InterruptedException"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    goto :goto_3

    .line 236
    :catch_2
    move-exception v5

    .line 237
    const-string v0, "AppLogManager"

    const-string v1, "PrintWoker IllegalMonitorStateException"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    goto :goto_3

    .line 239
    :catch_3
    move-exception v5

    .line 240
    const-string v0, "AppLogManager"

    const-string v1, "PrintWoker Error"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    .line 251
    :cond_3
    :goto_3
    const-string v0, "AppLogManager"

    const-string v1, "PrintWoker end."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    const-string v0, "I"

    const-string v1, "AppLogManager"

    const-string v2, "PrintWoker end."

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/common/applog/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 253
    invoke-static {}, Lcom/huawei/common/applog/c;->a()V

    .line 254
    iget-object v0, p0, Lcom/huawei/common/applog/a$a;->a:Lcom/huawei/common/applog/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/common/applog/a;->a(Lcom/huawei/common/applog/a;Z)Z

    .line 255
    return-void
.end method
