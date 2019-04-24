.class public final Lcom/huawei/hwid/core/d/b/d;
.super Lcom/huawei/hwid/core/d/b/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/core/d/b/d$a;
    }
.end annotation


# static fields
.field private static final b:Lcom/huawei/hwid/core/d/b/a;

.field private static c:Lcom/huawei/hwid/core/d/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Lcom/huawei/hwid/core/d/b/a;

    invoke-direct {v0}, Lcom/huawei/hwid/core/d/b/a;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/d/b/d;->b:Lcom/huawei/hwid/core/d/b/a;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/huawei/hwid/core/d/b/b;-><init>()V

    .line 39
    new-instance v0, Lcom/huawei/hwid/core/d/b/d$a;

    invoke-direct {v0, p1}, Lcom/huawei/hwid/core/d/b/d$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/huawei/hwid/core/d/b/d$a;->start()V

    .line 40
    return-void
.end method

.method static synthetic a()Lcom/huawei/hwid/core/d/b/a;
    .locals 1

    .line 13
    sget-object v0, Lcom/huawei/hwid/core/d/b/d;->b:Lcom/huawei/hwid/core/d/b/a;

    return-object v0
.end method

.method private static declared-synchronized a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V
    .locals 5

    const-class v4, Lcom/huawei/hwid/core/d/b/d;

    monitor-enter v4

    .line 189
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b/d;->a(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 190
    monitor-exit v4

    return-void

    .line 214
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 215
    const-string p2, ""

    .line 217
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/hwid/core/d/b/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    goto :goto_0

    .line 218
    :catch_0
    move-exception v3

    .line 219
    const-string v0, "hwid"

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "println IllegalArgumentException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 222
    goto :goto_0

    .line 220
    :catch_1
    move-exception v3

    .line 221
    const-string v0, "hwid"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "println Exception"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 223
    :goto_0
    monitor-exit v4

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v4

    throw p0
.end method

.method static synthetic a(Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b/d;->b(Ljava/lang/String;)V

    return-void
.end method

.method private static a(I)Z
    .locals 1

    .line 233
    const-string v0, "hwid"

    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Lcom/huawei/hwid/core/d/b/d;
    .locals 2

    const-class v1, Lcom/huawei/hwid/core/d/b/d;

    monitor-enter v1

    .line 31
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/core/d/b/d;->c:Lcom/huawei/hwid/core/d/b/d;

    if-nez v0, :cond_0

    .line 32
    new-instance v0, Lcom/huawei/hwid/core/d/b/d;

    invoke-direct {v0, p0}, Lcom/huawei/hwid/core/d/b/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwid/core/d/b/d;->c:Lcom/huawei/hwid/core/d/b/d;

    .line 33
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/d/b/d;->a:Ljava/lang/String;

    .line 35
    :cond_0
    sget-object v0, Lcom/huawei/hwid/core/d/b/d;->c:Lcom/huawei/hwid/core/d/b/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method private static b(Ljava/lang/String;)V
    .locals 3

    .line 70
    new-instance v1, Ljava/io/File;

    const-string v0, "apphwid.txt"

    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    new-instance v2, Ljava/io/File;

    const-string v0, "apphwid.txt.bak"

    invoke-direct {v2, p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    invoke-static {v1}, Lcom/huawei/hwid/core/d/f;->a(Ljava/io/File;)Z

    .line 73
    invoke-static {v2}, Lcom/huawei/hwid/core/d/f;->a(Ljava/io/File;)Z

    .line 74
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 113
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, p2, v1, v2}, Lcom/huawei/hwid/core/d/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 115
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 123
    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, p2, v1, v2}, Lcom/huawei/hwid/core/d/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 124
    invoke-static {p1, p2}, Lcom/huawei/hwid/core/d/b/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 143
    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, p2, v1, v2}, Lcom/huawei/hwid/core/d/b/d;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 144
    invoke-static {p1, p2}, Lcom/huawei/hwid/core/d/b/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    return-void
.end method
