.class public abstract Lcom/huawei/openalliance/ad/e/a;
.super Ljava/lang/Object;


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:Lcom/huawei/openalliance/ad/e/a/e;


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->b:Lcom/huawei/openalliance/ad/e/a/e;

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Class;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lcom/huawei/openalliance/ad/db/bean/RecordBean;>(Ljava/lang/Class<TT;>;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->b:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->r()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/db/a;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/db/a;

    move-result-object v2

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/openalliance/ad/e/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, p2, v1, p4}, Lcom/huawei/openalliance/ad/db/a;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    invoke-virtual {p0, v2}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    goto :goto_0

    :catchall_0
    move-exception v4

    invoke-virtual {p0, v2}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    throw v4

    :goto_0
    return v3
.end method

.method protected a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lcom/huawei/openalliance/ad/db/bean/RecordBean;>(Ljava/lang/Class<TT;>;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/db/a;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/db/a;

    move-result-object v1

    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/e/g;->a()Ljava/lang/String;

    move-result-object v2

    :goto_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2, p3}, Lcom/huawei/openalliance/ad/db/a;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    invoke-virtual {p0, v1}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    goto :goto_1

    :catchall_0
    move-exception v4

    invoke-virtual {p0, v1}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    throw v4

    :goto_1
    return v3
.end method

.method protected a(Ljava/lang/Class;Landroid/content/ContentValues;)J
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lcom/huawei/openalliance/ad/db/bean/RecordBean;>(Ljava/lang/Class<TT;>;Landroid/content/ContentValues;)J"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->b:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->r()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/db/a;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/db/a;

    move-result-object v2

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, p2}, Lcom/huawei/openalliance/ad/db/a;->a(Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v3

    invoke-virtual {p0, v2}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    goto :goto_0

    :catchall_0
    move-exception v5

    invoke-virtual {p0, v2}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    throw v5

    :goto_0
    return-wide v3
.end method

.method protected a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lcom/huawei/openalliance/ad/db/bean/RecordBean;>(Ljava/lang/Class<TT;>;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<TT;>;"
        }
    .end annotation

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-ne v0, v1, :cond_0

    const/4 v8, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/openalliance/ad/e/g;->a()Ljava/lang/String;

    move-result-object v8

    :goto_0
    const/4 v9, 0x0

    const/4 v10, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/db/a;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/db/a;

    move-result-object v0

    move-object v9, v0

    move-object v0, v9

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p2

    move-object v3, v8

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/db/a;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    if-eqz v10, :cond_1

    :goto_1
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/openalliance/ad/db/bean/RecordBean;

    invoke-virtual {v11, v10}, Lcom/huawei/openalliance/ad/db/bean/RecordBean;->toBean(Landroid/database/Cursor;)V

    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v12

    const-string v0, "BaseDao"

    const-string v1, "query InstantiationException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v12

    const-string v0, "BaseDao"

    const-string v1, "query IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_2
    move-exception v12

    const-string v0, "BaseDao"

    const-string v1, "query exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v10}, Lcom/huawei/openalliance/ad/e/a;->a(Landroid/database/Cursor;)V

    invoke-virtual {p0, v9}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    goto :goto_2

    :catchall_0
    move-exception v13

    invoke-virtual {p0, v10}, Lcom/huawei/openalliance/ad/e/a;->a(Landroid/database/Cursor;)V

    invoke-virtual {p0, v9}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    throw v13

    :goto_2
    return-object v7
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method protected a(Landroid/database/Cursor;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "BaseDao"

    const-string v1, "closeCursor exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method protected a(Lcom/huawei/openalliance/ad/db/a;)V
    .locals 1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/a;->a()V

    :cond_0
    return-void
.end method

.method protected a(Ljava/lang/Class;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lcom/huawei/openalliance/ad/db/bean/RecordBean;>(Ljava/lang/Class<TT;>;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->b:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->r()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/db/a;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/db/a;

    move-result-object v2

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/openalliance/ad/e/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, p2, v1, p4}, Lcom/huawei/openalliance/ad/db/a;->a(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v2}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    goto :goto_0

    :catchall_0
    move-exception v3

    invoke-virtual {p0, v2}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    throw v3

    :goto_0
    return-void
.end method

.method protected a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lcom/huawei/openalliance/ad/db/bean/RecordBean;>(Ljava/lang/Class<TT;>;Lcom/huawei/openalliance/ad/e/g;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/db/a;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/db/a;

    move-result-object v2

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/e/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1, p3}, Lcom/huawei/openalliance/ad/db/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v2}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    goto :goto_0

    :catchall_0
    move-exception v3

    invoke-virtual {p0, v2}, Lcom/huawei/openalliance/ad/e/a;->a(Lcom/huawei/openalliance/ad/db/a;)V

    throw v3

    :goto_0
    return-void
.end method
