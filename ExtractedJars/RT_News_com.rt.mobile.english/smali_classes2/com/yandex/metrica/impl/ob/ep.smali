.class public Lcom/yandex/metrica/impl/ob/ep;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/fc;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/fc;Ljava/lang/String;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/fc;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ep;->a:Lcom/yandex/metrica/impl/ob/fc;

    .line 31
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ep;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;[B)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 37
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ep;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v1}, Lcom/yandex/metrica/impl/ob/fc;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    :try_start_1
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "data_key"

    .line 39
    invoke-virtual {v2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "value"

    .line 40
    invoke-virtual {v2, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 41
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ep;->b:Ljava/lang/String;

    const/4 p2, 0x5

    invoke-virtual {v1, p1, v0, v2, p2}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ep;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p1, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-object v0, v1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v1, v0

    :goto_0
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ep;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p2, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 46
    throw p1

    .line 45
    :catch_1
    :goto_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ep;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p1, v0}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method public a(Ljava/lang/String;)[B
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 53
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ep;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v1}, Lcom/yandex/metrica/impl/ob/fc;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 54
    :try_start_1
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ep;->b:Ljava/lang/String;

    sget-object v4, Lcom/yandex/metrica/impl/ob/eq$b;->a:[Ljava/lang/String;

    const-string v5, "data_key = ?"

    const/4 v10, 0x1

    new-array v6, v10, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v6, v2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v1

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p1, :cond_0

    .line 58
    :try_start_2
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v2

    if-ne v2, v10, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "value"

    .line 59
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 69
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ep;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p1, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    return-object v2

    :catchall_0
    move-exception v0

    move-object v11, v0

    move-object v0, p1

    move-object p1, v11

    goto :goto_0

    .line 68
    :cond_0
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 69
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ep;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p1, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    return-object v0

    :catchall_1
    move-exception p1

    goto :goto_0

    :catch_0
    move-object p1, v0

    goto :goto_1

    :catchall_2
    move-exception p1

    move-object v1, v0

    .line 68
    :goto_0
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 69
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ep;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 70
    throw p1

    :catch_1
    move-object p1, v0

    move-object v1, p1

    .line 68
    :catch_2
    :goto_1
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Landroid/database/Cursor;)V

    .line 69
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ep;->a:Lcom/yandex/metrica/impl/ob/fc;

    invoke-interface {p1, v1}, Lcom/yandex/metrica/impl/ob/fc;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    return-object v0
.end method
