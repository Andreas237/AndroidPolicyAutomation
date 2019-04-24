.class public final Lcom/huawei/common/applog/bean/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/huawei/common/applog/bean/e;

.field private static final c:Ljava/lang/Object;


# instance fields
.field private b:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/huawei/common/applog/bean/e;

    invoke-direct {v0}, Lcom/huawei/common/applog/bean/e;-><init>()V

    sput-object v0, Lcom/huawei/common/applog/bean/e;->a:Lcom/huawei/common/applog/bean/e;

    .line 15
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/common/applog/bean/e;->c:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/common/applog/bean/e;->b:Ljava/util/Timer;

    .line 21
    return-void
.end method

.method public static a()Lcom/huawei/common/applog/bean/e;
    .locals 1

    .line 24
    sget-object v0, Lcom/huawei/common/applog/bean/e;->a:Lcom/huawei/common/applog/bean/e;

    return-object v0
.end method

.method public static b()V
    .locals 0

    .line 31
    return-void
.end method


# virtual methods
.method public a(Ljava/util/Timer;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/common/applog/bean/e;->b:Ljava/util/Timer;

    .line 47
    return-void
.end method

.method public c()Ljava/util/Timer;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/common/applog/bean/e;->b:Ljava/util/Timer;

    return-object v0
.end method

.method public d()V
    .locals 4

    .line 53
    sget-object v2, Lcom/huawei/common/applog/bean/e;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 54
    :try_start_0
    iget-object v0, p0, Lcom/huawei/common/applog/bean/e;->b:Ljava/util/Timer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 55
    const-string v0, "ReportApi"

    const-string v1, "Timer cancel"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lcom/huawei/common/applog/bean/e;->b:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/common/applog/bean/e;->b:Ljava/util/Timer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 60
    :goto_0
    return-void
.end method
