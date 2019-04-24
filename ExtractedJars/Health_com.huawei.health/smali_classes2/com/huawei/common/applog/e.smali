.class public Lcom/huawei/common/applog/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(I)I
    .locals 1

    .line 72
    if-gez p0, :cond_0

    .line 73
    const/4 p0, 0x0

    .line 75
    :cond_0
    const/16 v0, 0xf0

    if-le p0, v0, :cond_1

    .line 76
    const/16 p0, 0xf0

    .line 78
    :cond_1
    mul-int/lit16 v0, p0, 0x3e8

    return v0
.end method

.method static a(Landroid/content/Context;Lcom/huawei/common/applog/bean/Event;Landroid/os/Handler;)V
    .locals 2

    .line 25
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 26
    :cond_0
    const-string v0, "ReportApi"

    const-string v1, "context or event is empty!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    return-void

    .line 29
    :cond_1
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/common/applog/bean/b;->a(Lcom/huawei/common/applog/bean/Event;)Z

    .line 31
    invoke-static {}, Lcom/huawei/common/applog/bean/c;->a()Lcom/huawei/common/applog/bean/c;

    move-result-object v0

    new-instance v1, Lcom/huawei/common/applog/f;

    invoke-direct {v1, p0, p2}, Lcom/huawei/common/applog/f;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    invoke-virtual {v0, v1}, Lcom/huawei/common/applog/bean/c;->a(Ljava/lang/Runnable;)V

    .line 37
    return-void
.end method

.method static a(Landroid/content/Context;Z)V
    .locals 3

    .line 46
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->g()Ljava/util/concurrent/BlockingQueue;

    move-result-object v2

    .line 47
    invoke-interface {v2}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 48
    const-string v0, "ReportApi"

    const-string v1, "flushReport have data report"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/common/applog/g;

    invoke-direct {v1, p0, p1}, Lcom/huawei/common/applog/g;-><init>(Landroid/content/Context;Z)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 56
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 57
    invoke-static {}, Lcom/huawei/common/applog/bean/e;->a()Lcom/huawei/common/applog/bean/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/e;->d()V

    goto :goto_0

    .line 59
    :cond_0
    const-string v0, "ReportApi"

    const-string v1, "flushReport not have data report!!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->e()V

    .line 61
    invoke-static {}, Lcom/huawei/common/applog/bean/e;->a()Lcom/huawei/common/applog/bean/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/e;->d()V

    .line 63
    :goto_0
    return-void
.end method
