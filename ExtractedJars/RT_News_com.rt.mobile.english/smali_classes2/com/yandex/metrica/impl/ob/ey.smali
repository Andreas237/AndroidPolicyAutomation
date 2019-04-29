.class public Lcom/yandex/metrica/impl/ob/ey;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/fc;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/et;Ljava/lang/String;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Lcom/yandex/metrica/impl/ob/fe;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/fe;-><init>(Lcom/yandex/metrica/impl/ob/et;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ey;->a:Lcom/yandex/metrica/impl/ob/fc;

    .line 36
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ey;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 12
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/hs;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 44
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ey;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v1}, Lcom/yandex/metrica/impl/ob/fc;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 45
    :try_start_1
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ey;->b:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v1

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_2

    .line 46
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 47
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    const-string v4, "name"

    .line 49
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    const-string v5, "granted"

    .line 51
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    .line 52
    new-instance v6, Lcom/yandex/metrica/impl/ob/hs;

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    const-wide/16 v9, 0x1

    cmp-long v5, v7, v9

    if-nez v5, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-direct {v6, v4, v5}, Lcom/yandex/metrica/impl/ob/hs;-><init>(Ljava/lang/String;Z)V

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v4, :cond_0

    .line 62
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ey;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 63
    invoke-static {v2}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    return-object v3

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 62
    :cond_2
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ey;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v3, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 63
    invoke-static {v2}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    return-object v0

    :catchall_1
    move-exception v2

    move-object v11, v2

    move-object v2, v0

    move-object v0, v11

    goto :goto_1

    :catch_0
    move-object v2, v0

    goto :goto_2

    :catchall_2
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    move-object v1, v2

    .line 62
    :goto_1
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ey;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v3, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 63
    invoke-static {v2}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 64
    throw v0

    :catch_1
    move-object v1, v0

    move-object v2, v1

    .line 62
    :catch_2
    :goto_2
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ey;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v3, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 63
    invoke-static {v2}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    return-object v0
.end method

.method public a(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/hs;",
            ">;)V"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ey;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/fc;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 70
    :try_start_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const-string v1, "delete from permissions"

    .line 71
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 72
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/hs;

    .line 73
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "name"

    .line 76
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hs;->b()Ljava/lang/String;

    move-result-object v4

    .line 74
    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "granted"

    .line 80
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hs;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 78
    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "permissions"

    const/4 v3, 0x0

    .line 82
    invoke-virtual {v0, v1, v3, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    :catch_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 88
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ey;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p1, v0}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void

    :catchall_0
    move-exception p1

    .line 87
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 88
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ey;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v1, v0}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 89
    throw p1
.end method
