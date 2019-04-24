.class public Lo/fje;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/fje;


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    const/4 v0, 0x0

    sput-object v0, Lo/fje;->a:Lo/fje;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/fje;->b:Landroid/content/Context;

    .line 37
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/fje;
    .locals 3

    .line 26
    sget-object v0, Lo/fje;->a:Lo/fje;

    if-nez v0, :cond_1

    .line 27
    const-class v1, Lo/fje;

    monitor-enter v1

    .line 28
    :try_start_0
    sget-object v0, Lo/fje;->a:Lo/fje;

    if-nez v0, :cond_0

    .line 29
    new-instance v0, Lo/fje;

    invoke-direct {v0, p0}, Lo/fje;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/fje;->a:Lo/fje;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 33
    :cond_1
    :goto_0
    sget-object v0, Lo/fje;->a:Lo/fje;

    return-object v0
.end method

.method private e()Z
    .locals 9

    .line 89
    iget-object v0, p0, Lo/fje;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 90
    const-string v0, "MarketMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Network is not Connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const/4 v0, 0x0

    return v0

    .line 93
    :cond_0
    iget-object v0, p0, Lo/fje;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "market_comment_status"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 95
    const-wide/16 v5, 0x0

    .line 97
    :try_start_0
    iget-object v0, p0, Lo/fje;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "market_comment_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v5, v0

    .line 102
    goto :goto_0

    .line 99
    :catch_0
    move-exception v7

    .line 101
    const-string v0, "MarketMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseLong Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v7, v0, v5

    .line 104
    const-string v0, "MarketMgr"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MarketCommentCloud_shouldShow() commentStatus "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " spaceTime"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "lastShowTime "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const-wide v0, 0x757b12c00L

    cmp-long v0, v7, v0

    if-lez v0, :cond_1

    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    .line 44
    invoke-direct {p0}, Lo/fje;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 45
    const-string v0, "MarketMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "should not show"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void

    .line 48
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    const-string v0, "MarketMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOversea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    return-void

    .line 53
    :cond_1
    iget-object v0, p0, Lo/fje;->b:Landroid/content/Context;

    const-string v1, "com.huawei.appmarket"

    invoke-static {v0, v1}, Lo/fjj;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/fje;->b:Landroid/content/Context;

    const-string v1, "com.tencent.android.qqdownloader"

    invoke-static {v0, v1}, Lo/fjj;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/fje;->b:Landroid/content/Context;

    const-string v1, "com.qihoo.appstore"

    .line 54
    invoke-static {v0, v1}, Lo/fjj;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/fje;->b:Landroid/content/Context;

    const-string v1, "com.baidu.appsearch"

    invoke-static {v0, v1}, Lo/fjj;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 55
    const-string v0, "MarketMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not installed Market"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    return-void

    .line 59
    :cond_2
    new-instance v0, Lo/fjn;

    invoke-direct {v0, p1}, Lo/fjn;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lo/fjn;->d()V

    .line 60
    iget-object v0, p0, Lo/fje;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/fjl;->d(Landroid/content/Context;)Lo/fjl;

    move-result-object v0

    invoke-virtual {v0}, Lo/fjl;->a()V

    .line 61
    return-void
.end method
