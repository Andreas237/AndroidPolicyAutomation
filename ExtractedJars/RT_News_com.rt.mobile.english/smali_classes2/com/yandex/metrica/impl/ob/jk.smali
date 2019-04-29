.class public Lcom/yandex/metrica/impl/ob/jk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jk$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/yandex/metrica/impl/bn$a$a;",
            "Lcom/yandex/metrica/impl/as$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/fo;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/fo<",
            "Lcom/yandex/metrica/impl/ob/jk$a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/yandex/metrica/impl/ob/jk$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final e:Landroid/os/Handler;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final f:Lcom/yandex/metrica/impl/ob/kb;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 248
    new-instance v0, Lcom/yandex/metrica/impl/ob/jk$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jk$1;-><init>()V

    .line 249
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/jk;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/fo;Lcom/yandex/metrica/impl/ob/kb;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/fo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/kb;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/yandex/metrica/impl/ob/fo<",
            "Lcom/yandex/metrica/impl/ob/jk$a;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/kb;",
            ")V"
        }
    .end annotation

    .line 273
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 267
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jk;->g:Z

    .line 274
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk;->b:Landroid/content/Context;

    .line 275
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/jk;->c:Lcom/yandex/metrica/impl/ob/fo;

    .line 276
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/jk;->f:Lcom/yandex/metrica/impl/ob/kb;

    .line 277
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/jk;->c:Lcom/yandex/metrica/impl/ob/fo;

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/fo;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/jk$a;

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jk;->d:Lcom/yandex/metrica/impl/ob/jk$a;

    .line 284
    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "YMM-RRT"

    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 285
    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    .line 286
    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/jk;->e:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/jk;)Lcom/yandex/metrica/impl/ob/kb;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/jk;->f:Lcom/yandex/metrica/impl/ob/kb;

    return-object p0
.end method

.method private static a(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/me;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/yandex/metrica/impl/ob/me<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 329
    new-instance v0, Lcom/yandex/metrica/impl/ob/me;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/me;-><init>()V

    .line 330
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    .line 331
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Lcom/yandex/metrica/impl/ob/me;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Collection;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private a(Lcom/yandex/metrica/impl/ob/jk$a$a;)V
    .locals 6
    .param p1    # Lcom/yandex/metrica/impl/ob/jk$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 347
    iget-wide v0, p1, Lcom/yandex/metrica/impl/ob/jk$a$a;->e:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v4, v0, v2

    const-wide/16 v0, 0x0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 350
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/jk;->e:Landroid/os/Handler;

    new-instance v3, Lcom/yandex/metrica/impl/ob/jk$2;

    invoke-direct {v3, p0, p1}, Lcom/yandex/metrica/impl/ob/jk$2;-><init>(Lcom/yandex/metrica/impl/ob/jk;Lcom/yandex/metrica/impl/ob/jk$a$a;)V

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private declared-synchronized a(Lcom/yandex/metrica/impl/ob/jk$a$b;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/jk$a$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 422
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk;->d:Lcom/yandex/metrica/impl/ob/jk$a;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/jk$a$b;->a(Lcom/yandex/metrica/impl/ob/jk$a$b;)Lcom/yandex/metrica/impl/ob/jk$a$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jk$a;->b(Lcom/yandex/metrica/impl/ob/jk$a$a;)V

    .line 423
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/jk;->b()V

    .line 424
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk;->f:Lcom/yandex/metrica/impl/ob/kb;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kb;->a(Lcom/yandex/metrica/impl/ob/jk$a$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 425
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 421
    monitor-exit p0

    throw p1
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/jk;Lcom/yandex/metrica/impl/ob/jk$a$b;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/jk;->a(Lcom/yandex/metrica/impl/ob/jk$a$b;)V

    return-void
.end method

.method static synthetic a(Ljava/net/HttpURLConnection;Lcom/yandex/metrica/impl/ob/jk$a$b;)V
    .locals 2

    const v0, 0x19000

    .line 1397
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/yandex/metrica/impl/u;->a(Ljava/io/InputStream;I)[B

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/jk$a$b;->a([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1402
    :catch_0
    :try_start_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/yandex/metrica/impl/u;->a(Ljava/io/InputStream;I)[B

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/yandex/metrica/impl/ob/jk$a$b;->b([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    return-void
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/jk;)Landroid/content/Context;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/jk;->b:Landroid/content/Context;

    return-object p0
.end method

.method private static b(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .param p0    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bn$a$a;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/as$a;",
            ">;"
        }
    .end annotation

    .line 441
    new-instance v0, Ljava/util/ArrayList;

    .line 442
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 444
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/bn$a$a;

    .line 445
    sget-object v2, Lcom/yandex/metrica/impl/ob/jk;->a:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private b()V
    .locals 2

    .line 434
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk;->c:Lcom/yandex/metrica/impl/ob/fo;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jk;->d:Lcom/yandex/metrica/impl/ob/jk$a;

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/ob/fo;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    .line 290
    :try_start_0
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jk;->g:Z

    if-nez v0, :cond_1

    .line 1299
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk;->d:Lcom/yandex/metrica/impl/ob/jk$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jk$a;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/jk$a$a;

    .line 1300
    invoke-direct {p0, v1}, Lcom/yandex/metrica/impl/ob/jk;->a(Lcom/yandex/metrica/impl/ob/jk$a$a;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 293
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jk;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 295
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 289
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/util/List;J)V
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bn$a;",
            ">;J)V"
        }
    .end annotation

    monitor-enter p0

    .line 307
    :try_start_0
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 308
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/bn$a;

    .line 309
    iget-object v1, v0, Lcom/yandex/metrica/impl/bn$a;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/yandex/metrica/impl/bn$a;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/yandex/metrica/impl/bn$a;->c:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/yandex/metrica/impl/bn$a;->e:Ljava/lang/Long;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/yandex/metrica/impl/bn$a;->e:Ljava/lang/Long;

    .line 310
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    iget-object v1, v0, Lcom/yandex/metrica/impl/bn$a;->f:Ljava/util/List;

    .line 311
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 312
    new-instance v1, Lcom/yandex/metrica/impl/ob/jk$a$a;

    iget-object v3, v0, Lcom/yandex/metrica/impl/bn$a;->a:Ljava/lang/String;

    iget-object v4, v0, Lcom/yandex/metrica/impl/bn$a;->b:Ljava/lang/String;

    iget-object v5, v0, Lcom/yandex/metrica/impl/bn$a;->c:Ljava/lang/String;

    iget-object v2, v0, Lcom/yandex/metrica/impl/bn$a;->d:Ljava/util/List;

    .line 316
    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/jk;->a(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/me;

    move-result-object v6

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v7, v0, Lcom/yandex/metrica/impl/bn$a;->e:Ljava/lang/Long;

    .line 317
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    add-long v9, p2, v7

    invoke-virtual {v2, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    iget-object v0, v0, Lcom/yandex/metrica/impl/bn$a;->f:Ljava/util/List;

    .line 318
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/jk;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Lcom/yandex/metrica/impl/ob/jk$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/me;JLjava/util/List;)V

    .line 1337
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk;->d:Lcom/yandex/metrica/impl/ob/jk$a;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/jk$a;->a(Lcom/yandex/metrica/impl/ob/jk$a$a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1339
    invoke-direct {p0, v1}, Lcom/yandex/metrica/impl/ob/jk;->a(Lcom/yandex/metrica/impl/ob/jk$a$a;)V

    .line 1340
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jk;->f:Lcom/yandex/metrica/impl/ob/kb;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/kb;->a(Lcom/yandex/metrica/impl/ob/jk$a$a;)V

    .line 1342
    :cond_1
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/jk;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 326
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 306
    monitor-exit p0

    throw p1
.end method
