.class public abstract Lcom/huawei/hms/support/api/c;
.super Lcom/huawei/hms/support/api/client/InnerPendingResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/support/api/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:Lcom/huawei/hms/support/api/client/Result;T::Lcom/huawei/hms/core/aidl/IMessageEntity;>Lcom/huawei/hms/support/api/client/InnerPendingResult<TR;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/concurrent/CountDownLatch;

.field private b:Lcom/huawei/hms/support/api/client/Result;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/hms/support/api/client/ApiClient;>;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:J

.field protected transport:Lcom/huawei/hms/support/api/transport/DatagramTransport;


# direct methods
.method public constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 2

    .line 72
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/InnerPendingResult;-><init>()V

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->transport:Lcom/huawei/hms/support/api/transport/DatagramTransport;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->d:Ljava/lang/String;

    .line 64
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hms/support/api/c;->e:J

    .line 73
    iput-object p2, p0, Lcom/huawei/hms/support/api/c;->d:Ljava/lang/String;

    .line 74
    invoke-virtual {p0}, Lcom/huawei/hms/support/api/c;->getResponseType()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/huawei/hms/support/api/c;->a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)V

    .line 75
    return-void
.end method

.method public constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class<TT;>;)V"
        }
    .end annotation

    .line 85
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/InnerPendingResult;-><init>()V

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->transport:Lcom/huawei/hms/support/api/transport/DatagramTransport;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->d:Ljava/lang/String;

    .line 64
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hms/support/api/c;->e:J

    .line 86
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hms/support/api/c;->a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)V

    .line 87
    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/support/api/c;)Ljava/util/concurrent/CountDownLatch;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->a:Ljava/util/concurrent/CountDownLatch;

    return-object v0
.end method

.method private a(I)V
    .locals 14

    .line 424
    invoke-static {}, Lcom/huawei/hms/support/b/a;->a()Lcom/huawei/hms/support/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/b/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 426
    return-void

    .line 429
    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hms/support/api/client/ApiClient;

    .line 431
    if-nez v7, :cond_1

    .line 432
    return-void

    .line 436
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->d:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lcom/huawei/hms/support/api/c;->e:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 437
    :cond_2
    return-void

    .line 439
    :cond_3
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 441
    const-string v0, "package"

    invoke-interface {v7}, Lcom/huawei/hms/support/api/client/ApiClient;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    const-string v0, "sdk_ver"

    const v1, 0x13a59d4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    const/4 v9, 0x0

    .line 448
    invoke-interface {v7}, Lcom/huawei/hms/support/api/client/ApiClient;->getSubAppInfo()Lcom/huawei/hms/support/api/client/SubAppInfo;

    move-result-object v10

    .line 449
    if-eqz v10, :cond_4

    .line 450
    invoke-virtual {v10}, Lcom/huawei/hms/support/api/client/SubAppInfo;->getSubAppID()Ljava/lang/String;

    move-result-object v9

    .line 453
    :cond_4
    if-nez v9, :cond_5

    .line 454
    invoke-interface {v7}, Lcom/huawei/hms/support/api/client/ApiClient;->getAppID()Ljava/lang/String;

    move-result-object v9

    .line 456
    :cond_5
    const-string v0, "app_id"

    invoke-interface {v8, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->d:Ljava/lang/String;

    const-string v1, "\\."

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 460
    array-length v0, v11

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 461
    const-string v0, "service"

    const/4 v1, 0x0

    aget-object v1, v11, v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    const-string v0, "api_name"

    const/4 v1, 0x1

    aget-object v1, v11, v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    :cond_6
    const-string v0, "result"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/hms/support/api/c;->e:J

    sub-long v12, v0, v2

    .line 469
    const-string v0, "cost_time"

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    invoke-static {}, Lcom/huawei/hms/support/b/a;->a()Lcom/huawei/hms/support/b/a;

    move-result-object v0

    invoke-interface {v7}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "HMS_SDK_API_CALL"

    invoke-virtual {v0, v1, v2, v8}, Lcom/huawei/hms/support/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 474
    invoke-interface {v7}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {v7}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "hms/config.txt"

    invoke-static {v1, v2}, Lcom/huawei/hms/update/provider/UpdateProvider;->getLocalFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 475
    invoke-interface {v7}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "hms/HwMobileServiceReport.txt"

    invoke-static {v2, v3}, Lcom/huawei/hms/update/provider/UpdateProvider;->getLocalFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hms/support/api/c;->d:Ljava/lang/String;

    iget-wide v4, p0, Lcom/huawei/hms/support/api/c;->e:J

    move v6, p1

    .line 474
    invoke-static/range {v0 .. v6}, Lcom/huawei/hms/c/b;->a(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Ljava/lang/String;JI)V

    .line 476
    return-void
.end method

.method private a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 9

    .line 288
    invoke-direct {p0, p1}, Lcom/huawei/hms/support/api/c;->a(I)V

    .line 289
    const-string v0, "PendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setResult:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    const/4 v3, 0x0

    .line 293
    if-eqz p2, :cond_0

    instance-of v0, p2, Lcom/huawei/hms/core/aidl/AbstractMessageEntity;

    if-eqz v0, :cond_0

    .line 294
    move-object v0, p2

    check-cast v0, Lcom/huawei/hms/core/aidl/AbstractMessageEntity;

    invoke-virtual {v0}, Lcom/huawei/hms/core/aidl/AbstractMessageEntity;->getCommonStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v3

    .line 297
    :cond_0
    if-nez p1, :cond_1

    .line 298
    invoke-virtual {p0, p2}, Lcom/huawei/hms/support/api/c;->onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    goto :goto_0

    .line 300
    :cond_1
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/api/c;->onError(I)Lcom/huawei/hms/support/api/client/Result;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    .line 304
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    if-eqz v0, :cond_3

    .line 305
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/client/Result;->getStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v4

    .line 306
    if-eqz v4, :cond_3

    if-eqz v3, :cond_3

    .line 307
    invoke-virtual {v4}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v5

    .line 308
    invoke-virtual {v4}, Lcom/huawei/hms/support/api/client/Status;->getStatusMessage()Ljava/lang/String;

    move-result-object v6

    .line 309
    invoke-virtual {v3}, Lcom/huawei/hms/support/api/client/Status;->getStatusCode()I

    move-result v7

    .line 310
    invoke-virtual {v3}, Lcom/huawei/hms/support/api/client/Status;->getStatusMessage()Ljava/lang/String;

    move-result-object v8

    .line 312
    if-eq v5, v7, :cond_2

    .line 313
    const-string v0, "PendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "rstStatus code ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") is not equal commonStatus code ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    const-string v0, "PendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "rstStatus msg ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") is not equal commonStatus msg ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 315
    :cond_2
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 316
    const-string v0, "PendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "rstStatus msg ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") is not equal commonStatus msg ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    new-instance v1, Lcom/huawei/hms/support/api/client/Status;

    invoke-virtual {v4}, Lcom/huawei/hms/support/api/client/Status;->getResolution()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-direct {v1, v5, v8, v2}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/api/client/Result;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 321
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/support/api/c;ILcom/huawei/hms/core/aidl/IMessageEntity;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/huawei/hms/support/api/c;->a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-void
.end method

.method private a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class<TT;>;)V"
        }
    .end annotation

    .line 91
    const-string v0, "PendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "init uri:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    iput-object p2, p0, Lcom/huawei/hms/support/api/c;->d:Ljava/lang/String;

    .line 94
    if-nez p1, :cond_0

    .line 95
    const-string v0, "PendingResultImpl"

    const-string v1, "client is null"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "apiClient cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->c:Ljava/lang/ref/WeakReference;

    .line 100
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->a:Ljava/util/concurrent/CountDownLatch;

    .line 104
    :try_start_0
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getTransportName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 105
    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/Class;

    const-class v0, Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-class v0, Lcom/huawei/hms/core/aidl/IMessageEntity;

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-class v0, Ljava/lang/Class;

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 109
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const/4 v2, 0x2

    aput-object p4, v1, v2

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/support/api/transport/DatagramTransport;

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->transport:Lcom/huawei/hms/support/api/transport/DatagramTransport;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    goto :goto_0

    .line 112
    :catch_0
    move-exception v3

    .line 116
    const-string v0, "PendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gen transport error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Instancing transport exception, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 119
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/hms/support/api/c;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    return-object v0
.end method


# virtual methods
.method public final await()Lcom/huawei/hms/support/api/client/Result;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    .line 141
    const-string v0, "PendingResultImpl"

    const-string v1, "await"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 143
    const-string v0, "PendingResultImpl"

    const-string v1, "await in main thread"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "await must not be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 147
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hms/support/api/c;->awaitOnAnyThread()Lcom/huawei/hms/support/api/client/Result;

    move-result-object v0

    return-object v0
.end method

.method public await(JLjava/util/concurrent/TimeUnit;)Lcom/huawei/hms/support/api/client/Result;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/concurrent/TimeUnit;)TR;"
        }
    .end annotation

    .line 193
    const-string v0, "PendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "await timeout:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " unit:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Ljava/util/concurrent/TimeUnit;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 195
    const-string v0, "PendingResultImpl"

    const-string v1, "await in main thread"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "await must not be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 199
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/hms/support/api/c;->awaitOnAnyThread(JLjava/util/concurrent/TimeUnit;)Lcom/huawei/hms/support/api/client/Result;

    move-result-object v0

    return-object v0
.end method

.method public final awaitOnAnyThread()Lcom/huawei/hms/support/api/client/Result;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    .line 157
    const-string v0, "PendingResultImpl"

    const-string v1, "awaitOnAnyThread"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hms/support/api/c;->e:J

    .line 160
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hms/support/api/client/ApiClient;

    .line 161
    invoke-virtual {p0, v2}, Lcom/huawei/hms/support/api/c;->checkApiClient(Lcom/huawei/hms/support/api/client/ApiClient;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 162
    const-string v0, "PendingResultImpl"

    const-string v1, "client invalid"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    const v0, 0x3611c81b

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hms/support/api/c;->a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    return-object v0

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->transport:Lcom/huawei/hms/support/api/transport/DatagramTransport;

    new-instance v1, Lcom/huawei/hms/support/api/d;

    invoke-direct {v1, p0}, Lcom/huawei/hms/support/api/d;-><init>(Lcom/huawei/hms/support/api/c;)V

    invoke-interface {v0, v2, v1}, Lcom/huawei/hms/support/api/transport/DatagramTransport;->send(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/transport/DatagramTransport$a;)V

    .line 176
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    goto :goto_0

    .line 177
    :catch_0
    move-exception v3

    .line 178
    const-string v0, "PendingResultImpl"

    const-string v1, "await in anythread InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    const v0, 0x3611c819

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hms/support/api/c;->a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 182
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    return-object v0
.end method

.method public final awaitOnAnyThread(JLjava/util/concurrent/TimeUnit;)Lcom/huawei/hms/support/api/client/Result;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/concurrent/TimeUnit;)TR;"
        }
    .end annotation

    .line 211
    const-string v0, "PendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "awaitOnAnyThread timeout:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " unit:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Ljava/util/concurrent/TimeUnit;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hms/support/api/c;->e:J

    .line 214
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/support/api/client/ApiClient;

    .line 215
    invoke-virtual {p0, v3}, Lcom/huawei/hms/support/api/c;->checkApiClient(Lcom/huawei/hms/support/api/client/ApiClient;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 216
    const-string v0, "PendingResultImpl"

    const-string v1, "client invalid"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    const v0, 0x3611c81b

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hms/support/api/c;->a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    return-object v0

    .line 221
    :cond_0
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 222
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->transport:Lcom/huawei/hms/support/api/transport/DatagramTransport;

    new-instance v1, Lcom/huawei/hms/support/api/e;

    invoke-direct {v1, p0, v4}, Lcom/huawei/hms/support/api/e;-><init>(Lcom/huawei/hms/support/api/c;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-interface {v0, v3, v1}, Lcom/huawei/hms/support/api/transport/DatagramTransport;->post(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/transport/DatagramTransport$a;)V

    .line 233
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v5

    .line 234
    if-nez v5, :cond_1

    .line 235
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 236
    const v0, 0x3611c81c

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hms/support/api/c;->a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    :cond_1
    goto :goto_0

    .line 238
    :catch_0
    move-exception v5

    .line 239
    const-string v0, "PendingResultImpl"

    const-string v1, "awaitOnAnyThread InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    const v0, 0x3611c819

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hms/support/api/c;->a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 243
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    return-object v0
.end method

.method protected checkApiClient(Lcom/huawei/hms/support/api/client/ApiClient;)Z
    .locals 1

    .line 367
    if-eqz p1, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/client/InnerApiClient;

    invoke-interface {v0}, Lcom/huawei/hms/support/api/client/InnerApiClient;->innerIsConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected getResponseType()Ljava/lang/Class;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/lang/Class<TT;>;"
        }
    .end annotation

    .line 124
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 125
    if-eqz v2, :cond_0

    .line 126
    move-object v0, v2

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v3, v0, v1

    .line 127
    if-eqz v3, :cond_0

    .line 128
    move-object v0, v3

    check-cast v0, Ljava/lang/Class;

    return-object v0

    .line 131
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TR;"
        }
    .end annotation
.end method

.method protected onError(I)Lcom/huawei/hms/support/api/client/Result;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TR;"
        }
    .end annotation

    .line 334
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v3

    .line 335
    const/4 v4, 0x0

    .line 337
    if-eqz v3, :cond_0

    .line 339
    move-object v0, v3

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v4, v0, v1

    .line 342
    :cond_0
    const/4 v5, 0x0

    .line 343
    if-eqz v4, :cond_1

    .line 345
    invoke-static {v4}, Lcom/huawei/hms/support/a/a;->a(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v5

    .line 348
    :cond_1
    if-eqz v5, :cond_2

    .line 350
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/support/api/client/Result;

    iput-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    .line 351
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    new-instance v1, Lcom/huawei/hms/support/api/client/Status;

    invoke-direct {v1, p1}, Lcom/huawei/hms/support/api/client/Status;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/api/client/Result;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 355
    goto :goto_0

    .line 352
    :catch_0
    move-exception v6

    .line 353
    const-string v0, "PendingResultImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "on Error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    const/4 v0, 0x0

    return-object v0

    .line 358
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    return-object v0
.end method

.method public final setResultCallback(Landroid/os/Looper;Lcom/huawei/hms/support/api/client/ResultCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Looper;Lcom/huawei/hms/support/api/client/ResultCallback<TR;>;)V"
        }
    .end annotation

    .line 264
    const-string v0, "PendingResultImpl"

    const-string v1, "setResultCallback"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hms/support/api/c;->e:J

    .line 266
    new-instance v2, Lcom/huawei/hms/support/api/c$a;

    if-nez p1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {v2, v0}, Lcom/huawei/hms/support/api/c$a;-><init>(Landroid/os/Looper;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/support/api/client/ApiClient;

    .line 269
    invoke-virtual {p0, v3}, Lcom/huawei/hms/support/api/c;->checkApiClient(Lcom/huawei/hms/support/api/client/ApiClient;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 270
    const-string v0, "PendingResultImpl"

    const-string v1, "client is invalid"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    const v0, 0x3611c81b

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/hms/support/api/c;->a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->b:Lcom/huawei/hms/support/api/client/Result;

    invoke-virtual {v2, p2, v0}, Lcom/huawei/hms/support/api/c$a;->a(Lcom/huawei/hms/support/api/client/ResultCallback;Lcom/huawei/hms/support/api/client/Result;)V

    .line 273
    return-void

    .line 276
    :cond_1
    iget-object v0, p0, Lcom/huawei/hms/support/api/c;->transport:Lcom/huawei/hms/support/api/transport/DatagramTransport;

    new-instance v1, Lcom/huawei/hms/support/api/f;

    invoke-direct {v1, p0, v2, p2}, Lcom/huawei/hms/support/api/f;-><init>(Lcom/huawei/hms/support/api/c;Lcom/huawei/hms/support/api/c$a;Lcom/huawei/hms/support/api/client/ResultCallback;)V

    invoke-interface {v0, v3, v1}, Lcom/huawei/hms/support/api/transport/DatagramTransport;->post(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/transport/DatagramTransport$a;)V

    .line 283
    return-void
.end method

.method public final setResultCallback(Lcom/huawei/hms/support/api/client/ResultCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ResultCallback<TR;>;)V"
        }
    .end annotation

    .line 253
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/huawei/hms/support/api/c;->setResultCallback(Landroid/os/Looper;Lcom/huawei/hms/support/api/client/ResultCallback;)V

    .line 254
    return-void
.end method
