.class public Lo/dbn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lo/dbn;


# instance fields
.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/ref/WeakReference<Lo/dbs;>;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const-class v0, Lo/dbn;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dbn;->a:Ljava/lang/String;

    .line 35
    const/4 v0, 0x0

    sput-object v0, Lo/dbn;->b:Lo/dbn;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lo/dbn;->d:Ljava/util/Set;

    .line 32
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lo/dbn;->e:Ljava/util/Set;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/dbn;->c:Ljava/util/List;

    .line 45
    invoke-direct {p0}, Lo/dbn;->a()V

    .line 46
    return-void
.end method

.method private declared-synchronized a()V
    .locals 9

    monitor-enter p0

    .line 58
    :try_start_0
    const-class v0, Landroid/Manifest$permission;

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    .line 59
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v3, v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    const/4 v7, 0x0

    .line 62
    const-string v0, ""

    :try_start_1
    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v7, v0

    .line 65
    goto :goto_1

    .line 63
    :catch_0
    move-exception v8

    .line 64
    :try_start_2
    sget-object v0, Lo/dbn;->a:Ljava/lang/String;

    const-string v1, "Could not access field"

    invoke-static {v0, v1, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 66
    :goto_1
    iget-object v0, p0, Lo/dbn;->e:Ljava/util/Set;

    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 68
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private declared-synchronized a([Ljava/lang/String;Lo/dbs;)V
    .locals 2
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lo/dbs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 111
    if-nez p2, :cond_0

    .line 112
    monitor-exit p0

    return-void

    .line 114
    :cond_0
    :try_start_0
    invoke-virtual {p2, p1}, Lo/dbs;->registerPermissions([Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lo/dbn;->c:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static declared-synchronized c()Lo/dbn;
    .locals 3

    const-class v1, Lo/dbn;

    monitor-enter v1

    .line 38
    :try_start_0
    sget-object v0, Lo/dbn;->b:Lo/dbn;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Lo/dbn;

    invoke-direct {v0}, Lo/dbn;-><init>()V

    sput-object v0, Lo/dbn;->b:Lo/dbn;

    .line 41
    :cond_0
    sget-object v0, Lo/dbn;->b:Lo/dbn;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private d(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)Ljava/util/List;
    .locals 6
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lo/dbs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 391
    new-instance v1, Ljava/util/ArrayList;

    array-length v0, p2

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 392
    move-object v2, p2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 393
    iget-object v0, p0, Lo/dbn;->e:Ljava/util/Set;

    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 394
    if-eqz p3, :cond_2

    .line 395
    sget-object v0, Lo/dbl;->c:Lo/dbl;

    invoke-virtual {p3, v5, v0}, Lo/dbs;->onResult(Ljava/lang/String;Lo/dbl;)Z

    goto :goto_1

    .line 397
    :cond_0
    invoke-static {p1, v5}, Landroid/support/v4/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 398
    iget-object v0, p0, Lo/dbn;->d:Ljava/util/Set;

    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 399
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 402
    :cond_1
    if-eqz p3, :cond_2

    .line 403
    sget-object v0, Lo/dbl;->e:Lo/dbl;

    invoke-virtual {p3, v5, v0}, Lo/dbs;->onResult(Ljava/lang/String;Lo/dbl;)Z

    .line 392
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 407
    :cond_3
    return-object v1
.end method

.method private declared-synchronized d(Lo/dbs;)V
    .locals 3
    .param p1    # Lo/dbs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 127
    :try_start_0
    iget-object v0, p0, Lo/dbn;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 128
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 130
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_0

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 131
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :cond_1
    goto :goto_0

    .line 134
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private e(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V
    .locals 5
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lo/dbs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 362
    move-object v1, p2

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    .line 363
    if-eqz p3, :cond_2

    .line 364
    iget-object v0, p0, Lo/dbn;->e:Ljava/util/Set;

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 365
    sget-object v0, Lo/dbl;->c:Lo/dbl;

    invoke-virtual {p3, v4, v0}, Lo/dbs;->onResult(Ljava/lang/String;Lo/dbl;)Z

    goto :goto_1

    .line 366
    :cond_0
    invoke-static {p1, v4}, Landroid/support/v4/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 368
    sget-object v0, Lo/dbl;->b:Lo/dbl;

    invoke-virtual {p3, v4, v0}, Lo/dbs;->onResult(Ljava/lang/String;Lo/dbl;)Z

    goto :goto_1

    .line 370
    :cond_1
    sget-object v0, Lo/dbl;->e:Lo/dbl;

    invoke-virtual {p3, v4, v0}, Lo/dbs;->onResult(Ljava/lang/String;Lo/dbl;)Z

    .line 362
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 374
    :cond_3
    return-void
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 150
    if-eqz p1, :cond_1

    :try_start_0
    invoke-static {p1, p2}, Landroid/support/v4/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dbn;->e:Ljava/util/Set;

    .line 151
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 150
    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lo/dbs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 220
    if-nez p1, :cond_0

    .line 221
    monitor-exit p0

    return-void

    .line 223
    :cond_0
    :try_start_0
    invoke-direct {p0, p2, p3}, Lo/dbn;->a([Ljava/lang/String;Lo/dbs;)V

    .line 224
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    .line 225
    invoke-direct {p0, p1, p2, p3}, Lo/dbn;->e(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    goto :goto_0

    .line 227
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lo/dbn;->d(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)Ljava/util/List;

    move-result-object v2

    .line 228
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 230
    invoke-direct {p0, p3}, Lo/dbn;->d(Lo/dbs;)V

    goto :goto_0

    .line 232
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Ljava/lang/String;

    .line 233
    iget-object v0, p0, Lo/dbn;->d:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 234
    const/4 v0, 0x1

    invoke-static {p1, v3, v0}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c([Ljava/lang/String;[I)V
    .locals 6
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 331
    :try_start_0
    array-length v2, p1

    .line 332
    array-length v0, p2

    if-ge v0, v2, :cond_0

    .line 333
    array-length v2, p2

    .line 335
    :cond_0
    iget-object v0, p0, Lo/dbn;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 336
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 337
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dbs;

    .line 338
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_3

    .line 339
    if-eqz v4, :cond_1

    aget-object v0, p1, v5

    aget v1, p2, v5

    invoke-virtual {v4, v0, v1}, Lo/dbs;->onResult(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 340
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 341
    goto :goto_2

    .line 338
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 344
    :cond_3
    :goto_2
    goto :goto_0

    .line 345
    :cond_4
    const/4 v4, 0x0

    :goto_3
    if-ge v4, v2, :cond_5

    .line 346
    iget-object v0, p0, Lo/dbn;->d:Ljava/util/Set;

    aget-object v1, p1, v4

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 345
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 348
    :cond_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized d(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;I)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lo/dbs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    .line 260
    if-nez p1, :cond_0

    .line 261
    monitor-exit p0

    return-void

    .line 263
    :cond_0
    :try_start_0
    invoke-direct {p0, p2, p3}, Lo/dbn;->a([Ljava/lang/String;Lo/dbs;)V

    .line 264
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    .line 265
    invoke-direct {p0, p1, p2, p3}, Lo/dbn;->e(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    goto :goto_0

    .line 267
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lo/dbn;->d(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)Ljava/util/List;

    move-result-object v2

    .line 268
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 270
    invoke-direct {p0, p3}, Lo/dbn;->d(Lo/dbs;)V

    goto :goto_0

    .line 272
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Ljava/lang/String;

    .line 273
    iget-object v0, p0, Lo/dbn;->d:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 274
    invoke-static {p1, v3, p4}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 277
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
