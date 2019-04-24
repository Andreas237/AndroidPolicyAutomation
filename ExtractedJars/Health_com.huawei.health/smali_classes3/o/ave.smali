.class public final Lo/ave;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/ave;


# instance fields
.field private a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 131
    new-instance v0, Lo/ave;

    invoke-direct {v0}, Lo/ave;-><init>()V

    sput-object v0, Lo/ave;->e:Lo/ave;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ave;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 95
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/ave;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 137
    return-void
.end method

.method static synthetic a(Lo/ave;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/ave;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method public static b()Lo/ave;
    .locals 1

    .line 145
    sget-object v0, Lo/ave;->e:Lo/ave;

    return-object v0
.end method

.method static synthetic d(Lo/ave;Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/ave;->h(Ljava/lang/String;)V

    return-void
.end method

.method private f(Ljava/lang/String;)V
    .locals 3

    .line 223
    invoke-direct {p0, p1}, Lo/ave;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 224
    const-string v0, "PushManager"

    const-string v1, "valid PushToken, no need to report sns server."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    return-void

    .line 228
    :cond_0
    iget-object v0, p0, Lo/ave;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    return-void

    .line 234
    :cond_1
    const-string v0, ""

    invoke-virtual {p0, v0}, Lo/ave;->c(Ljava/lang/String;)V

    .line 237
    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    invoke-virtual {v0}, Lo/azc;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 238
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v2

    .line 239
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v0}, Lo/awn;->a()V

    .line 241
    if-eqz v2, :cond_2

    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v2}, Lo/axr;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/awn;->d(I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 243
    :cond_2
    iget-object v0, p0, Lo/ave;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 244
    return-void

    .line 246
    :cond_3
    invoke-direct {p0, p1}, Lo/ave;->h(Ljava/lang/String;)V

    .line 247
    goto :goto_0

    .line 250
    :cond_4
    invoke-direct {p0, p1}, Lo/ave;->g(Ljava/lang/String;)V

    .line 252
    :goto_0
    return-void
.end method

.method private g(Ljava/lang/String;)V
    .locals 1

    .line 260
    new-instance v0, Lo/ave$4;

    invoke-direct {v0, p0, p1}, Lo/ave$4;-><init>(Lo/ave;Ljava/lang/String;)V

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 275
    return-void
.end method

.method private g()Z
    .locals 4

    .line 173
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "reportSNSPushTokenDigest"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 174
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    const/4 v0, 0x1

    return v0

    .line 178
    :cond_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isPushTokenReportSucc"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private h(Ljava/lang/String;)V
    .locals 6

    .line 283
    const/4 v3, 0x0

    .line 285
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v4

    .line 286
    if-eqz v4, :cond_0

    .line 287
    invoke-virtual {v4}, Lo/axr;->a()Ljava/lang/String;

    move-result-object v3

    .line 289
    :cond_0
    new-instance v5, Lcom/huawei/health/sns/server/push/UpdatePushTokenRequest;

    invoke-direct {v5, v3}, Lcom/huawei/health/sns/server/push/UpdatePushTokenRequest;-><init>(Ljava/lang/String;)V

    .line 290
    invoke-virtual {v5, p1}, Lcom/huawei/health/sns/server/push/UpdatePushTokenRequest;->setPushToken(Ljava/lang/String;)V

    .line 292
    const-string v0, "PushManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/push/UpdatePushTokenRequest;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    new-instance v0, Lo/ave$5;

    invoke-direct {v0, p0, p1}, Lo/ave$5;-><init>(Lo/ave;Ljava/lang/String;)V

    invoke-static {v5, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/server/SNSRequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;

    .line 305
    return-void
.end method

.method private i(Ljava/lang/String;)Z
    .locals 7

    .line 411
    invoke-static {p1}, Lo/bor;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 413
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "reportSNSPushTokenDigest"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 415
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 417
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 420
    :cond_1
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "pushToken"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 421
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isPushTokenReportSucc"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v6

    .line 423
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v6, :cond_2

    .line 425
    const-string v0, "PushManager"

    const-string v1, "valid old sns sp key PushToken success,no need to report."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    invoke-virtual {p0, p1}, Lo/ave;->c(Ljava/lang/String;)V

    .line 429
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "pushToken"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 430
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isPushTokenReportSucc"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 431
    const/4 v0, 0x0

    return v0

    .line 434
    :cond_2
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "pushToken"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 435
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isPushTokenReportSucc"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 436
    const-string v0, "PushManager"

    const-string v1, "valid old sns sp key PushToken failed,need to report."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    const/4 v0, 0x1

    return v0
.end method

.method private k(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 359
    const-string v1, ""

    .line 360
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 361
    invoke-static {p1}, Lo/bor;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 363
    :cond_0
    return-object v1
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 314
    const-string v0, "pushDispatchBundleKey"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 315
    if-eqz v2, :cond_2

    .line 316
    const-string v0, "pushMsg"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 317
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 318
    return-void

    .line 321
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 322
    invoke-static {v4, v3}, Lo/avl;->c(Lorg/json/JSONObject;Ljava/lang/String;)Lo/avm;

    move-result-object v5

    .line 323
    if-eqz v5, :cond_1

    .line 324
    invoke-virtual {v5, p1}, Lo/avm;->b(Landroid/content/Context;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 328
    :cond_1
    goto :goto_0

    .line 326
    :catch_0
    move-exception v4

    .line 327
    const-string v0, "PushManager"

    const-string v1, "pushOnMessage exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    :cond_2
    :goto_0
    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 5

    .line 103
    if-nez p1, :cond_0

    .line 104
    return-void

    .line 108
    :cond_0
    :try_start_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v2

    .line 109
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 111
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    invoke-static {v3, p1}, Lo/avl;->c(Lorg/json/JSONObject;Ljava/lang/String;)Lo/avm;

    move-result-object v4

    .line 113
    if-eqz v4, :cond_1

    .line 114
    invoke-virtual {v4, v2}, Lo/avm;->d(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 125
    :cond_1
    goto :goto_0

    .line 117
    :catch_0
    move-exception v2

    .line 118
    const-string v0, "PushManager"

    const-string v1, "pushOnMessage IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "process message exception:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpj;->d(Ljava/lang/String;)V

    .line 125
    goto :goto_0

    .line 121
    :catch_1
    move-exception v2

    .line 122
    const-string v0, "PushManager"

    const-string v1, "pushOnMessage JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "process message JSONException:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpj;->d(Ljava/lang/String;)V

    .line 126
    :goto_0
    return-void
.end method

.method public a()Z
    .locals 5

    .line 448
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "reportSNSPushTokenDigest"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 449
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 450
    const/4 v0, 0x1

    return v0

    .line 454
    :cond_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "report_IM_PushToken"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 455
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method declared-synchronized b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    .line 201
    :try_start_0
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 202
    const-string v0, "PushManager"

    const-string v1, "account not login."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    monitor-exit p0

    return-void

    .line 205
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 207
    iget-object v0, p0, Lo/ave;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 209
    invoke-direct {p0, p2}, Lo/ave;->f(Ljava/lang/String;)V

    .line 211
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 213
    :cond_1
    const-string v0, "PushManager"

    const-string v1, "reportToken() pushToken is empty!!!!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .line 339
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "reportIMPushTokenDigest"

    invoke-direct {p0, p1}, Lo/ave;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 340
    return-void
.end method

.method public declared-synchronized c()V
    .locals 3

    monitor-enter p0

    .line 484
    const-string v0, "friend_invite_push_message"

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lo/avj;->c(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 485
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .line 349
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "reportSNSPushTokenDigest"

    invoke-direct {p0, p1}, Lo/ave;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 350
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 163
    iget-object v0, p0, Lo/ave;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 164
    return-void
.end method

.method public d()Z
    .locals 3

    .line 187
    invoke-direct {p0}, Lo/ave;->g()Z

    move-result v1

    .line 188
    invoke-virtual {p0}, Lo/ave;->a()Z

    move-result v2

    .line 190
    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lo/ave;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public declared-synchronized e(JJ)V
    .locals 7

    monitor-enter p0

    .line 499
    :try_start_0
    invoke-static {}, Lo/atf;->d()Lo/atf;

    move-result-object v0

    invoke-virtual {v0}, Lo/atf;->c()Ljava/util/ArrayList;

    move-result-object v2

    .line 500
    const/4 v3, 0x0

    .line 502
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 503
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 504
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    .line 505
    const/4 v3, 0x1

    .line 506
    goto :goto_1

    .line 508
    :cond_0
    goto :goto_0

    .line 511
    :cond_1
    :goto_1
    if-nez v3, :cond_4

    .line 512
    invoke-virtual {p0}, Lo/ave;->h()Ljava/util/List;

    move-result-object v4

    .line 513
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/avh;

    .line 514
    invoke-virtual {v6}, Lo/avh;->c()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-nez v0, :cond_2

    .line 515
    invoke-interface {v4, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 516
    goto :goto_3

    .line 518
    :cond_2
    goto :goto_2

    .line 519
    :cond_3
    :goto_3
    new-instance v5, Lo/avh;

    invoke-direct {v5, p1, p2, p3, p4}, Lo/avh;-><init>(JJ)V

    .line 520
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 521
    const-string v0, "group_invite_push_message"

    invoke-static {v0, v4}, Lo/avj;->c(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 523
    :cond_4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e(Ljava/lang/String;)Z
    .locals 6

    .line 374
    invoke-static {p1}, Lo/bor;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 376
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "reportIMPushTokenDigest"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 377
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 379
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 382
    :cond_1
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "report_IM_PushToken"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 383
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 385
    const/4 v0, 0x1

    return v0

    .line 387
    :cond_2
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 389
    invoke-virtual {p0, p1}, Lo/ave;->b(Ljava/lang/String;)V

    .line 391
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "report_IM_PushToken"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 392
    const-string v0, "PushManager"

    const-string v1, "valid old im sp key PushToken success,no need to report."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    const/4 v0, 0x0

    return v0

    .line 396
    :cond_3
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "report_IM_PushToken"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 397
    const-string v0, "PushManager"

    const-string v1, "valid old im sp key PushToken failed,need to report."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    const/4 v0, 0x1

    return v0
.end method

.method public declared-synchronized h()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/avh;>;"
        }
    .end annotation

    monitor-enter p0

    .line 537
    const-string v0, "group_invite_push_message"

    :try_start_0
    invoke-static {v0}, Lo/avj;->b(Ljava/lang/String;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized i()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/avh;>;"
        }
    .end annotation

    monitor-enter p0

    .line 488
    const-string v0, "friend_invite_push_message"

    :try_start_0
    invoke-static {v0}, Lo/avj;->b(Ljava/lang/String;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized k()V
    .locals 3

    monitor-enter p0

    .line 530
    const-string v0, "group_invite_push_message"

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lo/avj;->c(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 531
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method
