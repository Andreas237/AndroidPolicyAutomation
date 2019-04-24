.class Lcom/tencent/stat/t;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/tencent/stat/n;


# direct methods
.method constructor <init>(Lcom/tencent/stat/n;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/stat/t;->a:Lcom/tencent/stat/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 15

    const/4 v8, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/tencent/stat/t;->a:Lcom/tencent/stat/n;

    invoke-static {v0}, Lcom/tencent/stat/n;->b(Lcom/tencent/stat/n;)Lcom/tencent/stat/w;

    move-result-object v0

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

    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    const/4 v0, 0x1

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    const/4 v0, 0x2

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    const/4 v0, 0x3

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    new-instance v13, Lcom/tencent/stat/b;

    invoke-direct {v13, v9}, Lcom/tencent/stat/b;-><init>(I)V

    iput v9, v13, Lcom/tencent/stat/b;->a:I

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, v13, Lcom/tencent/stat/b;->b:Lorg/json/JSONObject;

    iput-object v11, v13, Lcom/tencent/stat/b;->c:Ljava/lang/String;

    iput v12, v13, Lcom/tencent/stat/b;->d:I

    invoke-static {v13}, Lcom/tencent/stat/StatConfig;->a(Lcom/tencent/stat/b;)V
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
    invoke-static {}, Lcom/tencent/stat/n;->d()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v8, :cond_2

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    :catchall_0
    move-exception v14

    if-eqz v8, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_1
    throw v14

    :cond_2
    :goto_1
    return-void
.end method
