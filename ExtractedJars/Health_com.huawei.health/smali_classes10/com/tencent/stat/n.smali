.class public Lcom/tencent/stat/n;
.super Ljava/lang/Object;


# static fields
.field private static e:Lcom/tencent/stat/common/StatLogger;

.field private static f:Lcom/tencent/stat/n;


# instance fields
.field a:Landroid/os/Handler;

.field volatile b:I

.field c:Lcom/tencent/stat/DeviceInfo;

.field private d:Lcom/tencent/stat/w;

.field private g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/tencent/stat/common/k;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/n;->f:Lcom/tencent/stat/n;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/n;->b:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/tencent/stat/n;->g:Ljava/util/HashMap;

    :try_start_0
    new-instance v3, Landroid/os/HandlerThread;

    const-string v0, "StatStore"

    invoke-direct {v3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/os/HandlerThread;->start()V

    move-object v4, v3

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Launch store thread:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    new-instance v0, Lcom/tencent/stat/w;

    invoke-direct {v0, v5}, Lcom/tencent/stat/w;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0, v5}, Lcom/tencent/stat/n;->b(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;

    invoke-virtual {p0}, Lcom/tencent/stat/n;->c()V

    invoke-direct {p0}, Lcom/tencent/stat/n;->f()V

    iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/stat/o;

    invoke-direct {v1, p0}, Lcom/tencent/stat/o;-><init>(Lcom/tencent/stat/n;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/stat/n;
    .locals 3

    const-class v2, Lcom/tencent/stat/n;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/tencent/stat/n;->f:Lcom/tencent/stat/n;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/tencent/stat/n;

    invoke-direct {v0, p0}, Lcom/tencent/stat/n;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/tencent/stat/n;->f:Lcom/tencent/stat/n;

    :cond_0
    sget-object v0, Lcom/tencent/stat/n;->f:Lcom/tencent/stat/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method static synthetic a(Lcom/tencent/stat/n;)V
    .locals 0

    invoke-direct {p0}, Lcom/tencent/stat/n;->e()V

    return-void
.end method

.method static synthetic a(Lcom/tencent/stat/n;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tencent/stat/n;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/tencent/stat/n;Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tencent/stat/n;->b(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V

    return-void
.end method

.method static synthetic a(Lcom/tencent/stat/n;Lcom/tencent/stat/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tencent/stat/n;->b(Lcom/tencent/stat/b;)V

    return-void
.end method

.method static synthetic a(Lcom/tencent/stat/n;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/tencent/stat/n;->b(Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lcom/tencent/stat/n;Ljava/util/List;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tencent/stat/n;->b(Ljava/util/List;I)V

    return-void
.end method

.method public static b()Lcom/tencent/stat/n;
    .locals 1

    sget-object v0, Lcom/tencent/stat/n;->f:Lcom/tencent/stat/n;

    return-object v0
.end method

.method static synthetic b(Lcom/tencent/stat/n;)Lcom/tencent/stat/w;
    .locals 1

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    return-object v0
.end method

.method private declared-synchronized b(I)V
    .locals 9

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/tencent/stat/n;->b:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v0, :cond_0

    if-gtz p1, :cond_1

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Load "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/tencent/stat/n;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " unsent events"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move v5, p1

    const/4 v0, -0x1

    if-eq v5, v0, :cond_2

    invoke-static {}, Lcom/tencent/stat/StatConfig;->a()I

    move-result v0

    if-le v5, v0, :cond_3

    :cond_2
    invoke-static {}, Lcom/tencent/stat/StatConfig;->a()I

    move-result v5

    :cond_3
    move v6, v5

    iget v0, p0, Lcom/tencent/stat/n;->b:I

    sub-int/2addr v0, v6

    iput v0, p0, Lcom/tencent/stat/n;->b:I

    invoke-direct {p0, v4, v5}, Lcom/tencent/stat/n;->c(Ljava/util/List;I)V

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Peek "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " unsent events."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x2

    invoke-direct {p0, v4, v0}, Lcom/tencent/stat/n;->b(Ljava/util/List;I)V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/tencent/stat/x;

    iget-object v0, v8, Lcom/tencent/stat/x;->b:Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-static {}, Lcom/tencent/stat/d;->b()Lcom/tencent/stat/d;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/u;

    invoke-direct {v1, p0, v4, v6}, Lcom/tencent/stat/u;-><init>(Lcom/tencent/stat/n;Ljava/util/List;I)V

    invoke-virtual {v0, v3, v1}, Lcom/tencent/stat/d;->b(Ljava/util/List;Lcom/tencent/stat/c;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    goto :goto_1

    :catch_0
    move-exception v3

    :try_start_2
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized b(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
    .locals 11

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxStoreEventCount()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v0

    if-gtz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    iget v0, p0, Lcom/tencent/stat/n;->b:I

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxStoreEventCount()I

    move-result v1

    if-le v0, v1, :cond_1

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Too many events stored in db."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->warn(Ljava/lang/Object;)V

    iget v0, p0, Lcom/tencent/stat/n;->b:I

    iget-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v1}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "events"

    const-string v3, "event_id in (select event_id from events where timestamp in (select min(timestamp) from events) limit 1)"

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/tencent/stat/n;->b:I

    :cond_1
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {p1}, Lcom/tencent/stat/a/e;->d()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/tencent/stat/common/k;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "content"

    invoke-virtual {v5, v0, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "send_count"

    const-string v1, "0"

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "status"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "timestamp"

    invoke-virtual {p1}, Lcom/tencent/stat/a/e;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "events"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v7

    const-wide/16 v0, -0x1

    cmp-long v0, v7, v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to store event:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->error(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/tencent/stat/n;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/tencent/stat/n;->b:I

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lcom/tencent/stat/c;->a()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    :goto_0
    :try_start_2
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catch_0
    move-exception v5

    goto :goto_2

    :catch_1
    move-exception v5

    :try_start_3
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v5}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catch_2
    move-exception v5

    goto :goto_2

    :catchall_0
    move-exception v9

    :try_start_5
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catch_3
    move-exception v10

    :goto_1
    :try_start_6
    throw v9
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_2
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized b(Lcom/tencent/stat/b;)V
    .locals 16

    monitor-enter p0

    const/4 v8, 0x0

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/stat/b;->a()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/tencent/stat/common/k;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Landroid/content/ContentValues;

    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "content"

    move-object/from16 v1, p1

    iget-object v1, v1, Lcom/tencent/stat/b;->b:Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "md5sum"

    invoke-virtual {v11, v0, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, p1

    iput-object v10, v0, Lcom/tencent/stat/b;->c:Ljava/lang/String;

    const-string v0, "version"

    move-object/from16 v1, p1

    iget v1, v1, Lcom/tencent/stat/b;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const/4 v12, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "config"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    :cond_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, p1

    iget v1, v1, Lcom/tencent/stat/b;->a:I

    if-ne v0, v1, :cond_0

    const/4 v12, 0x1

    :cond_1
    const/4 v0, 0x1

    if-ne v0, v12, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "config"

    const-string v2, "type=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    move-object/from16 v4, p1

    iget v4, v4, Lcom/tencent/stat/b;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v11, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v13, v0

    goto :goto_0

    :cond_2
    const-string v0, "type"

    move-object/from16 v1, p1

    iget v1, v1, Lcom/tencent/stat/b;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "config"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v11}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v13

    :goto_0
    const-wide/16 v0, -0x1

    cmp-long v0, v13, v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to store cfg:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sucessed to store cfg:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    if-eqz v8, :cond_5

    :try_start_1
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catch_0
    move-exception v9

    :try_start_2
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v9}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v8, :cond_5

    :try_start_3
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_0
    move-exception v15

    if-eqz v8, :cond_4

    :try_start_4
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v15
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_5
    :goto_2
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized b(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/tencent/stat/x;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Delete "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " sent events in thread:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/tencent/stat/x;

    iget v0, p0, Lcom/tencent/stat/n;->b:I

    iget-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v1}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "events"

    const-string v3, "event_id = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    iget-wide v5, v8, Lcom/tencent/stat/x;->a:J

    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/tencent/stat/n;->b:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "events"

    invoke-static {v0, v1}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lcom/tencent/stat/n;->b:I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catch_0
    move-exception v7

    :try_start_3
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v7}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catch_1
    move-exception v7

    :try_start_4
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v7}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catch_2
    move-exception v7

    :try_start_6
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v7}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    :catchall_0
    move-exception v9

    :try_start_7
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_1

    :catch_3
    move-exception v10

    :try_start_8
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v10}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    :goto_1
    throw v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_2
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized b(Ljava/util/List;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/tencent/stat/x;>;I)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Update "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " sending events to status:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " in thread:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "status"

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/tencent/stat/x;

    iget v0, v9, Lcom/tencent/stat/x;->d:I

    add-int/lit8 v0, v0, 0x1

    invoke-static {}, Lcom/tencent/stat/StatConfig;->getMaxSendRetryCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget v0, p0, Lcom/tencent/stat/n;->b:I

    iget-object v1, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v1}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "events"

    const-string v3, "event_id=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    iget-wide v5, v9, Lcom/tencent/stat/x;->a:J

    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/tencent/stat/n;->b:I

    goto :goto_1

    :cond_0
    const-string v0, "send_count"

    iget v1, v9, Lcom/tencent/stat/x;->d:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Update event:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, v9, Lcom/tencent/stat/x;->a:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for content:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "events"

    const-string v2, "event_id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    iget-wide v4, v9, Lcom/tencent/stat/x;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v7, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v10

    if-gtz v10, :cond_1

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to update db, error code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :cond_1
    :goto_1
    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "events"

    invoke-static {v0, v1}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lcom/tencent/stat/n;->b:I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catch_0
    move-exception v7

    :try_start_3
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v7}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catch_1
    move-exception v7

    :try_start_4
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v7}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catch_2
    move-exception v7

    :try_start_6
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v7}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_3

    :catchall_0
    move-exception v11

    :try_start_7
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_2

    :catch_3
    move-exception v12

    :try_start_8
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v12}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    :goto_2
    throw v11
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_3
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private c(Ljava/util/List;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/tencent/stat/x;>;I)V"
        }
    .end annotation

    const/4 v9, 0x0

    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "events"

    const-string v3, "status=?"

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v7, "event_id"

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    const/4 v0, 0x1

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/tencent/stat/common/k;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v0, 0x2

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    const/4 v0, 0x3

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v14

    new-instance v0, Lcom/tencent/stat/x;

    move-wide v1, v10

    move-object v3, v12

    move v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/tencent/stat/x;-><init>(JLjava/lang/String;II)V

    move-object v15, v0

    move-object/from16 v0, p1

    invoke-interface {v0, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    if-eqz v9, :cond_2

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catch_0
    move-exception v10

    :try_start_1
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v10}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v9, :cond_2

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_0
    move-exception v16

    if-eqz v9, :cond_1

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_1
    throw v16

    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic d()Lcom/tencent/stat/common/StatLogger;
    .locals 1

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    return-object v0
.end method

.method private e()V
    .locals 7

    :try_start_0
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "status"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "events"

    const-string v2, "status=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const-wide/16 v4, 0x2

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v6, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "events"

    invoke-static {v0, v1}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, p0, Lcom/tencent/stat/n;->b:I

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Total "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/tencent/stat/n;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " unsent events."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->i(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v6}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private f()V
    .locals 11

    const/4 v8, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "keyvalues"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/stat/n;->g:Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    if-eqz v8, :cond_2

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catch_0
    move-exception v9

    :try_start_1
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v9}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v8, :cond_2

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_0
    move-exception v10

    if-eqz v8, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_1
    throw v10

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/tencent/stat/n;->b:I

    return v0
.end method

.method a(I)V
    .locals 2

    iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/stat/v;

    invoke-direct {v1, p0, p1}, Lcom/tencent/stat/v;-><init>(Lcom/tencent/stat/n;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method a(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V
    .locals 5

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableStatService()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-direct {p0, p1, p2}, Lcom/tencent/stat/n;->b(Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/stat/r;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/stat/r;-><init>(Lcom/tencent/stat/n;Lcom/tencent/stat/a/e;Lcom/tencent/stat/c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v4

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v4}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method a(Lcom/tencent/stat/b;)V
    .locals 2

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/stat/s;

    invoke-direct {v1, p0, p1}, Lcom/tencent/stat/s;-><init>(Lcom/tencent/stat/n;Lcom/tencent/stat/b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/tencent/stat/x;>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/tencent/stat/n;->b(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/stat/q;

    invoke-direct {v1, p0, p1}, Lcom/tencent/stat/q;-><init>(Lcom/tencent/stat/n;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v4

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v4}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method a(Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/tencent/stat/x;>;I)V"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/tencent/stat/n;->b(Ljava/util/List;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/stat/p;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/stat/p;-><init>(Lcom/tencent/stat/n;Ljava/util/List;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v4

    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v4}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public declared-synchronized b(Landroid/content/Context;)Lcom/tencent/stat/DeviceInfo;
    .locals 26

    monitor-enter p0

    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit p0

    return-object v0

    :cond_0
    const/4 v9, 0x0

    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "user"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    const/4 v10, 0x0

    const-string v11, ""

    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    move-object v11, v12

    invoke-static {v12}, Lcom/tencent/stat/common/k;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v0, 0x1

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    const/4 v0, 0x2

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    const/4 v0, 0x3

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v15

    const/4 v10, 0x1

    move/from16 v17, v13

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v18, v0, v2

    move/from16 v0, v17

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v15

    invoke-static {v0, v1}, Lcom/tencent/stat/common/k;->a(J)Ljava/lang/String;

    move-result-object v20

    const-wide/16 v0, 0x3e8

    mul-long v0, v0, v18

    invoke-static {v0, v1}, Lcom/tencent/stat/common/k;->a(J)Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v17, 0x1

    :cond_1
    invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    or-int/lit8 v17, v17, 0x2

    :cond_2
    const-string v0, ","

    invoke-virtual {v12, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v20

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    if-eqz v20, :cond_5

    move-object/from16 v0, v20

    array-length v0, v0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    aget-object v22, v20, v0

    if-eqz v22, :cond_3

    invoke-virtual/range {v22 .. v22}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xb

    if-ge v0, v1, :cond_6

    :cond_3
    invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v24

    if-eqz v24, :cond_4

    invoke-virtual/range {v24 .. v24}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_4

    move-object/from16 v22, v24

    const/16 v21, 0x1

    :cond_4
    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v12, v22

    const/16 v21, 0x1

    :cond_6
    :goto_0
    if-eqz v20, :cond_7

    move-object/from16 v0, v20

    array-length v0, v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_7

    const/4 v0, 0x1

    aget-object v23, v20, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    goto :goto_1

    :cond_7
    invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v23

    if-eqz v23, :cond_8

    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/16 v21, 0x1

    :cond_8
    :goto_1
    new-instance v0, Lcom/tencent/stat/DeviceInfo;

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    move/from16 v3, v17

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/stat/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;

    new-instance v24, Landroid/content/ContentValues;

    invoke-direct/range {v24 .. v24}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v12}, Lcom/tencent/stat/common/k;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v0, "uid"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "user_type"

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v24

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "app_ver"

    invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v24

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ts"

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, v24

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    if-eqz v21, :cond_9

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "user"

    const-string v2, "uid=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v11, v3, v4

    move-object/from16 v4, v24

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    :cond_9
    move/from16 v0, v17

    if-eq v0, v13, :cond_a

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "user"

    const/4 v2, 0x0

    move-object/from16 v3, v24

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    :cond_a
    if-nez v10, :cond_c

    invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v12

    invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    move-object v14, v12

    if-eqz v13, :cond_b

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    :cond_b
    const/4 v15, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v16, v0, v2

    invoke-static/range {p1 .. p1}, Lcom/tencent/stat/common/k;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v18

    new-instance v19, Landroid/content/ContentValues;

    invoke-direct/range {v19 .. v19}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v14}, Lcom/tencent/stat/common/k;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v0, "uid"

    move-object/from16 v1, v19

    invoke-virtual {v1, v0, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "user_type"

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v0, "app_ver"

    move-object/from16 v1, v19

    move-object/from16 v2, v18

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ts"

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/n;->d:Lcom/tencent/stat/w;

    invoke-virtual {v0}, Lcom/tencent/stat/w;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "user"

    const/4 v2, 0x0

    move-object/from16 v3, v19

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    new-instance v0, Lcom/tencent/stat/DeviceInfo;

    invoke-direct {v0, v12, v13, v15}, Lcom/tencent/stat/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_c
    if-eqz v9, :cond_e

    :try_start_2
    invoke-interface {v9}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catch_0
    move-exception v10

    :try_start_3
    sget-object v0, Lcom/tencent/stat/n;->e:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v10}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v9, :cond_e

    :try_start_4
    invoke-interface {v9}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_0
    move-exception v25

    if-eqz v9, :cond_d

    :try_start_5
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_d
    throw v25

    :cond_e
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/stat/n;->c:Lcom/tencent/stat/DeviceInfo;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit p0

    return-object v0

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method c()V
    .locals 2

    iget-object v0, p0, Lcom/tencent/stat/n;->a:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/stat/t;

    invoke-direct {v1, p0}, Lcom/tencent/stat/t;-><init>(Lcom/tencent/stat/n;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
