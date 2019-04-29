.class public final Lcom/yandex/metrica/impl/bv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/j$a;


# static fields
.field private static a:Lcom/yandex/metrica/impl/bv;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static b:Lcom/yandex/metrica/impl/n;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/yandex/metrica/impl/bd;

.field private e:Lcom/yandex/metrica/impl/ab;

.field private f:Lcom/yandex/metrica/impl/aj;

.field private final g:Ljava/util/concurrent/ExecutorService;

.field private final h:Lcom/yandex/metrica/impl/ob/kn;

.field private final i:Lcom/yandex/metrica/impl/ax;

.field private j:Lcom/yandex/metrica/impl/i;

.field private final k:Lcom/yandex/metrica/impl/ob/u;

.field private l:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "Lcom/yandex/metrica/Revenue;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Lcom/yandex/metrica/impl/n;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/n;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/bv;->b:Lcom/yandex/metrica/impl/n;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Lcom/yandex/metrica/impl/ob/lt;

    const-string v1, "YMM-RH"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/lt;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/bv;->g:Ljava/util/concurrent/ExecutorService;

    .line 69
    new-instance v0, Lcom/yandex/metrica/impl/ob/no;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/no;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/bv;->l:Lcom/yandex/metrica/impl/ob/nk;

    .line 71
    new-instance v0, Lcom/yandex/metrica/impl/ob/lt;

    const-string v1, "YMM-YM"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/lt;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/bv;->m:Ljava/util/concurrent/Executor;

    .line 1054
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Initializing of Metrica"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ", Release type"

    .line 1055
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", Version 3.1.0"

    .line 1056
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", API Level 67"

    .line 1057
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", Dated 30.05.2018."

    .line 1058
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1059
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lv;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lv;->a(Landroid/content/Context;)V

    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/bv;->c:Landroid/content/Context;

    .line 80
    new-instance p1, Lcom/yandex/metrica/impl/ob/u;

    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->c:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/u;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/bv;->k:Lcom/yandex/metrica/impl/ob/u;

    .line 82
    invoke-static {}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a()Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;

    move-result-object p1

    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->c:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a(Landroid/content/Context;)V

    .line 84
    new-instance v6, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v6, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 86
    new-instance v4, Lcom/yandex/metrica/impl/bf;

    iget-object p1, p0, Lcom/yandex/metrica/impl/bv;->k:Lcom/yandex/metrica/impl/ob/u;

    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->g:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bv;->c:Landroid/content/Context;

    invoke-direct {v4, p1, v0, v1, v6}, Lcom/yandex/metrica/impl/bf;-><init>(Lcom/yandex/metrica/impl/ob/u;Ljava/util/concurrent/ExecutorService;Landroid/content/Context;Landroid/os/Handler;)V

    .line 89
    iget-object p1, p0, Lcom/yandex/metrica/impl/bv;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/eu;->f()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object p1

    .line 90
    new-instance v0, Lcom/yandex/metrica/impl/ob/fg;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/fg;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    .line 92
    new-instance p1, Lcom/yandex/metrica/impl/e;

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/e;-><init>(Lcom/yandex/metrica/impl/ob/fg;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/bv;->c:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/e;->a(Landroid/content/Context;)V

    .line 94
    new-instance p1, Lcom/yandex/metrica/impl/ob/kn;

    invoke-direct {p1, v4, v0}, Lcom/yandex/metrica/impl/ob/kn;-><init>(Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/ob/fg;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    .line 95
    iget-object p1, p0, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    invoke-virtual {v4, p1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/ob/ko;)V

    .line 97
    new-instance p1, Lcom/yandex/metrica/impl/ax;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bv;->m:Ljava/util/concurrent/Executor;

    invoke-direct {p1, v4, v0, v1}, Lcom/yandex/metrica/impl/ax;-><init>(Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/ob/fg;Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/bv;->i:Lcom/yandex/metrica/impl/ax;

    .line 99
    new-instance v5, Lcom/yandex/metrica/impl/j;

    invoke-direct {v5, v6}, Lcom/yandex/metrica/impl/j;-><init>(Landroid/os/Handler;)V

    .line 100
    invoke-virtual {v5, p0}, Lcom/yandex/metrica/impl/j;->a(Lcom/yandex/metrica/impl/j$a;)V

    .line 101
    invoke-virtual {v4, v5}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/j;)V

    .line 103
    new-instance p1, Lcom/yandex/metrica/impl/bd;

    iget-object v2, p0, Lcom/yandex/metrica/impl/bv;->c:Landroid/content/Context;

    iget-object v3, p0, Lcom/yandex/metrica/impl/bv;->k:Lcom/yandex/metrica/impl/ob/u;

    iget-object v7, p0, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/yandex/metrica/impl/bd;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/u;Lcom/yandex/metrica/impl/bf;Lcom/yandex/metrica/impl/j;Landroid/os/Handler;Lcom/yandex/metrica/impl/ob/ko;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/bv;->d:Lcom/yandex/metrica/impl/bd;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/bv;)Lcom/yandex/metrica/impl/ab;
    .locals 0

    .line 48
    iget-object p0, p0, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    return-object p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lcom/yandex/metrica/impl/bv;

    monitor-enter v0

    const/4 v1, 0x0

    .line 134
    :try_start_0
    invoke-static {p0, v1}, Lcom/yandex/metrica/impl/bv;->b(Landroid/content/Context;Lcom/yandex/metrica/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 133
    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;Lcom/yandex/metrica/e;)V
    .locals 5

    const-class v0, Lcom/yandex/metrica/impl/bv;

    monitor-enter v0

    .line 119
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/bv;->b:Lcom/yandex/metrica/impl/n;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/n;->c()Z

    move-result v1

    .line 120
    sget-object v2, Lcom/yandex/metrica/impl/bv;->b:Lcom/yandex/metrica/impl/n;

    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/n;->a(Lcom/yandex/metrica/e;)Lcom/yandex/metrica/e;

    move-result-object p1

    .line 121
    invoke-static {p0, p1}, Lcom/yandex/metrica/impl/bv;->b(Landroid/content/Context;Lcom/yandex/metrica/e;)V

    .line 122
    sget-object v2, Lcom/yandex/metrica/impl/bv;->a:Lcom/yandex/metrica/impl/bv;

    iget-object v2, v2, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    if-nez v2, :cond_3

    .line 123
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/yandex/metrica/e;->logs:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 124
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/lv;->a()V

    .line 126
    :cond_0
    sget-object v2, Lcom/yandex/metrica/impl/bv;->a:Lcom/yandex/metrica/impl/bv;

    .line 2267
    iget-object v3, v2, Lcom/yandex/metrica/impl/bv;->d:Lcom/yandex/metrica/impl/bd;

    invoke-virtual {v3, p1, v1}, Lcom/yandex/metrica/impl/bd;->a(Lcom/yandex/metrica/e;Z)Lcom/yandex/metrica/impl/ab;

    move-result-object p1

    iput-object p1, v2, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    .line 2268
    iget-object p1, v2, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ab;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3208
    iget-object v1, v2, Lcom/yandex/metrica/impl/bv;->j:Lcom/yandex/metrica/impl/i;

    if-nez v1, :cond_1

    .line 3209
    new-instance v1, Lcom/yandex/metrica/impl/bb;

    iget-object v3, v2, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    new-instance v4, Lcom/yandex/metrica/impl/bv$1;

    invoke-direct {v4, v2}, Lcom/yandex/metrica/impl/bv$1;-><init>(Lcom/yandex/metrica/impl/bv;)V

    invoke-direct {v1, v3, v4}, Lcom/yandex/metrica/impl/bb;-><init>(Lcom/yandex/metrica/IReporter;Lcom/yandex/metrica/impl/i$a;)V

    iput-object v1, v2, Lcom/yandex/metrica/impl/bv;->j:Lcom/yandex/metrica/impl/i;

    .line 3215
    :cond_1
    iget-object v1, v2, Lcom/yandex/metrica/impl/bv;->f:Lcom/yandex/metrica/impl/aj;

    iget-object v3, v2, Lcom/yandex/metrica/impl/bv;->j:Lcom/yandex/metrica/impl/i;

    invoke-virtual {v1, v3}, Lcom/yandex/metrica/impl/aj;->a(Lcom/yandex/metrica/impl/i;)V

    goto :goto_0

    .line 3217
    :cond_2
    iget-object v1, v2, Lcom/yandex/metrica/impl/bv;->f:Lcom/yandex/metrica/impl/aj;

    iget-object v3, v2, Lcom/yandex/metrica/impl/bv;->j:Lcom/yandex/metrica/impl/i;

    invoke-virtual {v1, v3}, Lcom/yandex/metrica/impl/aj;->b(Lcom/yandex/metrica/impl/i;)V

    .line 3219
    :goto_0
    iget-object v1, v2, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ab;->b(Z)V

    goto :goto_1

    .line 128
    :cond_3
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p1

    const-string v1, "Appmetrica already has been activated!"

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;)V

    :goto_1
    const-string p1, "20799a27-fa80-4b36-b2db-0f8141f24180"

    .line 4024
    invoke-static {p1}, Lcom/yandex/metrica/c;->a(Ljava/lang/String;)Lcom/yandex/metrica/c$a;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/c$a;->a(I)Lcom/yandex/metrica/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/c$a;->a()Lcom/yandex/metrica/c;

    move-result-object p1

    .line 4022
    invoke-static {p0, p1}, Lcom/yandex/metrica/YandexMetrica;->activateReporter(Landroid/content/Context;Lcom/yandex/metrica/ReporterConfig;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 118
    monitor-exit v0

    throw p0
.end method

.method public static a(Landroid/location/Location;)V
    .locals 1

    .line 223
    invoke-static {}, Lcom/yandex/metrica/impl/bv;->f()Lcom/yandex/metrica/impl/ae;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/yandex/metrica/impl/ae;->a(Landroid/location/Location;)V

    return-void
.end method

.method public static a(Z)V
    .locals 1

    .line 227
    invoke-static {}, Lcom/yandex/metrica/impl/bv;->f()Lcom/yandex/metrica/impl/ae;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/yandex/metrica/impl/ae;->a(Z)V

    return-void
.end method

.method public static declared-synchronized b()Lcom/yandex/metrica/impl/bv;
    .locals 2

    const-class v0, Lcom/yandex/metrica/impl/bv;

    monitor-enter v0

    .line 146
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/bv;->a:Lcom/yandex/metrica/impl/bv;

    if-nez v1, :cond_0

    .line 147
    sget-object v1, Lcom/yandex/metrica/impl/bs;->a:Ljava/lang/IllegalStateException;

    throw v1

    .line 149
    :cond_0
    sget-object v1, Lcom/yandex/metrica/impl/bv;->a:Lcom/yandex/metrica/impl/bv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 145
    monitor-exit v0

    throw v1
.end method

.method public static b(Landroid/content/Context;)Lcom/yandex/metrica/impl/bv;
    .locals 0

    .line 155
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/yandex/metrica/impl/bv;->a(Landroid/content/Context;)V

    .line 157
    invoke-static {}, Lcom/yandex/metrica/impl/bv;->b()Lcom/yandex/metrica/impl/bv;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;Lcom/yandex/metrica/e;)V
    .locals 3

    const-class v0, Lcom/yandex/metrica/impl/bv;

    monitor-enter v0

    .line 138
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/bv;->a:Lcom/yandex/metrica/impl/bv;

    if-nez v1, :cond_1

    .line 139
    new-instance v1, Lcom/yandex/metrica/impl/bv;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/bv;-><init>(Landroid/content/Context;)V

    .line 140
    sput-object v1, Lcom/yandex/metrica/impl/bv;->a:Lcom/yandex/metrica/impl/bv;

    .line 4173
    iget-object p0, v1, Lcom/yandex/metrica/impl/bv;->c:Landroid/content/Context;

    invoke-static {p0}, Lcom/yandex/metrica/impl/x;->a(Landroid/content/Context;)V

    if-eqz p1, :cond_0

    .line 4181
    iget-object p0, v1, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    iget-object v2, p1, Lcom/yandex/metrica/e;->d:Ljava/util/List;

    invoke-virtual {p0, v2}, Lcom/yandex/metrica/impl/ob/kn;->a(Ljava/util/List;)V

    .line 4182
    iget-object p0, v1, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    iget-object v2, p1, Lcom/yandex/metrica/e;->b:Ljava/util/Map;

    invoke-virtual {p0, v2}, Lcom/yandex/metrica/impl/ob/kn;->a(Ljava/util/Map;)V

    .line 4183
    iget-object p0, v1, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    iget-object v2, p1, Lcom/yandex/metrica/e;->c:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/yandex/metrica/impl/ob/kn;->a(Ljava/lang/String;)V

    .line 4185
    :cond_0
    iget-object p0, v1, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/kn;->b()V

    .line 4175
    iget-object p0, v1, Lcom/yandex/metrica/impl/bv;->k:Lcom/yandex/metrica/impl/ob/u;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/u;->a(Lcom/yandex/metrica/e;)V

    .line 4176
    iget-object p0, v1, Lcom/yandex/metrica/impl/bv;->g:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Lcom/yandex/metrica/impl/ob/lr$a;

    iget-object v1, v1, Lcom/yandex/metrica/impl/bv;->c:Landroid/content/Context;

    invoke-direct {p1, v1}, Lcom/yandex/metrica/impl/ob/lr$a;-><init>(Landroid/content/Context;)V

    invoke-interface {p0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 141
    sget-object p0, Lcom/yandex/metrica/impl/bv;->a:Lcom/yandex/metrica/impl/bv;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bv;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 137
    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized c()Lcom/yandex/metrica/impl/ab;
    .locals 3

    const-class v0, Lcom/yandex/metrica/impl/bv;

    monitor-enter v0

    .line 161
    :try_start_0
    invoke-static {}, Lcom/yandex/metrica/impl/bv;->b()Lcom/yandex/metrica/impl/bv;

    move-result-object v1

    .line 162
    iget-object v2, v1, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    if-nez v2, :cond_0

    .line 163
    sget-object v1, Lcom/yandex/metrica/impl/bs;->a:Ljava/lang/IllegalStateException;

    throw v1

    .line 165
    :cond_0
    iget-object v1, v1, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 160
    monitor-exit v0

    throw v1
.end method

.method static declared-synchronized d()Z
    .locals 2

    const-class v0, Lcom/yandex/metrica/impl/bv;

    monitor-enter v0

    .line 169
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/bv;->a:Lcom/yandex/metrica/impl/bv;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/yandex/metrica/impl/bv;->a:Lcom/yandex/metrica/impl/bv;

    iget-object v1, v1, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    monitor-exit v0

    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static f()Lcom/yandex/metrica/impl/ae;
    .locals 1

    .line 201
    invoke-static {}, Lcom/yandex/metrica/impl/bv;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    invoke-static {}, Lcom/yandex/metrica/impl/bv;->b()Lcom/yandex/metrica/impl/bv;

    move-result-object v0

    iget-object v0, v0, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    return-object v0

    :cond_0
    sget-object v0, Lcom/yandex/metrica/impl/bv;->b:Lcom/yandex/metrica/impl/n;

    return-object v0
.end method


# virtual methods
.method a()V
    .locals 4

    .line 114
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    .line 1296
    new-instance v1, Lcom/yandex/metrica/impl/aj;

    invoke-direct {v1, v0}, Lcom/yandex/metrica/impl/aj;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 1298
    new-instance v0, Lcom/yandex/metrica/impl/bb;

    iget-object v2, p0, Lcom/yandex/metrica/impl/bv;->d:Lcom/yandex/metrica/impl/bd;

    const-string v3, "20799a27-fa80-4b36-b2db-0f8141f24180"

    .line 1301
    invoke-static {v3}, Lcom/yandex/metrica/c;->a(Ljava/lang/String;)Lcom/yandex/metrica/c$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/yandex/metrica/c$a;->a()Lcom/yandex/metrica/c;

    move-result-object v3

    .line 1300
    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/bd;->b(Lcom/yandex/metrica/c;)Lcom/yandex/metrica/b;

    move-result-object v2

    new-instance v3, Lcom/yandex/metrica/impl/bv$2;

    invoke-direct {v3}, Lcom/yandex/metrica/impl/bv$2;-><init>()V

    invoke-direct {v0, v2, v3}, Lcom/yandex/metrica/impl/bb;-><init>(Lcom/yandex/metrica/IReporter;Lcom/yandex/metrica/impl/i$a;)V

    .line 1298
    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/aj;->a(Lcom/yandex/metrica/impl/i;)V

    .line 114
    iput-object v1, p0, Lcom/yandex/metrica/impl/bv;->f:Lcom/yandex/metrica/impl/aj;

    .line 115
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->f:Lcom/yandex/metrica/impl/aj;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method public a(ILandroid/os/Bundle;)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 280
    :pswitch_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/kn;->b(Landroid/os/Bundle;)V

    goto :goto_0

    .line 277
    :pswitch_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/kn;->a(Landroid/os/Bundle;)V

    return-void

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/yandex/metrica/DeferredDeeplinkParametersListener;)V
    .locals 1

    .line 332
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->i:Lcom/yandex/metrica/impl/ax;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ax;->a(Lcom/yandex/metrica/DeferredDeeplinkParametersListener;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/IIdentifierCallback;)V
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kn;->a(Lcom/yandex/metrica/IIdentifierCallback;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/Revenue;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/Revenue;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 344
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->l:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    move-result-object v0

    .line 345
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ni;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 346
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ab;->reportRevenue(Lcom/yandex/metrica/Revenue;)V

    return-void

    .line 348
    :cond_0
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Passed revenue is not valid. Reason: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ni;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 348
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/c;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 189
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->d:Lcom/yandex/metrica/impl/bd;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bd;->a(Lcom/yandex/metrica/c;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/profile/UserProfile;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/profile/UserProfile;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 336
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ab;->reportUserProfile(Lcom/yandex/metrica/profile/UserProfile;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->i:Lcom/yandex/metrica/impl/ax;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ax;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/c;)Lcom/yandex/metrica/b;
    .locals 1
    .param p1    # Lcom/yandex/metrica/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 193
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->d:Lcom/yandex/metrica/impl/bd;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bd;->b(Lcom/yandex/metrica/c;)Lcom/yandex/metrica/b;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 340
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->e:Lcom/yandex/metrica/impl/ab;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ab;->setUserProfileID(Ljava/lang/String;)V

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/yandex/metrica/impl/bv;->h:Lcom/yandex/metrica/impl/ob/kn;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kn;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
