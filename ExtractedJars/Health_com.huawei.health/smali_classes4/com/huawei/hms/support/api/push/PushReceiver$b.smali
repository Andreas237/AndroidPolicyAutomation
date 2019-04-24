.class Lcom/huawei/hms/support/api/push/PushReceiver$b;
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
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/support/api/push/PushReceiver;

.field private b:Landroid/content/Context;

.field private c:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 352
    iput-object p1, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 353
    iput-object p2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->b:Landroid/content/Context;

    .line 354
    iput-object p3, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->c:Landroid/content/Intent;

    .line 355
    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 359
    new-instance v4, Lcom/huawei/hms/support/api/push/b/a/a/c;

    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->b:Landroid/content/Context;

    const-string v1, "push_switch"

    invoke-direct {v4, v0, v1}, Lcom/huawei/hms/support/api/push/b/a/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 360
    const-string v0, "normal_msg_enable"

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;->a(Ljava/lang/String;)Z

    move-result v5

    .line 362
    if-eqz v5, :cond_0

    .line 363
    const-string v0, "PushReceiver"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " disable pass by push message, abandon it"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->c:Landroid/content/Intent;

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hms/support/api/push/PushReceiver;->a(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    .line 365
    return-void

    .line 367
    :cond_0
    const-string v0, "PushReceiver"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " receive pass by push message"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v1, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->c:Landroid/content/Intent;

    const-string v3, "0"

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hms/support/api/push/PushReceiver;->a(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    .line 372
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->c:Landroid/content/Intent;

    const-string v1, "msg_data"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v6

    .line 373
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->c:Landroid/content/Intent;

    const-string v1, "device_token"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v7

    .line 375
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    .line 376
    :cond_1
    const-string v0, "PushReceiver"

    const-string v1, "PushReceiver receive a message, but message is empty."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 377
    return-void

    .line 380
    :cond_2
    :try_start_1
    new-instance v8, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-direct {v8, v7, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 381
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 382
    const-string v0, "deviceToken"

    invoke-virtual {v9, v0, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    const-string v0, "pushMsg"

    invoke-virtual {v9, v0, v6}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 384
    const-string v0, "receiveType"

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->c:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/PushReceiver$d;->ordinal()I

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 386
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v0, v0, Lcom/huawei/hms/support/api/push/PushReceiver;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/huawei/hms/support/api/push/PushReceiver$a;

    iget-object v2, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->a:Lcom/huawei/hms/support/api/push/PushReceiver;

    iget-object v3, p0, Lcom/huawei/hms/support/api/push/PushReceiver$b;->b:Landroid/content/Context;

    invoke-direct {v1, v2, v3, v9}, Lcom/huawei/hms/support/api/push/PushReceiver$a;-><init>(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 394
    goto :goto_0

    .line 387
    :catch_0
    move-exception v6

    .line 388
    const-string v0, "PushReceiver"

    const-string v1, "encode token error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    return-void

    .line 390
    :catch_1
    move-exception v6

    .line 391
    const-string v0, "PushReceiver"

    const-string v1, "execute task error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    goto :goto_0

    .line 392
    :catch_2
    move-exception v6

    .line 393
    const-string v0, "PushReceiver"

    const-string v1, "handle push message error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 395
    :goto_0
    return-void
.end method
