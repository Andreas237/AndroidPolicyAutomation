.class public Lcom/yandex/metrica/impl/ob/es;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/es$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field private final b:Ljava/util/concurrent/locks/Lock;

.field private final c:Ljava/util/concurrent/locks/Lock;

.field private final d:Lcom/yandex/metrica/impl/ob/et;

.field private final e:Lcom/yandex/metrica/impl/ob/es$a;

.field private final f:Ljava/lang/Object;

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/ContentValues;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Landroid/content/Context;

.field private final i:Lcom/yandex/metrica/impl/ob/ab;

.field private final j:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/et;)V
    .locals 2

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 65
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    .line 66
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    .line 72
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->f:Ljava/lang/Object;

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->g:Ljava/util/List;

    .line 77
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->j:Ljava/util/concurrent/atomic/AtomicLong;

    .line 80
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    .line 81
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->c()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->h:Landroid/content/Context;

    .line 82
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->i:Lcom/yandex/metrica/impl/ob/ab;

    .line 84
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->j:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/es;->b()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 86
    new-instance p2, Lcom/yandex/metrica/impl/ob/es$a;

    invoke-direct {p2, p0}, Lcom/yandex/metrica/impl/ob/es$a;-><init>(Lcom/yandex/metrica/impl/ob/es;)V

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->e:Lcom/yandex/metrica/impl/ob/es$a;

    .line 87
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->e:Lcom/yandex/metrica/impl/ob/es$a;

    .line 1098
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DatabaseWorker ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 87
    invoke-virtual {p2, p1}, Lcom/yandex/metrica/impl/ob/es$a;->setName(Ljava/lang/String;)V

    .line 88
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->e:Lcom/yandex/metrica/impl/ob/es$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/es$a;->start()V

    .line 90
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/es;->c()V

    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 10
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 324
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/et;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "reports"

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, p1

    .line 325
    invoke-virtual/range {v1 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private static a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 528
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 530
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 531
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_0

    const-string v1, " AND "

    goto :goto_1

    :cond_0
    const-string v1, ""

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " = ? "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 535
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Landroid/content/ContentValues;Ljava/lang/String;)V
    .locals 2

    const-string v0, "type"

    .line 3550
    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3551
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    .line 449
    :goto_0
    invoke-static {v0}, Lcom/yandex/metrica/impl/q;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 450
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string p2, ": "

    .line 451
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "name"

    .line 3555
    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/ob/es;->b(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 452
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "value"

    .line 3559
    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/ob/es;->b(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "type"

    .line 3573
    invoke-virtual {p1, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 454
    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->c(I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, " with value "

    .line 455
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    :cond_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->i:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->o()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/lv;->a(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/es;Ljava/util/List;)V
    .locals 7

    if-eqz p1, :cond_3

    .line 4417
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    .line 4422
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    .line 4424
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/et;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 4426
    :try_start_1
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/es;->j:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/16 v4, 0xa

    rem-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    .line 4427
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/es;->c()V

    .line 4430
    :cond_1
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 4432
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ContentValues;

    const-string v3, "reports"

    .line 4433
    invoke-virtual {v1, v3, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    const-string v3, "Event saved to db"

    .line 4434
    invoke-direct {p0, v2, v3}, Lcom/yandex/metrica/impl/ob/es;->a(Landroid/content/ContentValues;Ljava/lang/String;)V

    goto :goto_0

    .line 4437
    :cond_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 4438
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->j:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4443
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 4444
    :goto_1
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-object v0, v1

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v1, v0

    .line 4443
    :goto_2
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 4444
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 4445
    throw p1

    .line 4443
    :catch_1
    :goto_3
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_1

    :cond_3
    :goto_4
    return-void
.end method

.method private a(Ljava/util/List;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/ContentValues;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 463
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 464
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ContentValues;

    invoke-direct {p0, v1, p2}, Lcom/yandex/metrica/impl/ob/es;->a(Landroid/content/ContentValues;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/es;)Z
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/es;->d()Z

    move-result p0

    return p0
.end method

.method private static a([Ljava/lang/String;Ljava/util/Map;)[Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 539
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 540
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 542
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    .line 543
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 546
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    invoke-interface {v0, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method private b()J
    .locals 3

    .line 143
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 145
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/et;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "reports"

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/ln;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 150
    throw v0

    .line 149
    :catch_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/es;)Ljava/lang/Object;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/es;->f:Ljava/lang/Object;

    return-object p0
.end method

.method private static b(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 564
    invoke-virtual {p0, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, ""

    .line 563
    invoke-static {p0, p1}, Lcom/yandex/metrica/impl/bp;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lcom/yandex/metrica/impl/ob/es;)Ljava/util/List;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/es;->g:Ljava/util/List;

    return-object p0
.end method

.method private c()V
    .locals 6

    .line 222
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 223
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/et;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 224
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1

    const-wide/32 v3, 0x500000

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 227
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/es;->a(Landroid/database/sqlite/SQLiteDatabase;)I

    move-result v0

    .line 228
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->j:Ljava/util/concurrent/atomic/AtomicLong;

    neg-int v0, v0

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    :catch_0
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 235
    throw v0
.end method

.method private d()Z
    .locals 2

    .line 651
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->f:Ljava/lang/Object;

    monitor-enter v0

    .line 652
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 653
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method final a(Landroid/database/sqlite/SQLiteDatabase;)I
    .locals 8
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    .line 242
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/q;->a:Ljava/util/EnumSet;

    invoke-virtual {v1}, Ljava/util/EnumSet;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/Integer;

    .line 244
    sget-object v2, Lcom/yandex/metrica/impl/q;->a:Ljava/util/EnumSet;

    invoke-virtual {v2}, Ljava/util/EnumSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/yandex/metrica/impl/q$a;

    add-int/lit8 v5, v3, 0x1

    .line 245
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v3

    move v3, v5

    goto :goto_0

    .line 3028
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    .line 248
    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0xe

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v4

    sub-long v6, v2, v4

    const-string v2, "%1$s NOT IN (%2$s) AND (%3$s IN (SELECT %3$s FROM %4$s ORDER BY %5$s, %6$s LIMIT (SELECT count() FROM %4$s) / %7$s ) OR %5$s < %8$s )"

    const/16 v3, 0x8

    .line 249
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "type"

    aput-object v4, v3, v0

    const-string v4, ","

    .line 250
    invoke-static {v4, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v1, 0x2

    const-string v4, "id"

    aput-object v4, v3, v1

    const/4 v1, 0x3

    const-string v4, "reports"

    aput-object v4, v3, v1

    const/4 v1, 0x4

    const-string v4, "session_id"

    aput-object v4, v3, v1

    const/4 v1, 0x5

    const-string v4, "number"

    aput-object v4, v3, v1

    const/4 v1, 0x6

    const/16 v4, 0xa

    .line 253
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v1, 0x7

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v1

    .line 249
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "reports"

    const/4 v3, 0x0

    .line 255
    invoke-virtual {p1, v2, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 258
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->h:Landroid/content/Context;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v1

    const-string v2, "deleteExcessiveReports exception"

    .line 259
    invoke-interface {v1, v2, p1}, Lcom/yandex/metrica/b;->reportError(Ljava/lang/String;Ljava/lang/Throwable;)V

    move p1, v0

    :goto_1
    return p1
.end method

.method public a([J)I
    .locals 6

    .line 170
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    .line 172
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/eq;->a:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2193
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v1, 0x0

    .line 2195
    :try_start_1
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/et;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, " SELECT DISTINCT id From sessions order by id asc "

    .line 2196
    new-array v4, v0, [Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 2197
    :try_start_2
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "All sessions in db: "

    .line 2198
    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 2199
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 2200
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_0
    const-string v4, " SELECT DISTINCT session_id From reports order by session_id asc "

    .line 2204
    new-array v5, v0, [Ljava/lang/String;

    invoke-virtual {v2, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 2205
    :try_start_3
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "All sessions in reports db: "

    .line 2206
    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 2207
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 2208
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v4, ", "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 2214
    :cond_1
    :try_start_4
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 2215
    invoke-static {v3}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 2216
    invoke-static {v2}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    goto :goto_4

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_2

    :catch_0
    move-object v1, v2

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object v3, v1

    .line 2214
    :goto_2
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 2215
    invoke-static {v3}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 2216
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 2217
    throw p1

    :catch_1
    move-object v3, v1

    .line 2214
    :catch_2
    :goto_3
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 2215
    invoke-static {v3}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 2216
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 176
    :cond_2
    :goto_4
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/et;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "sessions"

    .line 177
    sget-object v3, Lcom/yandex/metrica/impl/ob/eq$ah;->c:Ljava/lang/String;

    .line 178
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a([J)[Ljava/lang/String;

    move-result-object p1

    .line 177
    invoke-virtual {v1, v2, v3, p1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 184
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_5

    :catchall_3
    move-exception p1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 185
    throw p1

    .line 184
    :catch_3
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move p1, v0

    :goto_5
    return p1
.end method

.method public a()J
    .locals 3

    .line 577
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 579
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->j:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 581
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-wide v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 582
    throw v0
.end method

.method public a(JLcom/yandex/metrica/impl/ob/dr;)Landroid/database/Cursor;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/sqlite/SQLiteException;
        }
    .end annotation

    .line 381
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 383
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/et;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "reports"

    const/4 v3, 0x0

    const-string v4, "session_id = ? AND session_type = ?"

    const/4 v0, 0x2

    .line 384
    new-array v5, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    .line 387
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v5, v0

    const/4 p1, 0x1

    invoke-virtual {p3}, Lcom/yandex/metrica/impl/ob/dr;->a()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v5, p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "number ASC"

    const/4 v9, 0x0

    .line 384
    invoke-virtual/range {v1 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 393
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 394
    throw p1

    .line 393
    :catch_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public a(JLjava/util/Map;)Landroid/database/Cursor;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/database/Cursor;"
        }
    .end annotation

    .line 359
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 361
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/et;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "sessions"

    const/4 v3, 0x0

    const-string v0, "id = ?"

    .line 364
    invoke-static {v0, p3}, Lcom/yandex/metrica/impl/ob/es;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v5, 0x0

    .line 365
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v5

    invoke-static {v0, p3}, Lcom/yandex/metrica/impl/ob/es;->a([Ljava/lang/String;Ljava/util/Map;)[Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 362
    invoke-virtual/range {v1 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 371
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 372
    throw p1

    .line 371
    :catch_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public a(Ljava/util/Map;)Landroid/database/Cursor;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroid/database/Cursor;"
        }
    .end annotation

    .line 337
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 339
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/et;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "sessions"

    const/4 v3, 0x0

    const-string v0, "id >= ?"

    .line 342
    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/ob/es;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    .line 343
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v0, v5

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/ob/es;->a([Ljava/lang/String;Ljava/util/Map;)[Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "id ASC"

    const/4 v9, 0x0

    .line 340
    invoke-virtual/range {v1 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 349
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 350
    throw p1

    .line 349
    :catch_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public a(Ljava/lang/Long;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/ContentValues;",
            ">;"
        }
    .end annotation

    .line 470
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 472
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x0

    .line 475
    :try_start_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/et;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "SELECT DISTINCT report_request_parameters FROM sessions WHERE id >= 0"

    if-eqz p1, :cond_0

    .line 480
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "SELECT DISTINCT report_request_parameters FROM sessions WHERE id = %s"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 484
    :cond_0
    invoke-virtual {v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 485
    :goto_0
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 486
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 487
    invoke-static {p1, v1}, Landroid/database/DatabaseUtils;->cursorRowToContentValues(Landroid/database/Cursor;Landroid/content/ContentValues;)V

    .line 488
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 494
    :cond_1
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    goto :goto_3

    :catch_0
    move-object v1, p1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    .line 491
    :catch_1
    :goto_1
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 494
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 495
    :goto_2
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    .line 494
    :goto_3
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 495
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 496
    throw p1
.end method

.method public a(JII)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/sqlite/SQLiteException;
        }
    .end annotation

    if-gtz p4, :cond_0

    return-void

    .line 272
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    .line 275
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/et;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 276
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)"

    const/4 v4, 0x7

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "session_id"

    aput-object v6, v4, v5

    .line 278
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v4, p2

    const/4 p1, 0x2

    const-string v5, "session_type"

    aput-object v5, v4, p1

    const/4 p1, 0x3

    .line 279
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p3

    aput-object p3, v4, p1

    const/4 p1, 0x4

    const-string p3, "id"

    aput-object p3, v4, p1

    const/4 p1, 0x5

    const-string p3, "reports"

    aput-object p3, v4, p1

    const/4 p1, 0x6

    sub-int/2addr p4, p2

    .line 281
    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v4, p1

    .line 276
    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 285
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->i:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ab;->o()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p2

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/lv;->b()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 286
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/es;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p2, :cond_1

    .line 3309
    :try_start_1
    invoke-interface {p2}, Landroid/database/Cursor;->getCount()I

    move-result p3

    if-lez p3, :cond_1

    .line 3310
    new-instance p3, Ljava/util/ArrayList;

    invoke-interface {p2}, Landroid/database/Cursor;->getCount()I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 3311
    :goto_0
    invoke-interface {p2}, Landroid/database/Cursor;->moveToNext()Z

    move-result p4

    if-eqz p4, :cond_3

    .line 3312
    new-instance p4, Landroid/content/ContentValues;

    invoke-direct {p4}, Landroid/content/ContentValues;-><init>()V

    .line 3313
    invoke-static {p2, p4}, Landroid/database/DatabaseUtils;->cursorRowToContentValues(Landroid/database/Cursor;Landroid/content/ContentValues;)V

    .line 3314
    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object p3, v0

    goto :goto_1

    :cond_2
    move-object p2, v0

    move-object p3, p2

    :cond_3
    :goto_1
    const-string p4, "reports"

    .line 290
    invoke-virtual {v1, p4, p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    if-eqz p3, :cond_4

    const-string p4, "Event removed from db"

    .line 294
    invoke-direct {p0, p3, p4}, Lcom/yandex/metrica/impl/ob/es;->a(Ljava/util/List;Ljava/lang/String;)V

    .line 296
    :cond_4
    iget-object p3, p0, Lcom/yandex/metrica/impl/ob/es;->j:Ljava/util/concurrent/atomic/AtomicLong;

    neg-int p1, p1

    int-to-long v0, p1

    invoke-virtual {p3, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 301
    :catch_0
    :goto_2
    invoke-static {p2}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 302
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    move-object v0, p2

    goto :goto_3

    :catchall_1
    move-exception p1

    .line 301
    :goto_3
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 302
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 303
    throw p1

    :catch_1
    move-object p2, v0

    goto :goto_2
.end method

.method public a(JLcom/yandex/metrica/impl/ob/dr;J)V
    .locals 2

    .line 105
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "id"

    .line 106
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string p1, "start_time"

    .line 107
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string p1, "server_time_offset"

    .line 108
    invoke-static {}, Lcom/yandex/metrica/impl/ob/mb;->a()J

    move-result-wide p4

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string p1, "obtained_before_first_sync"

    .line 110
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lx;->a()Lcom/yandex/metrica/impl/ob/lx;

    move-result-object p2

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/lx;->d()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    .line 109
    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string p1, "type"

    .line 111
    invoke-virtual {p3}, Lcom/yandex/metrica/impl/ob/dr;->a()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 113
    new-instance p1, Lcom/yandex/metrica/impl/k;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->h:Landroid/content/Context;

    invoke-direct {p1, p2}, Lcom/yandex/metrica/impl/k;-><init>(Landroid/content/Context;)V

    .line 114
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/es;->i:Lcom/yandex/metrica/impl/ob/ab;

    .line 115
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/k;->a(Lcom/yandex/metrica/impl/ob/jv;)Lcom/yandex/metrica/impl/k;

    move-result-object p1

    .line 116
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/k;->a(Landroid/content/ContentValues;)Lcom/yandex/metrica/impl/k;

    move-result-object p1

    .line 117
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/k;->a()V

    .line 119
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/es;->a(Landroid/content/ContentValues;)V

    return-void
.end method

.method public a(Landroid/content/ContentValues;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1404
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 1406
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/et;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "sessions"

    const/4 v2, 0x0

    .line 1407
    invoke-virtual {v0, v1, v2, p1}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1412
    :catch_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->c:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 1413
    throw p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/er;)V
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->e:Lcom/yandex/metrica/impl/ob/es$a;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/es$a;->a(Lcom/yandex/metrica/impl/ob/er;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ml;Lcom/yandex/metrica/impl/ob/do;Lcom/yandex/metrica/impl/a$a;)V
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/ml;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/do;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 125
    new-instance v0, Landroid/content/ContentValues;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(I)V

    const-string v1, "number"

    .line 126
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/do;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v1, "time"

    .line 127
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/do;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v1, "session_id"

    .line 128
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/do;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v1, "session_type"

    .line 129
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/do;->b()Lcom/yandex/metrica/impl/ob/dr;

    move-result-object p2

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/dr;->a()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 131
    new-instance p2, Lcom/yandex/metrica/impl/k;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->h:Landroid/content/Context;

    invoke-direct {p2, v1}, Lcom/yandex/metrica/impl/k;-><init>(Landroid/content/Context;)V

    .line 132
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->i:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ab;->l()Lcom/yandex/metrica/impl/ob/jv;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/yandex/metrica/impl/k;->a(Lcom/yandex/metrica/impl/ob/jv;)Lcom/yandex/metrica/impl/k;

    move-result-object p2

    .line 133
    invoke-virtual {p2, v0}, Lcom/yandex/metrica/impl/k;->a(Landroid/content/ContentValues;)Lcom/yandex/metrica/impl/k;

    move-result-object p2

    .line 134
    invoke-virtual {p2, p1, p3}, Lcom/yandex/metrica/impl/k;->a(Lcom/yandex/metrica/impl/ob/ml;Lcom/yandex/metrica/impl/a$a;)V

    .line 138
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/es;->b(Landroid/content/ContentValues;)V

    return-void
.end method

.method public b(JLcom/yandex/metrica/impl/ob/dr;)Landroid/content/ContentValues;
    .locals 7

    .line 502
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 504
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x0

    .line 507
    :try_start_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/es;->d:Lcom/yandex/metrica/impl/ob/et;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/et;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 509
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v5, v6

    const/4 p1, 0x1

    .line 510
    invoke-virtual {p3}, Lcom/yandex/metrica/impl/ob/dr;->a()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v5, p1

    .line 509
    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 511
    invoke-virtual {v2, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 512
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 513
    new-instance p2, Landroid/content/ContentValues;

    invoke-direct {p2}, Landroid/content/ContentValues;-><init>()V

    .line 514
    invoke-static {p1, p2}, Landroid/database/DatabaseUtils;->cursorRowToContentValues(Landroid/database/Cursor;Landroid/content/ContentValues;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, p2

    goto :goto_1

    :catchall_0
    move-exception p2

    move-object v1, p1

    goto :goto_0

    :catchall_1
    move-exception p2

    .line 520
    :goto_0
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 521
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 522
    throw p2

    :catch_0
    move-object p1, v1

    .line 520
    :catch_1
    :cond_0
    :goto_1
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 521
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0
.end method

.method public b(Landroid/content/ContentValues;)V
    .locals 2

    .line 159
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->f:Ljava/lang/Object;

    monitor-enter v0

    .line 160
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es;->g:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 163
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/es;->e:Lcom/yandex/metrica/impl/ob/es$a;

    monitor-enter p1

    .line 164
    :try_start_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->e:Lcom/yandex/metrica/impl/ob/es$a;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 165
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catchall_1
    move-exception p1

    .line 161
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public close()V
    .locals 1

    .line 641
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 642
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es;->e:Lcom/yandex/metrica/impl/ob/es$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/es$a;->a()V

    return-void
.end method
