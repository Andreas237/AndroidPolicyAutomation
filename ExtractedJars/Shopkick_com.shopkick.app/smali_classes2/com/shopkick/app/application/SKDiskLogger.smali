.class public Lcom/shopkick/app/application/SKDiskLogger;
.super Ljava/lang/Object;
.source "SKDiskLogger.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;,
        Lcom/shopkick/app/application/SKDiskLogger$TableState;,
        Lcom/shopkick/app/application/SKDiskLogger$PersistThread;
    }
.end annotation


# static fields
.field public static final CLIENT_LOG_TABLE:Ljava/lang/String; = "sklogs"

.field private static final CLIENT_LOG_URL:Ljava/lang/String; = "/shopkick/v1/log/client_log"

.field private static final DATABASE_NAME:Ljava/lang/String; = "logs"

.field private static final DATABASE_VERSION:I = 0x1

.field private static final DATA_COLUMN:Ljava/lang/String; = "data"

.field private static final DEFAULT_BATCH_SIZE:I = 0x14

.field private static final HTTP:Ljava/lang/String; = "http"

.field private static final HTTPS:Ljava/lang/String; = "https"

.field private static final LOG_TAG:Ljava/lang/String; = "SKDiskLogger"

.field public static final PRESENCE_DETAIL_LOG_TABLE:Ljava/lang/String; = "presence_detail_logs"

.field private static final TIMESTAMP_COLUMN:Ljava/lang/String; = "timestamp"

.field private static database:Landroid/database/sqlite/SQLiteDatabase;

.field private static databaseHelper:Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;


# instance fields
.field private batchSize:I

.field private final clientTableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

.field private disableHTTPS:Z

.field domain:Ljava/lang/String;

.field logUploadRequest:Lcom/shopkick/app/fetchers/network/NetworkRequest;

.field netMgr:Lcom/shopkick/app/fetchers/network/NetworkManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/fetchers/network/NetworkManager;Ljava/lang/String;Z)V
    .locals 1

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    iput-object p2, p0, Lcom/shopkick/app/application/SKDiskLogger;->netMgr:Lcom/shopkick/app/fetchers/network/NetworkManager;

    .line 222
    iput-object p3, p0, Lcom/shopkick/app/application/SKDiskLogger;->domain:Ljava/lang/String;

    .line 223
    new-instance p2, Lcom/shopkick/app/application/SKDiskLogger$TableState;

    const-string/jumbo p3, "sklogs"

    const-string v0, "/shopkick/v1/log/client_log"

    invoke-direct {p2, p0, p3, v0}, Lcom/shopkick/app/application/SKDiskLogger$TableState;-><init>(Lcom/shopkick/app/application/SKDiskLogger;Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/shopkick/app/application/SKDiskLogger;->clientTableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    const/16 p2, 0x14

    .line 224
    iput p2, p0, Lcom/shopkick/app/application/SKDiskLogger;->batchSize:I

    .line 225
    iput-boolean p4, p0, Lcom/shopkick/app/application/SKDiskLogger;->disableHTTPS:Z

    .line 226
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/SKDiskLogger;->open(Landroid/content/Context;)Lcom/shopkick/app/application/SKDiskLogger;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/application/SKDiskLogger;)Z
    .locals 0

    .line 29
    iget-boolean p0, p0, Lcom/shopkick/app/application/SKDiskLogger;->disableHTTPS:Z

    return p0
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    .line 29
    sget-object v0, Lcom/shopkick/app/application/SKDiskLogger;->LOG_TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .line 29
    sget-object v0, Lcom/shopkick/app/application/SKDiskLogger;->database:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method

.method static synthetic access$300(Lcom/shopkick/app/application/SKDiskLogger;)I
    .locals 0

    .line 29
    iget p0, p0, Lcom/shopkick/app/application/SKDiskLogger;->batchSize:I

    return p0
.end method

.method public static saveToDisk(Ljava/util/Map;Landroid/content/Context;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 196
    sget-object v0, Lcom/shopkick/app/application/SKDiskLogger;->database:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 200
    new-instance v2, Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;

    invoke-direct {v2, p1}, Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;-><init>(Landroid/content/Context;)V

    .line 201
    invoke-virtual {v2}, Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    move-object v2, p1

    .line 204
    :goto_1
    sget-object v3, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v3, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 205
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    const-string/jumbo v4, "timestamp"

    .line 206
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v4, "data"

    .line 207
    invoke-virtual {v3, v4, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    .line 209
    sget-object p1, Lcom/shopkick/app/application/SKDiskLogger;->database:Landroid/database/sqlite/SQLiteDatabase;

    .line 210
    :cond_2
    invoke-virtual {p1, p2, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    if-nez v0, :cond_3

    .line 213
    invoke-virtual {v2}, Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;->close()V

    :cond_3
    return-void
.end method

.method public static setMockDatabase(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .line 191
    sput-object p0, Lcom/shopkick/app/application/SKDiskLogger;->database:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 255
    sget-object v0, Lcom/shopkick/app/application/SKDiskLogger;->databaseHelper:Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;

    invoke-virtual {v0}, Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;->close()V

    return-void
.end method

.method getTableState(Ljava/lang/String;)Lcom/shopkick/app/application/SKDiskLogger$TableState;
    .locals 1

    const-string/jumbo v0, "sklogs"

    if-ne p1, v0, :cond_0

    .line 231
    iget-object p1, p0, Lcom/shopkick/app/application/SKDiskLogger;->clientTableState:Lcom/shopkick/app/application/SKDiskLogger$TableState;

    return-object p1

    .line 233
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public open(Landroid/content/Context;)Lcom/shopkick/app/application/SKDiskLogger;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    .line 244
    sget-object v0, Lcom/shopkick/app/application/SKDiskLogger;->database:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_0

    .line 245
    new-instance v0, Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;

    invoke-direct {v0, p1}, Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/shopkick/app/application/SKDiskLogger;->databaseHelper:Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;

    .line 246
    sget-object p1, Lcom/shopkick/app/application/SKDiskLogger;->databaseHelper:Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;

    invoke-virtual {p1}, Lcom/shopkick/app/application/SKDiskLogger$DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    sput-object p1, Lcom/shopkick/app/application/SKDiskLogger;->database:Landroid/database/sqlite/SQLiteDatabase;

    :cond_0
    return-object p0
.end method

.method public saveToDisk(Ljava/lang/String;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 260
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v0, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 262
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string/jumbo v2, "timestamp"

    .line 263
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "data"

    .line 264
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    sget-object v0, Lcom/shopkick/app/application/SKDiskLogger;->database:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 269
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/SKDiskLogger;->getTableState(Ljava/lang/String;)Lcom/shopkick/app/application/SKDiskLogger$TableState;

    move-result-object p1

    .line 270
    iget-object v0, p1, Lcom/shopkick/app/application/SKDiskLogger$TableState;->inMemoryLogs:Ljava/util/List;

    monitor-enter v0

    .line 271
    :try_start_0
    iget-object p1, p1, Lcom/shopkick/app/application/SKDiskLogger$TableState;->inMemoryLogs:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 272
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method public setBatchSize(I)V
    .locals 0

    .line 293
    iput p1, p0, Lcom/shopkick/app/application/SKDiskLogger;->batchSize:I

    return-void
.end method

.method public uploadLogs(Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 278
    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/SKDiskLogger;->getTableState(Ljava/lang/String;)Lcom/shopkick/app/application/SKDiskLogger$TableState;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 281
    iget-object v0, p1, Lcom/shopkick/app/application/SKDiskLogger$TableState;->inMemoryLogs:Ljava/util/List;

    monitor-enter v0

    .line 282
    :try_start_0
    iget-object v1, p1, Lcom/shopkick/app/application/SKDiskLogger$TableState;->inMemoryLogs:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 283
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    :goto_0
    const/4 p2, 0x1

    .line 285
    iput-boolean p2, p1, Lcom/shopkick/app/application/SKDiskLogger$TableState;->shouldUpload:Z

    .line 286
    iget-object p2, p1, Lcom/shopkick/app/application/SKDiskLogger$TableState;->persistThread:Lcom/shopkick/app/application/SKDiskLogger$PersistThread;

    if-nez p2, :cond_1

    .line 287
    new-instance p2, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;

    invoke-direct {p2, p0, p1}, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;-><init>(Lcom/shopkick/app/application/SKDiskLogger;Lcom/shopkick/app/application/SKDiskLogger$TableState;)V

    iput-object p2, p1, Lcom/shopkick/app/application/SKDiskLogger$TableState;->persistThread:Lcom/shopkick/app/application/SKDiskLogger$PersistThread;

    .line 288
    iget-object p1, p1, Lcom/shopkick/app/application/SKDiskLogger$TableState;->persistThread:Lcom/shopkick/app/application/SKDiskLogger$PersistThread;

    invoke-virtual {p1}, Lcom/shopkick/app/application/SKDiskLogger$PersistThread;->start()V

    :cond_1
    return-void
.end method
