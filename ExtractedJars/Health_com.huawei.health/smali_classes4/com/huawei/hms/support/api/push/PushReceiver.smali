.class public abstract Lcom/huawei/hms/support/api/push/PushReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/support/api/push/PushReceiver$a;,
        Lcom/huawei/hms/support/api/push/PushReceiver$b;,
        Lcom/huawei/hms/support/api/push/PushReceiver$c;,
        Lcom/huawei/hms/support/api/push/PushReceiver$Event;,
        Lcom/huawei/hms/support/api/push/PushReceiver$d;,
        Lcom/huawei/hms/support/api/push/PushReceiver$BOUND_KEY;
    }
.end annotation


# instance fields
.field a:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 26
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 29
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 200
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/huawei/hms/support/api/push/PushReceiver$c;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/support/api/push/PushReceiver$c;-><init>(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    goto :goto_0

    .line 201
    :catch_0
    move-exception v2

    .line 202
    const-string v0, "PushReceiver"

    const-string v1, "handlePushTokenEvent execute task error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V
    .locals 4

    .line 457
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 458
    :cond_0
    return-void

    .line 460
    :cond_1
    const-string v0, "PushReceiver"

    const-string v1, "send response to frameworkPush that app receive the passby message"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    const/4 v2, 0x0

    .line 464
    const-string v0, "msgIdStr"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 467
    goto :goto_0

    .line 465
    :catch_0
    move-exception v3

    .line 466
    const-string v0, "PushReceiver"

    const-string v1, "responseToFrameworkPush error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Lcom/huawei/hms/support/api/push/b/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 469
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.huawei.android.push.intent.MSG_RESPONSE"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 470
    const-string v0, "msgIdStr"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 471
    const-string v0, "resultCode"

    invoke-virtual {v3, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 472
    const-string v0, "android"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 473
    const/16 v0, 0x20

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 474
    invoke-virtual {p1, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 476
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/push/PushReceiver;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method

.method private b(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 214
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/huawei/hms/support/api/push/PushReceiver$b;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/hms/support/api/push/PushReceiver$b;-><init>(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    goto :goto_0

    .line 215
    :catch_0
    move-exception v2

    .line 216
    const-string v0, "PushReceiver"

    const-string v1, "handlePushMessageEvent execute task error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    :goto_0
    return-void
.end method

.method private c(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 228
    const-string v0, "click"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 229
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 230
    const-string v0, "pushMsg"

    invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    const-string v0, "receiveType"

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->e:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/PushReceiver$d;->ordinal()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 232
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/huawei/hms/support/api/push/PushReceiver$a;

    invoke-direct {v1, p0, p1, v3}, Lcom/huawei/hms/support/api/push/PushReceiver$a;-><init>(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 237
    goto :goto_0

    .line 233
    :catch_0
    move-exception v2

    .line 234
    const-string v0, "PushReceiver"

    const-string v1, "execute task error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    goto :goto_0

    .line 235
    :catch_1
    move-exception v2

    .line 236
    const-string v0, "PushReceiver"

    const-string v1, "handle click event error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    :goto_0
    return-void
.end method

.method private d(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 248
    const-string v0, "clickBtn"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 249
    const-string v0, "notifyId"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 250
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 251
    const-string v0, "pushMsg"

    invoke-virtual {v4, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    const-string v0, "pushNotifyId"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 253
    const-string v0, "receiveType"

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->f:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/PushReceiver$d;->ordinal()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 254
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/huawei/hms/support/api/push/PushReceiver$a;

    invoke-direct {v1, p0, p1, v4}, Lcom/huawei/hms/support/api/push/PushReceiver$a;-><init>(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 259
    goto :goto_0

    .line 255
    :catch_0
    move-exception v2

    .line 256
    const-string v0, "PushReceiver"

    const-string v1, "execute task error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    goto :goto_0

    .line 257
    :catch_1
    move-exception v2

    .line 258
    const-string v0, "PushReceiver"

    const-string v1, "handleNotificationBtnOnclickEvent error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    :goto_0
    return-void
.end method

.method private e(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 270
    const-string v0, "push_state"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 271
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 272
    const-string v0, "pushState"

    invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 273
    const-string v0, "receiveType"

    sget-object v1, Lcom/huawei/hms/support/api/push/PushReceiver$d;->d:Lcom/huawei/hms/support/api/push/PushReceiver$d;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/PushReceiver$d;->ordinal()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 274
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/PushReceiver;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/huawei/hms/support/api/push/PushReceiver$a;

    invoke-direct {v1, p0, p1, v3}, Lcom/huawei/hms/support/api/push/PushReceiver$a;-><init>(Lcom/huawei/hms/support/api/push/PushReceiver;Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 279
    goto :goto_0

    .line 275
    :catch_0
    move-exception v2

    .line 276
    const-string v0, "PushReceiver"

    const-string v1, "execute task error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    goto :goto_0

    .line 277
    :catch_1
    move-exception v2

    .line 278
    const-string v0, "PushReceiver"

    const-string v1, "handlePushStateEvent error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    :goto_0
    return-void
.end method


# virtual methods
.method public onEvent(Landroid/content/Context;Lcom/huawei/hms/support/api/push/PushReceiver$Event;Landroid/os/Bundle;)V
    .locals 0

    .line 83
    return-void
.end method

.method public onPushMsg(Landroid/content/Context;[BLjava/lang/String;)V
    .locals 0

    .line 132
    return-void
.end method

.method public onPushMsg(Landroid/content/Context;[BLandroid/os/Bundle;)Z
    .locals 2

    .line 111
    const-string v1, ""

    .line 112
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 113
    const-string v0, "deviceToken"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 116
    :cond_0
    invoke-virtual {p0, p1, p2, v1}, Lcom/huawei/hms/support/api/push/PushReceiver;->onPushMsg(Landroid/content/Context;[BLjava/lang/String;)V

    .line 118
    const/4 v0, 0x1

    return v0
.end method

.method public onPushState(Landroid/content/Context;Z)V
    .locals 0

    .line 143
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 158
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 159
    :cond_0
    return-void

    .line 161
    :cond_1
    const-string v0, "PushReceiver"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "push receive broadcast message, Intent:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 163
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " pkgName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 164
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 161
    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v0, "TestIntent"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    goto :goto_0

    .line 168
    :catch_0
    move-exception v3

    .line 169
    const-string v0, "PushReceiver"

    const-string v1, "intent has some error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    return-void

    .line 173
    :goto_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    .line 174
    const-string v0, "com.huawei.android.push.intent.REGISTRATION"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "device_token"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 175
    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/support/api/push/PushReceiver;->a(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1

    .line 176
    :cond_2
    const-string v0, "com.huawei.android.push.intent.RECEIVE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "msg_data"

    .line 177
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 178
    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/support/api/push/PushReceiver;->b(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_1

    .line 179
    :cond_3
    const-string v0, "com.huawei.android.push.intent.CLICK"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "click"

    .line 180
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 181
    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/support/api/push/PushReceiver;->c(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_1

    .line 182
    :cond_4
    const-string v0, "com.huawei.android.push.intent.CLICK"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "clickBtn"

    .line 183
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 184
    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/support/api/push/PushReceiver;->d(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_1

    .line 185
    :cond_5
    const-string v0, "com.huawei.intent.action.PUSH_STATE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 186
    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/support/api/push/PushReceiver;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_1

    .line 188
    :cond_6
    const-string v0, "PushReceiver"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "message can\'t be recognised:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    :goto_1
    return-void
.end method

.method public onToken(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 154
    return-void
.end method

.method public onToken(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 96
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hms/support/api/push/PushReceiver;->onToken(Landroid/content/Context;Ljava/lang/String;)V

    .line 97
    return-void
.end method
