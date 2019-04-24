.class Lcom/shopkick/app/application/SKDiskLogger$PersistThread;
.super Ljava/lang/Thread;
.source "SKDiskLogger.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/SKDiskLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "PersistThread"
.end annotation


# instance fields
.field private tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

.field final synthetic this$0:Lcom/shopkick/app/application/SKDiskLogger;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/SKDiskLogger;Lcom/shopkick/app/application/SKDiskLogger$TableState;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->this$0:Lcom/shopkick/app/application/SKDiskLogger;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 63
    iput-object p2, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    return-void
.end method

.method private sendLogBatch(Ljava/util/List;Ljava/util/List;J)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;J)Z"
        }
    .end annotation

    .line 170
    invoke-direct {p0, p1}, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->sendLogsToServer(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    .line 172
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 173
    iget-object p1, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    iget-object p1, p1, Lcom/shopkick/app/application/SKDiskLogger$TableState;->inMemoryLogs:Ljava/util/List;

    monitor-enter p1

    .line 174
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    iget-object v0, v0, Lcom/shopkick/app/application/SKDiskLogger$TableState;->inMemoryLogs:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 175
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_0
    :goto_0
    const-wide/16 p1, 0x0

    cmp-long p1, p3, p1

    if-lez p1, :cond_1

    .line 179
    :try_start_1
    invoke-static {}, Lcom/shopkick/app/application/SKDiskLogger;->access$200()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    iget-object p2, p2, Lcom/shopkick/app/application/SKDiskLogger$TableState;->tableName:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "timestamp <= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x0

    invoke-virtual {p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private sendLogsToServer(Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 67
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    return v0

    .line 73
    :cond_0
    :try_start_0
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    .line 74
    iget-object v2, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->this$0:Lcom/shopkick/app/application/SKDiskLogger;

    invoke-static {v2}, Lcom/shopkick/app/application/SKDiskLogger;->access$000(Lcom/shopkick/app/application/SKDiskLogger;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "http"

    goto :goto_0

    :cond_1
    const-string v2, "https"

    :goto_0
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 75
    iget-object v2, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->this$0:Lcom/shopkick/app/application/SKDiskLogger;

    iget-object v2, v2, Lcom/shopkick/app/application/SKDiskLogger;->domain:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->encodedAuthority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 76
    iget-object v2, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    iget-object v2, v2, Lcom/shopkick/app/application/SKDiskLogger$TableState;->logUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 78
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catch_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 81
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    const-string v6, "client_event_micros"

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-string v6, "secs_since_event"

    long-to-int v4, v4

    const v5, 0xf4240

    .line 82
    div-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 86
    :cond_2
    :try_start_2
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 87
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    .line 88
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 89
    new-instance v3, Lcom/shopkick/app/fetchers/network/QueryParameter;

    const-string v4, "log_records_json"

    invoke-direct {v3, v4, p1}, Lcom/shopkick/app/fetchers/network/QueryParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    new-instance v3, Lcom/shopkick/app/fetchers/network/QueryParameter;

    const-string v4, "content_length"

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, v4, p1}, Lcom/shopkick/app/fetchers/network/QueryParameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    iget-object p1, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->this$0:Lcom/shopkick/app/application/SKDiskLogger;

    new-instance v3, Lcom/shopkick/app/fetchers/network/NetworkRequest;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lcom/shopkick/app/fetchers/network/NetworkRequest;-><init>(ZLjava/lang/String;)V

    iput-object v3, p1, Lcom/shopkick/app/application/SKDiskLogger;->logUploadRequest:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    .line 92
    iget-object p1, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->this$0:Lcom/shopkick/app/application/SKDiskLogger;

    iget-object p1, p1, Lcom/shopkick/app/application/SKDiskLogger;->logUploadRequest:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/app/fetchers/network/NetworkRequest;->populateURL(Landroid/net/Uri$Builder;Ljava/util/ArrayList;)V

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->this$0:Lcom/shopkick/app/application/SKDiskLogger;

    iget-object p1, p1, Lcom/shopkick/app/application/SKDiskLogger;->netMgr:Lcom/shopkick/app/fetchers/network/NetworkManager;

    iget-object v1, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->this$0:Lcom/shopkick/app/application/SKDiskLogger;

    iget-object v1, v1, Lcom/shopkick/app/application/SKDiskLogger;->logUploadRequest:Lcom/shopkick/app/fetchers/network/NetworkRequest;

    invoke-virtual {p1, v1, v5}, Lcom/shopkick/app/fetchers/network/NetworkManager;->fetchInBackground(Lcom/shopkick/app/fetchers/network/NetworkRequest;Lcom/shopkick/app/fetchers/network/INetworkCallback;)Lcom/shopkick/app/fetchers/DataResponse;

    move-result-object p1

    .line 94
    iget-boolean p1, p1, Lcom/shopkick/app/fetchers/DataResponse;->success:Z
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_1

    return p1

    :catch_1
    return v0
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 103
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    iget-boolean v0, v0, Lcom/shopkick/app/application/SKDiskLogger$TableState;->shouldUpload:Z

    if-eqz v0, :cond_4

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/shopkick/app/application/SKDiskLogger$TableState;->shouldUpload:Z

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 108
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 109
    iget-object v3, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    iget-object v3, v3, Lcom/shopkick/app/application/SKDiskLogger$TableState;->inMemoryLogs:Ljava/util/List;

    monitor-enter v3

    .line 110
    :try_start_0
    iget-object v4, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    iget-object v4, v4, Lcom/shopkick/app/application/SKDiskLogger$TableState;->inMemoryLogs:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 111
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 112
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    .line 113
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 117
    :cond_1
    invoke-static {}, Lcom/shopkick/app/application/SKDiskLogger;->access$100()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Query database table: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    iget-object v5, v5, Lcom/shopkick/app/application/SKDiskLogger$TableState;->tableName:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " at path: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/shopkick/app/application/SKDiskLogger;->access$200()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    invoke-static {}, Lcom/shopkick/app/application/SKDiskLogger;->access$200()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    iget-object v3, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    iget-object v6, v3, Lcom/shopkick/app/application/SKDiskLogger$TableState;->tableName:Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string/jumbo v12, "timestamp"

    invoke-virtual/range {v5 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    const-wide/16 v5, 0x0

    .line 121
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 122
    iget-object v7, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->this$0:Lcom/shopkick/app/application/SKDiskLogger;

    invoke-static {v7}, Lcom/shopkick/app/application/SKDiskLogger;->access$300(Lcom/shopkick/app/application/SKDiskLogger;)I

    move-result v7

    :catch_0
    :goto_2
    if-lt v3, v7, :cond_2

    .line 126
    :try_start_1
    invoke-direct {p0, v0, v2, v5, v6}, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->sendLogBatch(Ljava/util/List;Ljava/util/List;J)Z

    move-result v3

    .line 127
    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_3

    move v3, v1

    .line 136
    :cond_2
    :try_start_2
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 138
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    const/4 v8, 0x1

    .line 139
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 140
    new-instance v9, Lcom/shopkick/app/application/SKDiskLogger$PersistThread$1;

    invoke-direct {v9, p0}, Lcom/shopkick/app/application/SKDiskLogger$PersistThread$1;-><init>(Lcom/shopkick/app/application/SKDiskLogger$PersistThread;)V

    invoke-virtual {v9}, Lcom/shopkick/app/application/SKDiskLogger$PersistThread$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v9

    .line 141
    sget-object v10, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v10, v8, v9}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    .line 142
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lcom/google/gson/JsonParseException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 155
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    throw v0

    :catch_1
    :cond_3
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 159
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 160
    invoke-direct {p0, v0, v2, v5, v6}, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->sendLogBatch(Ljava/util/List;Ljava/util/List;J)Z

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    .line 111
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 166
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->tableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/shopkick/app/application/SKDiskLogger$TableState;->persistThread:Lcom/shopkick/app/application/SKDiskLogger$PersistThread;

    return-void
.end method
