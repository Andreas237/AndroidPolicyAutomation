.class Lcom/huawei/hms/support/api/push/PushReceiver$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/push/PushReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/support/api/push/PushReceiver;

.field private b:Landroid/content/Context;

.field private c:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 286
    iput-object p1, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 287
    iput-object p2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->b:Landroid/content/Context;

    .line 288
    iput-object p3, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->c:Landroid/content/Intent;

    .line 289
    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 294
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->c:Landroid/content/Intent;

    const-string v1, "device_token"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v4

    .line 295
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->c:Landroid/content/Intent;

    const-string v1, "extra_notify_key"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 297
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 298
    const-string v0, "PushReceiver"

    const-string v1, "get a deviceToken, but it is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 299
    return-void

    .line 301
    :cond_0
    const-string v0, "PushReceiver"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "receive a push token: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    new-instance v6, Lcom/huawei/hms/support/api/push/b/a/a/c;

    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->b:Landroid/content/Context;

    const-string v1, "push_client_self_info"

    invoke-direct {v6, v0, v1}, Lcom/huawei/hms/support/api/push/b/a/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 305
    const-string v0, "reqTokenTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hms/support/api/push/b/a/a/c;->a(Ljava/lang/String;Ljava/lang/Long;)V

    .line 309
    new-instance v7, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-direct {v7, v4, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 311
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->b:Landroid/content/Context;

    const-string v1, "push_client_self_info"

    const-string v2, "token_info"

    invoke-static {v0, v1, v2}, Lcom/huawei/hms/support/api/push/b/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 314
    const-string v0, "push_notify_key"

    invoke-virtual {v6, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 316
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 317
    const-string v0, "PushReceiver"

    const-string v1, "notifyKey changed, refresh it"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    const-string v0, "push_notify_key"

    invoke-virtual {v6, v0, v5}, Lcom/huawei/hms/support/api/push/b/a/a/c;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 321
    :cond_1
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 322
    const-string v0, "PushReceiver"

    const-string v1, "receive a token, refresh the local token"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    const-string v0, "token_info"

    invoke-virtual {v6, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;->d(Ljava/lang/String;)Z

    .line 324
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->b:Landroid/content/Context;

    const-string v1, "push_client_self_info"

    const-string v2, "token_info"

    invoke-static {v0, v1, v2, v7}, Lcom/huawei/hms/support/api/push/b/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 328
    :cond_2
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 329
    const-string v0, "deviceToken"

    invoke-virtual {v10, v0, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    const-string v0, "pushMsg"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 331
    const-string v0, "receiveType"

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->b:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/PushReceiver$d;->ordinal()I

    move-result v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 332
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->c:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 333
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->c:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 336
    :cond_3
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v0, v0, Lcom/huawei/hms/support/api/push/PushReceiver;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/huawei/hms/support/api/push/PushReceiver$a;

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v3, p0, Lcom/huawei/hms/support/api/push/PushReceiver$c;->b:Landroid/content/Context;

    invoke-direct {v1, v2, v3, v10}, Lcom/huawei/hms/support/api/push/PushReceiver$a;-><init>(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 344
    goto :goto_0

    .line 337
    :catch_0
    move-exception v4

    .line 338
    const-string v0, "PushReceiver"

    const-string v1, "encode token error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    return-void

    .line 340
    :catch_1
    move-exception v4

    .line 341
    const-string v0, "PushReceiver"

    const-string v1, "execute task error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    goto :goto_0

    .line 342
    :catch_2
    move-exception v4

    .line 343
    const-string v0, "PushReceiver"

    const-string v1, "handle push token error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    :goto_0
    return-void
.end method
